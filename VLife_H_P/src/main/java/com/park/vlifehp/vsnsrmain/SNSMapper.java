package com.park.vlifehp.vsnsrmain;

import java.util.List;

public interface SNSMapper {
	public abstract int snsWrite(SNSWrite sw);
	public abstract List<SNSWrite> snsGet();
	public abstract int getAllMsgCount();
	
}
