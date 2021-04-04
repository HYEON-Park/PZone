package com.park.vlifehp.vsnsrmain;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.park.vlifehp.vlifemain.MemberDAO;

@Controller
public class SNSController {

	@Autowired
	private MemberDAO mDAO;
	
	@Autowired
	private SNSDAO sDAO;

	@RequestMapping(value = "/vlifesns.go", method = RequestMethod.GET)
	public String vlifeSns(HttpServletRequest req) {
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "home.jsp"); //홈에있는거
			} 
			req.setAttribute("contentPage", "category/vlife.jsp");
		
		return "index";
	}
	
}
