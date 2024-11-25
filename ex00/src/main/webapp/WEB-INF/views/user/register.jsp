<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원가입 페이지</title>
  <link href="/resources/css/NewFile.css" rel="stylesheet">
</head>

<body>
  <div class="container">
    <h1>회원가입</h1>
    <form action="/user/register" method="POST" class="signup-form">
      <div class="form-group">
        <label for="userid">아이디</label>
        <input type="text" id="userid" name="userid" required placeholder="아이디를 입력하세요">
      </div>
      <div class="form-group">
        <label for="name">이름</label>
        <input type="text" id="name" name="name" required placeholder="이름을 입력하세요">
      </div>
      <div class="form-group">
        <label for="password">비밀번호</label>
        <input type="password" id="password" name="password" required placeholder="비밀번호를 입력하세요">
      </div>
      <div class="form-group">
        <label for="email">이메일</label>
        <input type="email" id="email" name="email" required placeholder="이메일을 입력하세요">
      </div>
      <button type="submit" class="submit-btn">회원가입</button>
    </form>
  </div>
</body>
</html>
