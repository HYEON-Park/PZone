package com.park.vlifehp.profilemain;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProDAO {

	@Autowired
	private SqlSession ss;
	
	
}
