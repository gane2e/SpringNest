package org.zerock.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.KakaoVO;
import org.zerock.domain.UserVO;
import org.zerock.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequiredArgsConstructor
public class TestController {

	private final KakaoApi kakaoApi;
	private final UserService userService;

	@GetMapping("/user/loginTest")
	public String loginForm(Model model) {
		model.addAttribute("kakaoApiKey", kakaoApi.getKakaoApiKey());
		model.addAttribute("redirectUri", kakaoApi.getKakaoRedirectUri());

		log.info(kakaoApi.getKakaoApiKey());
		log.info(kakaoApi.getKakaoRedirectUri());

		log.info("---testLogin 진입---");
		log.info("model => " + model);

		return "/user/loginTest";
	}

	@RequestMapping("/kakao-login")
	public String kakaoLogin(@RequestParam String code, Model model, HttpSession httpSession) {

		log.info("---kakao-login 진입---");

		// 1. 인가 코드 받기 (@RequestParam String code)

		System.out.println("code => " + code);

		// 2. 토큰 받기
		String accessToken = kakaoApi.getAccessToken(code);
		System.out.println("accessToken => " + accessToken);

		// 3. 사용자 정보 받기
		Map<String, Object> userInfo = kakaoApi.getUserInfo(accessToken);
		System.out.println("userInfo ==> " + userInfo);

		String id = (String) userInfo.get("id");
		String email = (String) userInfo.get("email");
		String nickname = (String) userInfo.get("nickname");

		System.out.println("id = " + id);
		System.out.println("email = " + email);
		System.out.println("nickname = " + nickname);
		System.out.println("accessToken = " + accessToken);

		UserVO user = userService.kakaoLogin(id);
		

		if (user == null) {

			KakaoVO kakaoVO = new KakaoVO();
			kakaoVO.setId(id);
			kakaoVO.setEmail(email);
			kakaoVO.setNickname(nickname);

			model.addAttribute("kakao", kakaoVO);
			log.info("model ==> " + model);

			return "/user/join";
		} else
			user.setAccessToken(accessToken);
			httpSession.setAttribute("user", user);
		return "redirect:/";
	}

	@PostMapping("doJoin/kakao")
	public String kakaoJoin(@RequestParam("kakaoId") String kakaoId, 
							UserVO userVO) {
		
		log.info("kakaoId ==> " + kakaoId);
		
		userVO.setKakaoId(kakaoId);
		
		userService.kakaoJoin(userVO);
		
		return "redirect:/";
	}

	@PostMapping("user/kakao/delete")
	public String kakaoLogout(@RequestParam("kakaoId") String kakaoId, 
			@RequestParam("accessToken") String accessToken) {

		/* 카카오 연동해지 처리 */
		kakaoApi.kakaoLogout(accessToken);
		/* 테이블에서 카카오키 삭제 */
		userService.deleteKakao(kakaoId);

		return "redirect:/";
	}

}
