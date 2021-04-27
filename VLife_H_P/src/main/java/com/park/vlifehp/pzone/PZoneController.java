package com.park.vlifehp.pzone;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.park.vlifehp.profilemain.ProDAO;
import com.park.vlifehp.vlifemain.MemberDAO;
import com.park.vlifehp.vlifemain.VMember;

@Controller
public class PZoneController {

	@Autowired
	private ProDAO pDAO;
	@Autowired
	private MemberDAO mDAO;
	@Autowired
	private BoardDAO bDAO;

	@RequestMapping(value = "/pzone.go", method = RequestMethod.GET)
	public String pzonehome(HttpServletRequest req, VMember m) {
		// mDAO.memberLogin(req, m);
		bDAO.boardGet(req);
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/pzonehome.jsp");
			// 로그인체크에 걸려서(해당아이디가 있으면)다음반응 주삼
		} else {
			req.setAttribute("loginPage", "member/login.jsp");
			req.setAttribute("contentPage", "home.jsp");
			// 로그인 안됐을 때
		}
		return "index";

	}

	@RequestMapping(value = "/pzone.board.go", method = RequestMethod.GET)
	public String pzoneBoard(VMember m, HttpServletRequest req) {
		bDAO.boardGet(req);
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/pzoneBoard.jsp");
			// 로그인체크에 걸려서(해당아이디가 있으면)다음반응 주삼
		} else {
			req.setAttribute("loginPage", "member/login.jsp");
			req.setAttribute("contentPage", "home.jsp");
			// 로그인 안됐을 때
		}

		return "index";

	}

	@RequestMapping(value = "/pzone.write.go", method = RequestMethod.POST)
	public String pzoneBoardWrite(BoardWrite bw, VMember m, HttpServletRequest req) {
		mDAO.memberLogin(req, m);
		bDAO.boardWrite(req, bw);
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/pzonehome.jsp");
			// 로그인체크에 걸려서(해당아이디가 있으면)다음반응 주삼
		} else {
			req.setAttribute("loginPage", "member/login.jsp");
			req.setAttribute("contentPage", "home.jsp");
			// 로그인 안됐을 때
		}

		return "index";

	}

	@RequestMapping(value = "/pzone.info.go", method = RequestMethod.GET)
	public String pzoneBoardinfo(BoardWrite bw, VMember m, HttpServletRequest req) {
		mDAO.memberLogin(req, m);
		bDAO.boardInfo(req, bw);
		System.out.println(bw);
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/pzonePBInfo.jsp");
			// 로그인체크에 걸려서(해당아이디가 있으면)다음반응 주삼
		} else {

			req.setAttribute("loginPage", "member/login.jsp");
			req.setAttribute("contentPage", "home.jsp");
			// 로그인 안됐을 때
		}

		return "index";

	}

	@RequestMapping(value = "/pzone.modify.go", method = RequestMethod.GET)
	public String pzoneBoardinfo2(BoardWrite bw, VMember m, HttpServletRequest req) {
		mDAO.memberLogin(req, m);
		bDAO.boardInfo(req, bw);
		System.out.println(bw);
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/pzonePBInfo2.jsp");
			// 로그인체크에 걸려서(해당아이디가 있으면)다음반응 주삼
		} else {

			req.setAttribute("loginPage", "member/login.jsp");
			req.setAttribute("contentPage", "home.jsp");
			// 로그인 안됐을 때
		}

		return "index";

	}

	@RequestMapping(value = "/board.update.go", method = RequestMethod.GET)
	public String pzoneBoardUpdate(BoardWrite bw, VMember m, HttpServletRequest req) {
		mDAO.memberLogin(req, m);
		bDAO.boardWrite(req, bw);
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/pzonehome.jsp");
			// 로그인체크에 걸려서(해당아이디가 있으면)다음반응 주삼
		} else {
			req.setAttribute("loginPage", "member/login.jsp");
			req.setAttribute("contentPage", "home.jsp");
			// 로그인 안됐을 때
		}

		return "index";

	}
	/*
	 * @RequestMapping(value = "/board.delete.go", method = RequestMethod.GET)
	 * public String pzoneBoardDelete(BoardWrite bw, VMember m,HttpServletRequest
	 * req) { mDAO.memberLogin(req, m); bDAO.boardDelete(req); bDAO.boardWrite(req,
	 * bw); if (mDAO.loginCheck(req)) { req.setAttribute("contentPage",
	 * "category/pzonehome.jsp"); //로그인체크에 걸려서(해당아이디가 있으면)다음반응 주삼 } else {
	 * req.setAttribute("loginPage", "member/login.jsp");
	 * req.setAttribute("contentPage", "home.jsp"); //로그인 안됐을 때 }
	 * 
	 * return "index";
	 * 
	 * }
	 */

}
