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

<!-- header.html -->

<!-- 상단배너 -->
<div id="top_banner-area">
  <a href="#">
    <img
      src="https://www.jeongyookgak.com/static/img/top_banner_new.30b4e5b.png"
      alt=""
    />
  </a>
</div>

<header>
  <div id="logo">
    <a href="#"><img src="../img/로고_w-4.png" alt="" /></a>
  </div>
  <nav>
    <div id="nav-container">
      <ul>
        <li><a href="#">쇼핑하기</a></li>
        <li><a href="#">배송안내</a></li>
        <li><a href="#">이벤트</a></li>
        <li>
          <div
            style="
              width: 1px;
              height: 16px;
              background-color: white;
              float: left;
              margin: 0 10px;
            "
          ></div>
        </li>
        <li>
          <a href="#"
            >선물하기 <img src="../img/new.png" alt="" width="15px"
          /></a>
        </li>
      </ul>

      <!-- 우측내비 -->
      <div id="navigation-right">
        <ul>
          <li><a href="#">공지사항</a></li>
          <li><a href="#">고객센터</a></li>
          <li>
            <div
              style="
                width: 1px;
                height: 12px;
                background-color: white;
                float: left;
                margin: 1px 10px 0 10px;
              "
            ></div>
          </li>
          <li>
            <a href="http://192.168.219.101:5500/html/login.html">로그인</a>
          </li>
          <li><a href="#">회원가입</a></li>
        </ul>

        <a href="#">
          <img src="../img/카트.svg" alt="" />
        </a>
        <a href="#">
          <img src="../img/sitemap.svg" alt="" />
        </a>
        <a href="#" style="margin-right: 10px" onClick="modal('dialog')">
          <img src="../img/팝업.png" alt="" class="modal_img" />
        </a>
      </div>
    </div>
  </nav>
</header>



</body>
</html>