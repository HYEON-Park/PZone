package com.park.vlifehp.vsnsrmain;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.park.vlifehp.vlifemain.MemberDAO;
import com.park.vlifehp.vlifemain.VMember;

@Controller
public class SNSController {

	@Autowired
	private MemberDAO mDAO;
	
	@Autowired
	private SNSDAO sDAO;
	
	// 폼ㄴㄴ a태그 
	@RequestMapping(value = "/vlifesns.go", method = RequestMethod.GET)
	public String goSNS(HttpServletRequest req, VMember m) {
		sDAO.snsGet(req);
		req.setAttribute("contentPage", "category/vlife.jsp");
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/vlife.jsp"); // 로그인 체크에 해당  = 로그인멤버가 아닌게 아닐시 
			} else {
				req.setAttribute("contentPage", "home.jsp"); // ㄴㄴ일시				
			}
		return "index";
	}

	
	@RequestMapping(value = "/vlifesns.write", method = RequestMethod.POST)
	public String writeSNS(HttpServletRequest req, VMember m, SNSWrite sw) {
		mDAO.memberLogin(req, m);
		sDAO.snsWrite(sw, req);
		sDAO.snsGet(req);
		req.setAttribute("contentPage", "category/vlife.jsp");
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/vlife.jsp"); // 로그인 체크에 해당  = 로그인멤버가 아닌게 아닐시
		} else {
			req.setAttribute("contentPage", "home.jsp"); // ㄴㄴ일시				
		}
		return "index";
	}
	
	/*
	@RequestMapping(value = "/vlifesns.get", method = RequestMethod.GET)
	public String getSNS(HttpServletRequest req) {
		sDAO.snsGet(req);
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/vlife.jsp"); // 로그인 체크에 해당  = 로그인멤버가 아닌게 아닐시
		} else {
			req.setAttribute("contentPage", "home.jsp"); // ㄴㄴ일시				
		}
		return "index";
	}*/
	
}
