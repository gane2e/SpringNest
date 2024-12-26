package com.zerock.mapper;

import java.util.Map;

import com.zerock.dto.UserVO;

public interface UserMapper {
	
	public void insertUser(UserVO vo); // 회원가입
	
	public UserVO login(Map<String, String> params); //로그인 처리
	
	public int checkEmail(String email); //이메일 중복체크
	
	public boolean updateUser(UserVO vo); //회원정보 수정(비밀번호 미포함)
	
	public boolean updateUserPw(UserVO vo); //회원정보 수정(비밀번호 포함)

	public boolean deleteUser(long uno); //회원 탈퇴
	
	public UserVO kakaoLogin(String kakaoId); //카카오회원 가입정보 조회

	public void kakaoJoin(UserVO userVO); //카카오회원 가입정보 조회
	
	public void deleteKakao(String kakaoId); //카카오정보 삭제

}
