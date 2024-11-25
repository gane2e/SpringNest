package com.zerock.service;

import org.springframework.stereotype.Service;

import com.zerock.dto.UserVO;


@Service
public interface UserService {
	
	
	// 회원가입
	public void registerUser(UserVO vo);
	
	// 로그인 - 비밀번호 검증
    public boolean checkPassword(String userid,String password);
	

}
