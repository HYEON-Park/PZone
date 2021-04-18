package com.park.vlifehp.vsnsrmain;

import java.math.BigDecimal;
import java.util.Date;

public class SNSWrite {
	private String m_id;
	
	private String m_sns_title;
	private String m_sns_photo;
	private String m_sns_txt;
	private String m_sns_explain;
	private Date m_sns_when;
	private String m_sns_color;
	
	public SNSWrite() {
		// TODO Auto-generated constructor stub
	}

	public SNSWrite(String m_id, String m_sns_title, String m_sns_photo, String m_sns_txt, String m_sns_explain,
			Date m_sns_when, String m_sns_color) {
		super();
		this.m_id = m_id;
		this.m_sns_title = m_sns_title;
		this.m_sns_photo = m_sns_photo;
		this.m_sns_txt = m_sns_txt;
		this.m_sns_explain = m_sns_explain;
		this.m_sns_when = m_sns_when;
		this.m_sns_color = m_sns_color;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_sns_title() {
		return m_sns_title;
	}

	public void setM_sns_title(String m_sns_title) {
		this.m_sns_title = m_sns_title;
	}

	public String getM_sns_photo() {
		return m_sns_photo;
	}

	public void setM_sns_photo(String m_sns_photo) {
		this.m_sns_photo = m_sns_photo;
	}

	public String getM_sns_txt() {
		return m_sns_txt;
	}

	public void setM_sns_txt(String m_sns_txt) {
		this.m_sns_txt = m_sns_txt;
	}

	public String getM_sns_explain() {
		return m_sns_explain;
	}

	public void setM_sns_explain(String m_sns_explain) {
		this.m_sns_explain = m_sns_explain;
	}

	public Date getM_sns_when() {
		return m_sns_when;
	}

	public void setM_sns_when(Date m_sns_when) {
		this.m_sns_when = m_sns_when;
	}

	public String getM_sns_color() {
		return m_sns_color;
	}

	public void setM_sns_color(String m_sns_color) {
		this.m_sns_color = m_sns_color;
	}
	
	
	
}