package com.park.vlifehp.vlifemain;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

	@Autowired
	private MemberDAO mDAO;

//	로긴에서 조인으로 가는거  //이거 js 설정	
	@RequestMapping(value = "/member.join.go", method = RequestMethod.GET)
	public String memberJoinGo(VMember m, HttpServletRequest req) {
		req.setAttribute("loginPage", "member/join.jsp");
		req.setAttribute("contentPage", "home.jsp");
		return "index";
	}

	// 조인시 아이디 중복체크
	@RequestMapping(value = "/member.search.go", method = RequestMethod.GET, 
			produces = "application/json; charset=utf-8")
	public @ResponseBody VMembers memberSearch(VMember m) {
		return mDAO.memberSearch(m);
	}

//	 조인에서 가는거 , form, 조인이 file 있으니까 post
	@RequestMapping(value = "/member.join", method = RequestMethod.POST)
	public String memberJoin(HttpServletRequest req, VMember m) {
		mDAO.joinGO(m, req);
		mDAO.loginCheck(req);
		req.setAttribute("contentPage", "category/pzonehome.jsp");
		return "index";
	}
	
	//로그인하면 들어가는 홈
	@RequestMapping(value = "/member.loginhomego", method = RequestMethod.POST)
	public String memberpzHome(HttpServletRequest req, VMember m) {
		mDAO.memberLogin(req, m);
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/pzonehome.jsp"); //홈에있는거
		} else {
			req.setAttribute("loginPage", "member/login.jsp");
			req.setAttribute("contentPage", "home.jsp");
		}
		return "index";
	}
	
	@RequestMapping(value = "/member.info.go", method = RequestMethod.GET)
	public String memberinfo(HttpServletRequest req, VMember m) {
		mDAO.memberLogin(req, m);
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "member/memInformation.jsp"); //홈에있는거
		} else {
			req.setAttribute("loginPage", "member/login.jsp");
			req.setAttribute("contentPage", "home.jsp");
		}
		return "index";
	}

}
