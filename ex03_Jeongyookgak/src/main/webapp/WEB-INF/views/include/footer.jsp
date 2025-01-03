<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 공통 css (헤더, 푸터)-->
<link href="/resources/css/style.css" rel="stylesheet">
</head>
<body>
<!-- 푸터 -->
<footer>
  <section id="footer-navigation">
    <a href="#" target="_blank">인재채용</a>
    <a href="#" target="_blank">이용약관</a>
    <a href="#" target="_blank">개인정보처리방침</a>
    <div class="footer-navigation_external">
      <button>정육각 앱 설치</button>
      <img
        src="https://cdn-icons-png.flaticon.com/512/4922/4922972.png"
        alt=""
      />
    </div>
  </section>

  <div style="width: 100%; height: 0; border-top: 1px solid #eeeeee"></div>

  <section id="footer-main">
    <article id="footer-main-info">
      <img src="${pageContext.request.contextPath}/resources/img/footer_logo.png" alt="" />
      <span
        >(주)정육각 대표이사: 김재연 | 주소: 경기도 김포시 고촌읍 아라육로57번길
        126</span
      >
      <span
        >사업자등록번호 : 224-87-00271 <a href="#">[조회]</a> |
        통신판매업신고번호: 2021-경기김포-0668</span
      >
      <span>개인정보관리책임자: 박준태(privacy@yookgak.com)</span>
      <p>© 2021 Jeongyookgak Inc. All rights reserved.</p>
    </article>
  </section>
</footer>

</body>
</html>