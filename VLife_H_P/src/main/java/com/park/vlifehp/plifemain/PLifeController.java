package com.park.vlifehp.plifemain;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.park.vlifehp.vlifemain.MemberDAO;
import com.park.vlifehp.vlifemain.VMember;

@Controller
public class PLifeController {

	@Autowired
	private MemberDAO mDAO;
	
	@RequestMapping(value = "/plife.go", method = RequestMethod.GET)
	public String plifeGo(VMember m, HttpServletRequest req) {
		mDAO.memberLogin(req, m);
		req.setAttribute("contentPage", "category/plife.jsp");
		if (mDAO.loginCheck(req)) {
			req.setAttribute("contentPage", "category/plife.jsp");
			//로그인체크에 걸려서(해당아이디가 있으면)다음반응 주삼
		} else {
			req.setAttribute("contentPage", "category/home.jsp");
			 //로그인 안됐을 때
		}
		return "index";
	}
	
}
