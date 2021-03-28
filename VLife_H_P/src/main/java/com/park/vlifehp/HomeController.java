package com.park.vlifehp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req) {
		req.setAttribute("loginPage", "member/login.jsp");
		req.setAttribute("contentPage", "home.jsp");
		return "index";
	}
	
	@RequestMapping(value = "/index.go", method = RequestMethod.GET)
	public String home2(HttpServletRequest req) {
		//스프링은 이동 방법이 달라져서 다른 페이지로 갈 수 있기 떄문에 인덱스 안에서 돌 수 있게 연결
		
		//상단 홈으로 가게끔
		return home(req);
	}
	
}
