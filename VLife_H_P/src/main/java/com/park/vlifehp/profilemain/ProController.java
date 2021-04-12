package com.park.vlifehp.profilemain;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.park.vlifehp.vlifemain.MemberDAO;
import com.park.vlifehp.vlifemain.VMember;

@Controller
public class ProController {

	@Autowired
	private ProDAO pDAO;
	@Autowired
	private MemberDAO mDAO;
	
	@RequestMapping(value = "/profile.go", method = RequestMethod.GET)
	public String profilehome(HttpServletRequest req, VMember m) {
		//mDAO.memberLogin(req, m);
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/profile.jsp"); 
			//로그인체크에 걸려서(해당아이디가 있으면)다음반응 주삼
		} else {
			req.setAttribute("loginPage", "member/login.jsp");
			req.setAttribute("contentPage", "home.jsp");
			 //로그인 안됐을 때
		}
		return "index";
		
	}
	
	
}
