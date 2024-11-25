package com.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zerock.dto.BoardVO;
import com.zerock.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@RequiredArgsConstructor
public class BoardServiceImple implements BoardService {

	private final BoardMapper mapper;
	
	@Override
	public void register(BoardVO vo) {
		mapper.insertSelectKey(vo);
	}

	@Override
	public BoardVO get(Long bno) {
		log.info("get......");
		
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO vo) {
		log.info("modify........");
		
		return mapper.update(vo) == 1;
	}

	@Override
	public boolean remove(Long bno) {
		log.info("remove.....");
		
		return mapper.delete(bno) == 1 ;
	}

	@Override
	public List<BoardVO> getList() {
		return mapper.getList();
	}

}
