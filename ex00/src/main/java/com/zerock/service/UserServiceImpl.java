package com.zerock.service;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.zerock.dto.UserVO;
import com.zerock.mapper.UserMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	
	private final UserMapper mapper;
	
	@Override
	public void registerUser(UserVO vo) {
		
		/*
		 * // BCrypt로 비밀번호 암호화 String salt = BCrypt.gensalt(); // Salt 생성
		 * vo.setPassword(BCrypt.hashpw(vo.getPassword(), salt)); // 암호화된 비밀번호 반환
		 */		
		
		mapper.save(vo);
	}

	@Override
	public boolean checkPassword(String userid, String userpw) {
		
		// 1. DB에서 사용자 정보 조회
		UserVO user = mapper.findById(userid);
		
		// 2. 일치하는 ID 없을시 FALSE
		if(user == null) {
			return false;
		}
		return user.getPassword().equals(userpw);
	}


	
	
	

}
