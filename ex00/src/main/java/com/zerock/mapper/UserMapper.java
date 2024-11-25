package com.zerock.mapper;

import com.zerock.dto.UserVO;

public interface UserMapper {
	
	
	// 회원가입
	public void save(UserVO vo);
	
	// 아이디로 사용자 조회
	public UserVO findById(String userid);
	

}
