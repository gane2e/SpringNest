<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Home</title>
</head>
<body>
    <h2>로그인</h2>

    <form action="/user/login" method="post">
        <div>
            <label for="userid">아이디:</label>
            <input type="text" id="userid" name="userid" required/>
        </div>
        <div>
            <label for="password">비밀번호:</label>
            <input type="password" id="password" name="password" required/>
        </div>
        <button type="submit">로그인</button>
    </form>
    
     <!-- 로그인 성공 또는 실패 시 알림창 띄우기 -->
    <c:if test="${param.error != null}">
        <script type="text/javascript">
            alert("로그인에 실패했습니다. 아이디 또는 비밀번호를 확인해주세요.");
        </script>
    </c:if>

    <c:if test="${param.success != null}">
        <script type="text/javascript">
            alert("로그인 성공!");
        </script>
    </c:if>
</body>
</html>
