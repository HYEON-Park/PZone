package com.park.vlifehp.regmain;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardDAO {

	@Autowired
	private SqlSession ss;
	
	
}
