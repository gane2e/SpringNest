package com.zerock.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zerock.dto.UserVO;
import com.zerock.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/user/*")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;



	// 로그인 JSP
	@GetMapping("/login")
	public void showLoginForm() {

	}



}
