<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resources/css/style.css" rel="stylesheet">
<link href="/resources/css/modal.css" rel="stylesheet">
<style>
/* 기본적으로 모든 단계는 숨겨져 있음 */
.step {
	display: none;
}

/* active 클래스가 적용된 단계만 보이게 함 */
.active {
	display: block;
}
</style>
</head>
<body>
	<!--헤더 -->
	<%@ include file="include/header.jsp"%>
	<!-- 서브탑 -->
	<div class="sub_title">
		<div class="title">회원가입</div>
	</div>

	<!-- (1단계) 약관동의 -->
	<div id="step1" class="step active">
		<h2>1단계: 동의</h2>
		<p>서비스 이용 약관에 동의합니다.</p>
		<input type="checkbox" id="agree" /> 동의합니다.<br /> <br />
		<button onclick="nextStep()">다음</button>
	</div>

	<!-- (2단계) 회원가입 -->
	<div id="step2" class="step">
		<form action="join" method="post" id="signupForm">

			<h2>2단계: 정보 입력</h2>
			<p>아이디를 입력하세요:</p>
			<c:if test="${not empty kakao}">
				<input type="text" name="user_id" value="${kakao.email}" />
				<br />
			</c:if>
			<c:if test="${empty kakao}">
				<input type="text" name="user_id" />
				<br />
			</c:if>

			<br />
			<p>비밀번호를 입력하세요:</p>
			<input type="password" name="password" /><br /> <br />
			<p>비밀번호를 한번 더 입력하세요:</p>
			<input type="password" name="passwordConfirm" /><br /> <br />
			<p>이름을 입력하세요:</p>
			<c:if test="${not empty kakao}">
				<input type="text" name="username" value="${kakao.nickname}" />
				<br />
			</c:if>
			<c:if test="${empty kakao}">
				<input type="text" name="username" />
				<br />
			</c:if>
			<br />
			<p>성별을 선택하세요:</p>
			<label for="gender"> <input type="radio" name="gender"
				value="여성" />여성<br /> <br /> <input type="radio" name="gender"
				value="남성" />남성<br /> <br />
			</label>
			<p>생년월일을 입력하세요:</p>
			<input type="date" name="date_of_birth" /><br /> <br />
			<p>휴대폰 번호를 입력하세요:</p>
			<input type="number" name="phone" /><br /> <br />
			<p>이메일을 입력하세요:</p>
			<input type="email" name="email" /><br /> <br />
			<p>주소를 입력하세요:</p>
			<input type="text" name="addr" /><br /> <br />
			<c:if test="${not empty kakao}">
				<input type="hidden" name="kakaoId" value="${kakao.id}">
			</c:if>
			<button onclick="prevStep()">이전</button>
			<button onclick="signupFormSubmit()">제출</button>
		</form>
	</div>

	<!-- 푸터 -->
	<%@ include file="include/footer.jsp"%>

	<script>
		// 1단계에서 2단계로 넘어가는 함수
		function nextStep() {
			var isChecked = document.getElementById('agree').checked;
			if (!isChecked) {
				alert('1단계를 동의해야 다음 단계로 진행할 수 있습니다.');
				return;
			}

			// 1단계를 숨기고 2단계를 보이게 함
			document.getElementById('step1').classList.remove('active');
			document.getElementById('step2').classList.add('active');
		}

		// 2단계에서 1단계로 돌아가는 함수
		function prevStep() {
			// 2단계를 숨기고 1단계를 보이게 함
			document.getElementById('step2').classList.remove('active');
			document.getElementById('step1').classList.add('active');
		}
		
		function signupFormSubmit() {
			// 폼 요소 가져오기
			const email = document.getElementById('email').value.trim();
			const name = document.getElementById('username').value.trim();
			const password = document.getElementById('password').value
					.trim();
			const passwordConfirm = document.getElementById('passwordConfirm').value
					.trim();
			const phone = document.getElementById('phone').value.trim();
			const addr = document.getElementById('addr').value.trim();

			const form = document.getElementById('signupForm');
			const kakao = "${kakao}";

			// kakao가 비어 있으면 action을 'doJoin'으로, 아니면 'doJoin/kakao'로 설정
			if (kakao === "" || kakao === null) {
				form.action = "doJoin"; // kakao가 비어있으면 doJoin으로 설정
			} else {
				form.action = "doJoin/kakao"; // kakao가 있으면 doJoin/kakao로 설정
			}

			// 유효성 검사
			if (!validateEmail(email)) {
				alert('유효한 이메일 주소를 입력하세요.');
				return;
			}

			if (name === '') {
				alert('이름을 입력하세요.');
				return;
			}

			if (password.length < 8) {
				alert('비밀번호는 최소 8자 이상이어야 합니다.');
				return;
			}

			// 비밀번호와 비밀번호 확인 값이 일치하지 않으면 알림창을 띄움
			if (password !== passwordConfirm) {
				alert("비밀번호가 일치하지 않습니다.");
				document.getElementById('password').value = ''; // 비밀번호 입력란 값 비우기
				document.getElementById('passwordConfirm').value = ''; // 비밀번호 확인란 값 비우기
				return;
			}

			if (addr === '') {
				alert('주소를 입력하세요.');
				return;
			}

			// 유효성 검사를 모두 통과하면 폼 제출
			alert('회원가입이 완료되었습니다.\n로그인 페이지로 이동합니다.');
			form.submit(); // 폼을 수동으로 제출
		}
	</script>
</body>
</html>