package com.zerock.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zerock.dto.UserVO;
import com.zerock.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Controller
@Log4j
@RequiredArgsConstructor
public class HomeController {

	private final UserService userService;
	PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "login";
	}

	// 로그인처리
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String userLogin(@RequestParam String username, @RequestParam String user_pw, Model model,
			HttpSession session) {

		log.info("유저 ID ---> " + username);

		UserVO user = userService.login(username, user_pw);

		if (user == null) {
			model.addAttribute("loginMessage", "아이디 또는 비밀번호를 확인해주세요.");
			return "user/login"; // 로그인 페이지로 다시 돌아가기
		} else {
			model.addAttribute("user", user); // 마이페이지에 회원정보 전달용
			session.setAttribute("user", user); // 로그인 성공 시 세션에 유저정보 저장
		}

		log.info("-------로그인 완료-----------");
		log.info("로그인한 유저 세션값 ---> " + session);
		log.info("로그인한 유저 vo값 ---> " + user);
		log.info("로그인한 유저 model ---> " + model);

		return "redirect:/";

	}

	// 회원가입 JSP
	@GetMapping("/register")
	public void showRegisterForm() {
		log.info("------- 회원가입페이지 진입 성공 -------");
	}

	// 회원가입 포스트요청
	@PostMapping("/join")
	public String registerUser(UserVO vo) {

		log.info("회원가입 진입---------------");

		String rawPw = "";
		String encodePw = "";

		log.info("vo email 받았나 테스트 ---> " + vo.getEmail());

		log.info("패스워드 체크 완료-------");

		rawPw = vo.getPassword();
		encodePw = passwordEncoder.encode(rawPw);
		vo.setPassword(encodePw);

		log.info("vo -------> " + vo);

		userService.register(vo);

		log.info("-------------회원가입 test완료------------");

		return "redirect:/";

	}
}
