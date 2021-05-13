package com.park.vlifehp.pzone;

import java.util.List;

public interface PBoardMapper {
	public abstract int boardWrite(BoardWrite bw);
	public abstract List<BoardWrite> boardGet();
	public abstract List<BoardWrite> boardInfo(BoardWrite bw);
	public abstract int boardUpdate(BoardWrite bw);
	public abstract List<BoardWrite> boardDelete();
	
}
