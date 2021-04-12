package com.park.vlifehp.vlifemain;

import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.parsing.GenericTokenParser;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

// servlet-context.xml에 등록 해주는 것과 같은 효과
@Service
public class MemberDAO {
//Spring  : .java 에 안하고 다른파일에 객체 만들기
//			ervlet-context.xml에 MemberDAO (9번)등록 해주는 것과 같은 효과

	// servlet-context.xml 등록한거 가져오기
	@Autowired
	private SqlSession ss;

	public void joinGO(VMember m, HttpServletRequest req) {

		try {
			String path = req.getSession().getServletContext().getRealPath("resources/img");
			System.out.println(path);

			MultipartRequest mr = new MultipartRequest(req, // 원래 요청객체
					path, // 경로
					10485760, // 실행되는 서버상 파일업로드 폴더의 절대경로
					"utf-8", // POST방식 요청파라메터 한글처리
					new DefaultFileRenamePolicy()); // 중복처리

			m.setM_id(mr.getParameter("m_id"));
			m.setM_pw(mr.getParameter("m_pw"));
			m.setM_name(mr.getParameter("m_name"));
			m.setM_role(mr.getParameter("m_role"));

			String m_photo = mr.getFilesystemName("m_photo"); // 중복처리 된 서버상의 실제 파일명(ㅋ ㅋ 2.png)
			String m_photoK = URLEncoder.encode(m_photo, "utf-8").replace("+", " "); // 톰캣이 한글명파일 인식 못해서(%5A+$5A2.png)
			m.setM_photo(m_photoK);

			String m_addr1 = mr.getParameter("m_addr1"); // 우편번호조회
			String m_addr2 = mr.getParameter("m_addr2"); // 서울시
			String m_addr3 = mr.getParameter("m_addr3"); // 아파트
			String m_addr = m_addr2 + "!" + m_addr3 + "!" + m_addr1; // 구분선 스플릿, 분리할 수 있음 숫자는 겹칠 위험, 붙으면 알 수 없
			m.setM_addr(m_addr);

			if (ss.getMapper(VlifeMapper.class).joinGo(m) == 1) {
				req.setAttribute("r", "가입성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "가입이 실패했습니다");

		}

	}

	public VMembers memberSearch(VMember m) {
		return new VMembers(ss.getMapper(VlifeMapper.class).memberSearch(m));
	}

	// 멤버인게 0값이 아니면 로그인 됐으면 홈에
	public boolean loginCheck(HttpServletRequest req) {
		VMember m = (VMember) req.getSession().getAttribute("loginMember");
		if (m != null) {
			req.setAttribute("loginPage", "indexHidden.jsp");// 로그인성공시
			return true;
		}
		req.setAttribute("loginPage", "member/login.jsp");// 로그인 미성공시
		return false;
	}

	public void memberLogin(HttpServletRequest req, VMember inm) {

		try {
			List<VMember> m2 = ss.getMapper(VlifeMapper.class).memberSearch(inm); // 새로운 객체, 매퍼 가져와서 아이디체크한
			if (m2.size() != 0) { // 가져온 상태
				System.out.println("회원임");
				
				VMember mpw = m2.get(0); //List 0번 
				if (mpw.getM_pw().equals(inm.getM_pw())) {
					req.getSession().setAttribute("loginMember", mpw);
					System.out.println("아뒤,비번 일치 성공");

				} else {
					System.out.println("비번 ㄴㄴ");
					req.setAttribute("r", "비밀번호를 다시 확인하세요");
				}
			} else {
				req.setAttribute("r", "아이디를 다시 확인하세요");
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "로그인실패 /DB");
		}
	}

}
