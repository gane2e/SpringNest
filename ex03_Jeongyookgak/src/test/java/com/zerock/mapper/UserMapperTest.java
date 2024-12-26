package com.zerock.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zerock.dto.UserVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class UserMapperTest {

	@Autowired
	private UserMapper mapper;
	
	@Test
	public void save() {
		UserVO vo = new UserVO();
		/*
		 * vo.setUserid("b1a4098962"); vo.setPassword("rkdmsdl11~2");
		 * vo.setName("rkrkrk"); vo.setEmail("b1a4123@naver.com");
		 * 
		 * mapper.save(vo);
		 */
		
	};

}
