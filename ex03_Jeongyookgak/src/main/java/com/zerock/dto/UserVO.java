package com.zerock.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class UserVO {

	private long uno;

	private String user_id;
	private String username;
	private String email;
	
	private String password;
	private String passwordConfirm;
	
	private String addr;
	private String phone;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_of_birth;
	private Date regdate;
	private String gender;

	
	/* 카카오회원 정보 */
	private String kakaoId;
	private String accessToken;
}
