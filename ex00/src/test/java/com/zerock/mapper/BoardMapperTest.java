package com.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zerock.dto.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {

	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(list-> log.info(list));
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		
		board.setTitle("���test");
		board.setContent("���test");
		board.setWriter("���test");
		
		mapper.insertSelectKey(board);
	}
	
	@Test
	public void testRead() {
		Long bno = 2L;
		
		BoardVO boardVO = mapper.read(bno);
		log.info(boardVO);
	}
	
	@Test
	public void testDelete() {

		int result = mapper.delete(6L);
		
		log.info("result : " + result);
	}
	
	@Test
	public void testUpdate() {
		
		Long bno = 5L;
		BoardVO vo = mapper.read(bno);
		
		vo.setTitle("����test");
		vo.setContent("����test");
		vo.setWriter("����test");
		
		int result = mapper.update(vo);
		log.info(result);
		
		
	}
}