package com.park.vlifehp.vlifemain;

import java.util.List;

public interface VlifeMapper {

	public abstract int joinGo(VMember m);
	public abstract  List<VMember> memberSearch(VMember m);
	public abstract  List<VMember> memberLogin(VMember m);
	
}
