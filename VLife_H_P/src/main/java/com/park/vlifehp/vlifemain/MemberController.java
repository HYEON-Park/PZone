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
	@RequestMapping(value="/member.join.go", method= RequestMethod.GET)
	public String memberJoinGo(VMember m,HttpServletRequest req){
		req.setAttribute("loginPage", "member/join.jsp");
		//req.setAttribute("contentPage", "member/join.jsp");
		return "index";
	}
	
	//조인시 아이디 중복체크
	@RequestMapping(value="/member.search.go", method= RequestMethod.GET,
			produces="application/json; charset=utf-8")
	public @ResponseBody VMembers memberSearch(VMember m){
		return mDAO.memberSearch(m);
	}
	
//	 조인에서 가는거 , form, 조인이 file 있으니까 post
	@RequestMapping(value="/member.join", method= RequestMethod.POST)
	public String memberJoin(HttpServletRequest req, VMember m){
		mDAO.joinGO(m, req);
		if (mDAO.loginCheck(req)) {
			req.setAttribute("loginPage", "member/login.jsp"); //홈에있는거
		} else {
			req.setAttribute("loginPage", "member/join.jsp");
		}
//		req.setAttribute("contentPage", "index.jsp"); //조인에서 성공이면 ㄱㄱ
		return "index";
	}
	//조인에서 걸리면 r로 반응 조인에서 받고
	//조인에서 가입되면 로그인페이지=> 
	//로그인 연결해서 들어가는지 확인
	//로그인성공시를피존홈으로 

	
	@RequestMapping(value="/member.login.homego", method= RequestMethod.GET)
	public String memberpzHome(HttpServletRequest req, HttpServletResponse res, VMember m){
		mDAO.memberLogin(req, res, m);
		
		req.setAttribute("loginPage", "category/pzonehome.jsp");
		return "index";
	}

}
