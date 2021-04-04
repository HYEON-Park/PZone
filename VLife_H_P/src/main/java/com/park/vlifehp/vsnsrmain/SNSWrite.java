package com.park.vlifehp.vsnsrmain;

import java.math.BigDecimal;

public class SNSWrite {
	private BigDecimal m_sns_no;
	private String m_sns_writer;
	private String m_sns_title;
	private String m_sns_tst;
	private String m_sns_explain;
	private BigDecimal m_sns_when;
	private String m_sns_color;
	
	public SNSWrite() {
		// TODO Auto-generated constructor stub
	}

	public SNSWrite(BigDecimal m_sns_no, String m_sns_writer, String m_sns_title, String m_sns_tst,
			String m_sns_explain, BigDecimal m_sns_when, String m_sns_color) {
		super();
		this.m_sns_no = m_sns_no;
		this.m_sns_writer = m_sns_writer;
		this.m_sns_title = m_sns_title;
		this.m_sns_tst = m_sns_tst;
		this.m_sns_explain = m_sns_explain;
		this.m_sns_when = m_sns_when;
		this.m_sns_color = m_sns_color;
	}

	public BigDecimal getM_sns_no() {
		return m_sns_no;
	}

	public void setM_sns_no(BigDecimal m_sns_no) {
		this.m_sns_no = m_sns_no;
	}

	public String getM_sns_writer() {
		return m_sns_writer;
	}

	public void setM_sns_writer(String m_sns_writer) {
		this.m_sns_writer = m_sns_writer;
	}

	public String getM_sns_title() {
		return m_sns_title;
	}

	public void setM_sns_title(String m_sns_title) {
		this.m_sns_title = m_sns_title;
	}

	public String getM_sns_tst() {
		return m_sns_tst;
	}

	public void setM_sns_tst(String m_sns_tst) {
		this.m_sns_tst = m_sns_tst;
	}

	public String getM_sns_explain() {
		return m_sns_explain;
	}

	public void setM_sns_explain(String m_sns_explain) {
		this.m_sns_explain = m_sns_explain;
	}

	public BigDecimal getM_sns_when() {
		return m_sns_when;
	}

	public void setM_sns_when(BigDecimal m_sns_when) {
		this.m_sns_when = m_sns_when;
	}

	public String getM_sns_color() {
		return m_sns_color;
	}

	public void setM_sns_color(String m_sns_color) {
		this.m_sns_color = m_sns_color;
	}
	
	
}
