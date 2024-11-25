package com.zerock.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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

	  @Autowired
	  private UserService userService;
	  
	 // 회원가입 JSP
	  @GetMapping("/register")
	    public void showRegisterForm() {
		  log.info("------- 회원가입페이지 진입 성공 -------");
	    }
	
	  //회원가입 포스트요청
	  @PostMapping("/register")
	    public String registerUser(@ModelAttribute UserVO vo, Model model) {
	        try {
	            userService.registerUser(vo);
	            return "redirect:/user/login";  
	        } catch (Exception e) {
	            model.addAttribute("error", "error.");
	            return "/login";
	        }
	    }
	  
	  // 로그인 JSP
	  @GetMapping("/login")
	    public void showLoginForm() {

	    }
	  
	  //로그인처리
	  @PostMapping("/login")
	    public String Login(@RequestParam("userid") String userid, @RequestParam("password") String password, HttpSession session ) {
		  	boolean success = userService.checkPassword(userid, password);
		  
		  		if(success) {
		  			session.setAttribute("userid", userid);  // 세션에 사용자 ID 저장
		  			return "redirect:/login?success=true"; 
		  		} else {
		  			return "redirect:/login?error=true";
		  		}
		  			
		  		
		
	 		}
		  
	    }
	  
