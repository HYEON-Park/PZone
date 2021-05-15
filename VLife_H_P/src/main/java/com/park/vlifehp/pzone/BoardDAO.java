package com.park.vlifehp.pzone;

import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.park.vlifehp.vlifemain.VMember;

@Service
public class BoardDAO {

	@Autowired
	private SqlSession ss;

	public void boardWrite(HttpServletRequest req, BoardWrite bw) {

		try {

			String token = req.getParameter("token");

			String st2 = (String) req.getSession().getAttribute("st"); // 토큰

			if (st2 != null && token.equals(st2)) {
				req.setAttribute("r", "글쓰기실패(새로고침)");
				return;
			}

			VMember m = (VMember) req.getSession().getAttribute("loginMember");
			bw.setM_id(m.getM_id());
//			System.out.println(m.getM_id());
//			System.out.println(bw.getM_id());
			bw.setM_board_title(bw.getM_board_title());
			bw.setM_board_text(bw.getM_board_text());

			if (ss.getMapper(PBoardMapper.class).boardWrite(bw) == 1) {
				System.out.println("ㅇㅇ");
				req.setAttribute("r", "글작성완료");
			} else {
				System.out.println("ㄴㄴ");
				req.setAttribute("r", "글작성오류");
			}

		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "글작성오류2");
		}
	}

	public void boardGet(HttpServletRequest req) {
		try {
			List<BoardWrite> bws = ss.getMapper(PBoardMapper.class).boardGet();
			req.setAttribute("bws", bws);
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "ㄴㄴㄴ");
		}

	}

	public void boardInfo(HttpServletRequest req, BoardWrite cbw) {

		try {

			List<BoardWrite> b2 = ss.getMapper(PBoardMapper.class).boardInfo(cbw);
			if (b2.size() != 0) {
				BoardWrite mbw = b2.get(0);
				if (mbw.getM_board_no().equals(cbw.getM_board_no())) {
					req.setAttribute("b2", b2);
					}
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("nope2");

		}

	}
/*
	public void boardDelete(HttpServletRequest req, BoardWrite bw) {

		try {

//			BoardWrite bw = (BoardWrite) req.getSession().getAttribute("writeNO");
//			int no = Integer.parseInt(req.getParameter("bw.getM_board_no"));
//			System.out.println(bw);
//			System.out.println(no);
//			BoardWrite nbw = new BoardWrite(new BigDecimal(no), null, null, null, null);
//			
//			
//			if (ss.getMapper(PBoardMapper.class).boardDelete(nbw) == 1) {
//				req.setAttribute("bw", nbw);
//			}
			
			List<BoardWrite> b2 = ss.getMapper(PBoardMapper.class).boardDelete();
			if (b2.size() != 0) {
				BoardWrite mbw = b2.get(0);
				if (mbw.getM_board_no().equals(bw.getM_board_no())) {
					req.setAttribute("b2", b2);
					}
			}

		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("r", "nope4");
		}

	}

	public void boardUpdate(HttpServletRequest req, BoardWrite bw) {

		try {
//			VMember m = (VMember) req.getSession().getAttribute("loginMember");
//			bw.setM_id(m.getM_id());
//			System.out.println(bw.getM_id());
//			System.out.println("--");

			
			int no = Integer.parseInt(req.getParameter("m_board_no"));
			String ti = req.getParameter(bw.getM_board_title());
			String tx = req.getParameter(bw.getM_board_text());
			System.out.println(no);
			System.out.println(ti);
			System.out.println(tx);

			BoardWrite nbw = new BoardWrite(new BigDecimal(no), null, null, ti, tx);

			System.out.println(no);
			System.out.println(ti);
			System.out.println(tx);

			if (ss.getMapper(PBoardMapper.class).boardUpdate(nbw) == 1) {
				System.out.println("ㅇㅇ");
				req.setAttribute("r", "업데이트완료");
			} else {
				System.out.println("ㄴㄴ");
				req.setAttribute("r", "업데이트오류");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("nope3");

		}

	}*/

}
