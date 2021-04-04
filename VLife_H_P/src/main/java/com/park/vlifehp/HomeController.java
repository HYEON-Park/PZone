package com.park.vlifehp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.park.vlifehp.vlifemain.MemberDAO;

@Controller
public class HomeController {
	
	
	@Autowired
	private MemberDAO mDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		req.setAttribute("loginPage", "member/login.jsp");
		req.setAttribute("contentPage", "home.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/index.go", method = RequestMethod.GET)
	public String home2(HttpServletRequest req) {
		//스프링은 이동 방법이 달라져서 다른 페이지로 갈 수 있기 떄문에 인덱스 안에서 돌 수 있게 연결
		
		return home(req);//상단 홈으로 가게끔
	}
	
}



//멤버로그인 DAO에서 왜 m2.get(0); 이 부분 뭐삼? inputm으로 임시변수 처리?????
//로그인해서 들어갔는데 왜 홈에 암것도 안뜨는지,,,
