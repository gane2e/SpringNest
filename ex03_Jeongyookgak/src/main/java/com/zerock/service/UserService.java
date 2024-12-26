package com.zerock.service;

import com.zerock.dto.UserVO;

public interface UserService {
	
	public void register(UserVO vo); //회원가입
	
	public boolean checkEmail(String email); //회원가입 이메일 중복체크
	
	public UserVO login(String username, String password); //로그인처리 (DB회원 조회)
	
	public boolean updateUser(UserVO vo); //회원정보 수정 (비밀번호 포함X)
	
	public boolean updateUserPw(UserVO vo); //회원정보 수정 (비밀번호 포함O)
	
	public boolean deleteUserByEmail(long uno); //회원 탈퇴
	
	public UserVO kakaoLogin(String kakaoId); //카카오회원 가입정보 조회

	public void kakaoJoin(UserVO userVO); //카카오 연동 회원가입
	
	public void deleteKakao(String kakaoId); //카카오정보 삭제
}
