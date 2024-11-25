package com.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.zerock.dto.BoardVO;

public interface BoardMapper {

	public List<BoardVO> getList();
	
	public void insert(BoardVO boardVO);

	public void insertSelectKey(BoardVO vo);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO boardVO);
	
	
}
