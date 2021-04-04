package com.park.vlifehp.vsnsrmain;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SNSDAO {

	@Autowired
	private SqlSession ss;
}
