<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>관리자 로그인</title>
    <style>
        /* 페이지 전체 스타일 */
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background: #f0f4f7;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .login-container {
            background-color: #fff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            transition: transform 0.3s ease, opacity 0.3s ease;
        }

        /* 타이틀 */
        .login-container h5 {
            text-align: center;
            font-size: 2rem;
            color: #333;
            margin-bottom: 60px;
        }

        /* 폼 그룹 스타일 */
        .form-group {
            margin-bottom: 20px;
            position: relative;
        }

        .form-group label {
            display: block;
            font-size: 14px;
            color: #555;
            position: absolute;
            top: -10px;
            left: 10px;
            background: #fff;
            padding: 0 5px;
        }

        /* 인풋 스타일 */
        .form-group input {
            width: 100%;
            padding: 15px 20px;
            font-size: 16px;
            border: 2px solid #ddd;
            border-radius: 50px;
            background-color: #f7f7f7;
            box-sizing: border-box;
            transition: all 0.3s ease-in-out;
        }

        /* 인풋 포커스 시 스타일 변경 */
        .form-group input:focus {
            border-color: #4a90e2;
            background-color: #fff;
            outline: none;
            box-shadow: 0 0 8px rgba(74, 144, 226, 0.5);
        }

        /* 로그인 버튼 스타일 */
        .form-group input[type="submit"] {
            background-color: #4a90e2;
            color: #fff;
            border: none;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            padding: 15px;
            border-radius: 50px;
            width: 100%;
        }

        /* 로그인 버튼 hover 스타일 */
        .form-group input[type="submit"]:hover {
            background-color: #357ab7;
        }

        /* 에러 메시지 스타일 */
        .error-message {
            color: #e74c3c;
            text-align: center;
            margin-top: 15px;
            font-size: 14px;
        }

        /* 애니메이션 */
        .login-container {
            transform: scale(0.9);
            opacity: 0;
            animation: fadeIn 0.5s forwards;
        }

        @keyframes fadeIn {
            to {
                transform: scale(1);
                opacity: 1;
            }
        }

    </style>
</head>
<body>
    <div class="login-container">
        <h5>정육각 관리자시스템</h5>
        <form action="/admin/login" method="POST">
            <!-- 아이디 입력 -->
            <div class="form-group">
                <input type="text" id="username" name="username" placeholder="아이디를 입력하세요" required>
            </div>

            <!-- 비밀번호 입력 -->
            <div class="form-group">
                <input type="password" id="password" name="password" placeholder="비밀번호를 입력하세요" required>
            </div>
            <!-- 로그인 버튼 -->
            <div class="form-group">
                <input type="submit" value="로그인">
            </div>
        </form>

        <!-- 에러 메시지 출력 -->
        <div class="error-message">
            <c:if test="${not empty errorMessage}">
                <p>${errorMessage}</p>
            </c:if>
        </div>
    </div>
</body>
</html>

