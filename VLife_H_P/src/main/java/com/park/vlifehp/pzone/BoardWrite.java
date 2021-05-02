package com.park.vlifehp.pzone;

import java.math.BigDecimal;
import java.util.Date;

public class BoardWrite {
	private BigDecimal m_board_no;
	private Date m_board_when;
	private String m_id;
	private String m_board_title;
	private String m_board_text;
	
	public BoardWrite() {
		// TODO Auto-generated constructor stub
	}

	public BoardWrite(BigDecimal m_board_no, Date m_board_when, String m_id, String m_board_title,
			String m_board_text) {
		super();
		this.m_board_no = m_board_no;
		this.m_board_when = m_board_when;
		this.m_id = m_id;
		this.m_board_title = m_board_title;
		this.m_board_text = m_board_text;
	}

	public BigDecimal getM_board_no() {
		return m_board_no;
	}

	public void setM_board_no(BigDecimal m_board_no) {
		this.m_board_no = m_board_no;
	}

	public Date getM_board_when() {
		return m_board_when;
	}

	public void setM_board_when(Date m_board_when) {
		this.m_board_when = m_board_when;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_board_title() {
		return m_board_title;
	}

	public void setM_board_title(String m_board_title) {
		this.m_board_title = m_board_title;
	}

	public String getM_board_text() {
		return m_board_text;
	}

	public void setM_board_text(String m_board_text) {
		this.m_board_text = m_board_text;
	}
	
	
	
}
