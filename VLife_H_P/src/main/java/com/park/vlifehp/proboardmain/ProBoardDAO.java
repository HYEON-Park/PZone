package com.park.vlifehp.proboardmain;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProBoardDAO {

	@Autowired
	private SqlSession ss;
	
	
}
