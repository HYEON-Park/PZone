package com.park.vlifehp.vsnsrmain;

import java.net.URLEncoder;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.park.vlifehp.vlifemain.VMember;

@Service
public class SNSDAO {
	private int allMsgCount;
	private String[] colors;

	@Autowired
	private SqlSession ss;


	public SNSDAO() {
		colors = new String[] { "#B2CCFF", "#B5B2FF", "#D1B2FF", "#B2EBF4", "#B7F0B1", "#BCE55C" };
	}
	
	public void countAllMsg() {
		allMsgCount = ss.getMapper(SNSMapper.class).getAllMsgCount();
	}
	

	public void snsWrite(SNSWrite sw, HttpServletRequest req) {
		
		try {
			
			String path = req.getSession().getServletContext().getRealPath("resources/img");
			System.out.println(path);

			MultipartRequest mr = new MultipartRequest(req, // 원래 요청객체
					path, // 경로
					10485760, // 실행되는 서버상 파일업로드 폴더의 절대경로
					"utf-8", // POST방식 요청파라메터 한글처리
					new DefaultFileRenamePolicy()); // 중복처리
			//insert into vzone_sns values(vzone_sns_seq.nextval, #{m_id}, #{m_sns_title}, 
			//#{m_sns_photo}, #{m_sns_txt}, #{m_sns_explain}, sysdate, #{m_sns_color})
			String token = req.getParameter("token"); // 토큰 받아오기
			
			String st2 = (String) req.getSession().getAttribute("st"); // 토큰
			
			if (st2 != null && token.equals(st2)) {
				req.setAttribute("r", "글쓰기실패(새로고침)");
				return;
			}
			//사진 넣는거라 다 겟파라메터로 받아와야함
			VMember m = (VMember) req.getSession().getAttribute("loginMember");
			sw.setM_id(m.getM_id()); //세션에서 가져오는거라
			
			//System.out.println(m.getM_id());
	
			
			
			sw.setM_sns_title(mr.getParameter("m_sns_title"));
			System.out.println(sw.getM_sns_title());
			sw.setM_sns_txt(mr.getParameter("m_sns_txt"));
			sw.setM_sns_explain(mr.getParameter("m_sns_explain"));
			System.out.println(sw.getM_sns_explain());
			
			String m_sns_photo = mr.getFilesystemName("m_sns_photo");
			String m_sns_photoK = URLEncoder.encode(m_sns_photo, "utf-8").replace("+", " "); // 톰캣이 한글명파일 인식 못해서(%5A+$5A2.png)
			sw.setM_sns_photo(m_sns_photoK);
			
			sw.setM_sns_color(colors[new Random().nextInt(colors.length)]);
			
			/*//아이디
			VMember m = (VMember) req.getSession().getAttribute("loginMember");
			sw.setM_id(m.getM_id());
			System.out.println(m.getM_id());
			//타이틀
			String title = sw.getM_sns_title(); //가져와서 >엔코딩>지정하기
			title = title.replace("\r\n", "<br>");
			sw.setM_sns_title(title);
			System.out.println(title);
			//사진
			String m_sns_photo = mr.getFilesystemName("m_sns_photo");
			String m_sns_photoK = URLEncoder.encode(m_sns_photo,"utf-8").replace("+", " ");
			sw.setM_sns_photo(m_sns_photoK);
			//텍스트
			String txt = sw.getM_sns_txt(); //가져와서 >엔코딩>지정하기
			txt = txt.replace("\r\n", "<br>");
			sw.setM_sns_txt(txt);
			//설명
			String explain = sw.getM_sns_explain(); //가져와서 >엔코딩>지정하기
			explain = explain.replace("\r\n", "<br>");
			sw.setM_sns_explain(explain);
			
			sw.setM_sns_color(colors[new Random().nextInt(colors.length)]);
			*/
			
			if (ss.getMapper(SNSMapper.class).snsWrite(sw) == 1) {
				System.out.println("ㅇㅇ");
				req.setAttribute("r","글작성완료");
			} else {
				System.out.println("ㄴㄴ");
				req.setAttribute("r","글작성오류");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r","글작성 오류");
			
			
		}
	}
	
	public void snsGet(HttpServletRequest req) {
		try {
		List<SNSWrite> snsw = ss.getMapper(SNSMapper.class).snsGet();
		req.setAttribute("snsw", snsw);
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "ㄴㄴㄴ");
		}
		
	}
	
	
	/*
	public void snsGet(HttpServletRequest req, int page) {
		
		req.setAttribute("curPage", page);

		String search = (String) req.getSession().getAttribute("search");
		int msgCount = 0;
		if (search == null) {
			msgCount = allMsgCount;
			search = "";
		} else {
			SNSSelector sSel2 = new SNSSelector(search, 0, 0);
			msgCount = ss.getMapper(SNSMapper.class).getSearchMsgCount(sSel2);
		}
		int allPageCount = (int) Math.ceil((double) msgCount / so.getSnsMsgPerPage());
		req.setAttribute("allPageCount", allPageCount);

		int start = (page - 1) * so.getSnsMsgPerPage() + 1;
		int end = (page == allPageCount) ? msgCount : start + so.getSnsMsgPerPage() - 1;

		SNSSelector sSel = new SNSSelector(search, start, end);
		List<SNSWrite> snsw = ss.getMapper(SNSMapper.class).getMsg(sSel);

		req.setAttribute("snsw", snsw);
		
		
		
	}*/

}
