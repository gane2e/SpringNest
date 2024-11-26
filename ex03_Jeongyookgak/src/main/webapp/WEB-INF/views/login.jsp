<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>로그인</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Home</title>
	<!-- 공통 css (헤더, 푸터)-->
	<link href="/resources/css/login.css" rel="stylesheet">
</head>
<body>

    <!--헤더 -->
	<%@ include file="include/header.jsp" %>

     <main>
      <!-- 로그인 폼 -->

      <div class="sub_title">
        <div class="title">로그인</div>
      </div>

      <div class="sub_cont">
        <div class=".data">
          <!-- 로그인 -->
          <form action="/login" method="POST">
            <div class="login_cont_area">
              <div class="title_area">
                <div class="title">
                  <span class="ft_c">정육각</span> 홈페이지에 <br />
                  방문하신것을 환영합니다.
                </div>
              </div>
              <div class="login_inp_area">
                <div class="box id">
                  <input
                    type="text"
                    name="username"
                    id="user_id"
                    required
                    placeholder="아이디를 입력하세요."
                  />
                </div>
                <div class="box pass">
                  <input
                    type="password"
                    name="user_pw"
                    id="user_pw"
                    required
                    placeholder="비밀번호를 입력하세요."
                  />
                </div>
              </div>
              <div class="link_btn_area">
                <a href="#">로그인</a>
              </div>
              <!-- 회원가입 / 아이디 비밀번호 찾기 -->
              <div class="login_etc_area">
                <!-- 텍스트부분 -->
                <ul class="list">
                  <li>
                    <div class="text">*회원이 아니십니까?</div>
                  </li>
                  <li>
                    <div class="text">*아이디/비밀번호를 잊으셨나요?</div>
                  </li>
                </ul>
              </div>
              <!-- 회원가입 / 아이디 비밀번호 찾기 버튼 -->
              <div class="link_btn_area2">
                <a href="#">회원가입</a>
                <a href="#">아이디/비밀번호 찾기</a>
              </div>
              <!-- SNS 로그인 -->
              <div class="sns_area">
                <ul class="list">
                  <!-- 카카오톡 -->
                  <li>
                    <a href="#">
                      <div class="text">카카오톡으로 간편 로그인하기</div>
                    </a>
                  </li>
                  <!-- 네이버 -->
                  <li>
                    <a href="#">
                      <div class="text">네이버로 간편 로그인하기</div>
                    </a>
                  </li>
                </ul>
              </div>
              <!--  -->
            </div>
          </form>
        </div>
      </div>
    </main>
    
    <!-- 푸터 -->
	<%@ include file="include/footer.jsp" %>
    
</body>
</html>
