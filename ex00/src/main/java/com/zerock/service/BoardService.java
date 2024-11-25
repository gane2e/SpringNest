package com.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zerock.dto.BoardVO;

@Service //--> 서비스등록필수
public interface BoardService {
	
	public void register(BoardVO vo);
	
	public BoardVO get(Long bno);
	
	public boolean modify(BoardVO vo);
	
	public boolean remove(Long bno);
	
	public List<BoardVO> getList();

}
