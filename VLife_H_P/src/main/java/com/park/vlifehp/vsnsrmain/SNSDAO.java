package com.park.vlifehp.vsnsrmain;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.park.vlifehp.vlifemain.VMember;

@Service
public class SNSDAO {
	private String[] colors;
	
	@Autowired
	private SqlSession ss;
	
	
	
	public SNSDAO() {
		colors = new String[] { "#B2CCFF", "#B5B2FF", "#D1B2FF", "#B2EBF4", "#B7F0B1", "#BCE55C" };
	}
	
	public void snsWrite(SNSWrite sw, HttpServletRequest req) {
		try {
			//insert into vzone_sns values(vzone_sns_seq, #{m_id}, #{m_sns_title}, #{m_sns_txt}, 
			//#{m_sns_explain}, sysdate, #{m_sns_color})
			
			String token = req.getParameter("token"); // 토큰 받아오기

			
			String st2 = (String) req.getSession().getAttribute("st"); // 세션
			
			VMember m = (VMember) req.getSession().getAttribute("loginMember");
			sw.setM_id(m.getM_id());
			sw.setM_sns_color(colors[new Random().nextInt(colors.length)]);
			
			String txt = sw.getM_sns_txt(); //가져와서 >엔코딩>지정하기
			txt = txt.replace("\r\n", "<br>");
			sw.setM_sns_txt(txt);
			
			String title = sw.getM_sns_title(); //가져와서 >엔코딩>지정하기
			title = title.replace("\r\n", "<br>");
			sw.setM_sns_title(title);

			String explain = sw.getM_sns_explain(); //가져와서 >엔코딩>지정하기
			explain = explain.replace("\r\n", "<br>");
			sw.setM_sns_explain(explain);
			
			if (ss.getMapper(SNSMapper.class).snsWrite(sw) == 1) {
				req.setAttribute("r","글작성완료");
			} else {
				req.setAttribute("r","글작성오류");
			}
			
		} catch (Exception e) {
			req.setAttribute("r","글작성 오류");
			
			
		}
	}
	
}
