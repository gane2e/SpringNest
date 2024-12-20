<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정육각- 언제나 초신선</title>
<!-- 모달 css (필수임포트) -->
<link href="/resources/css/modal.css" rel="stylesheet">
<!-- 메인 css -->
<link href="/resources/css/main.css" rel="stylesheet">
<!-- Swiper css -->
<link href="/resources/css/slide.css" rel="stylesheet">
<link rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css" />
</head>
<body>

	<!-- ajax 메인연결 (제이쿼리) -->
	<script
		src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.4.0.min.js"></script>

 	<%@ include file="include/header.jsp" %>
	<script type="text/javascript" src="/resources/js/swiper.js"></script>
	<script type="text/javascript" src="/resources/js/loadDataAjax.js"></script>

	<!-- 메인비주얼 슬라이드 영역 -->
	<div class="swiper mySwiper">
		<div class="swiper-wrapper">
			<!-- 슬라이드 시작 -->
			<div class="swiper-slide"></div>
			<div class="swiper-slide"></div>
			<div class="swiper-slide"></div>
			<div class="swiper-slide"></div>
			<div class="swiper-slide"></div>
			<div class="swiper-slide"></div>
			<!-- 슬라이드 종료 -->
		</div>
		<div class="swiper-button-next"></div>
		<div class="swiper-button-prev"></div>
		<div class="swiper-pagination"></div>
	</div>




	<!-- 초신선 카테고리 -->
	<section>
		<h1 id="catecory-h1">
			<span class="spacing">초신선</span> 식재료 둘러보기
		</h1>

		<div class="list-category">
			<ul>
				<!-- 카테고리 리스트 아이템을 위한 li 요소 -->
				<li class="catecory"></li>
				<li class="catecory"></li>
				<li class="catecory"></li>
				<li class="catecory"></li>
				<li class="catecory"></li>
				<li class="catecory"></li>
				<li class="catecory"></li>
				<li class="catecory"></li>
				<li class="catecory"></li>
			</ul>
		</div>

	</section>

	<!-- 상품 리스트 1-->
	<section id="section2">
		<h2>간편식으로 명절 증후군 극복!</h2>
		<p>밀키트&간편식 10% 쿠폰 증정(~9/27)</p>
		<ul>

			<!-- 상품 리스트 아이템을 위한 li 요소 -->
			<li class="slide-list"><a href="#" class="jsonImg">
					<div class="list-name"></div>
			</a></li>

			<li class="slide-list"><a href="#" class="jsonImg">
					<div class="list-name"></div>
			</a></li>

			<li class="slide-list"><a href="#" class="jsonImg">
					<div class="list-name"></div>
			</a></li>

			<li class="slide-list"><a href="#" class="jsonImg">
					<div class="list-name"></div>
			</a></li>


		</ul>
	</section>

	<!-- 컨텐츠영역 -->
	<section id="section3">
		<div class="section3-size">

			<h2>오늘 갓 짜낸 초신선 우유</h2>
			<img
				src="https://sajygdev.blob.core.windows.net/$web/open_assets/marketing/curation/10%EC%9B%94%20%ED%81%90%EB%A0%88%EC%9D%B4%EC%85%98/web-curation-single-241010-01.png"
				alt="">
			<div class="right-section">

				<p class="overlay-text">착유한지 1일 이내의 초신선 무항생제 우유를 담아보세요.</p>
				<div class="container">
					<a href="#" id="main"> <img
						src="https://sajygdev.blob.core.windows.net/$web/standard_assets/s3/jyg-custom-seoul-app/frontend/thumbnails/transparent_background/milk-fresh-list.png"
						alt="">
					</a>

					<p>초신선 무항생제 우유 900ml</p>
					<span>4,300원</span> <a href="#" id="main-cart"> <img
						data-v-5dd5832e="" src="${pageContext.request.contextPath}/resources/img/maincart.svg" width="60px"
						height="60px"
						style="filter: drop-shadow(rgba(0, 0, 0, 0.04) 0px 8px 16px); cursor: pointer;">
					</a>
				</div>
			</div>
		</div>
	</section>
	<!-- 배너+상품리스트 -->
	<section id="section4">
		<article id="banner-img">
			<a href="#"> <img
				src="https://sajygdev.blob.core.windows.net/$web/open_assets/marketing/curation/%EC%A0%95%EC%9C%A1%EA%B0%81%20%EC%9D%B8%EA%B8%B0%EC%A0%9C%ED%92%88/web-curation-carousel-240912-01.png"
				alt="" width="1184px" height="270px">
			</a>
		</article>
		<article id="banner-list">
			<ul>
				<li class="slide-list"><a href="#" class="jsonImg">
						<div class="list-name"></div>
				</a></li>

				<li class="slide-list"><a href="#" class="jsonImg">
						<div class="list-name"></div>
				</a></li>

				<li class="slide-list"><a href="#" class="jsonImg">
						<div class="list-name"></div>
				</a></li>

				<li class="slide-list"><a href="#" class="jsonImg">
						<div class="list-name"></div>
				</a></li>

			</ul>
		</article>
	</section>

	<section id="section2">
		<h2>곁들이면 고기 맛이 2배!</h2>
		<p>곁들임 최대 30% 할인 중</p>
		<ul>
			<li class="slide-list"><a href="#" class="jsonImg2">
					<div class="list-name2"></div>
			</a></li>

			<li class="slide-list"><a href="#" class="jsonImg2">
					<div class="list-name2"></div>
			</a></li>

			<li class="slide-list"><a href="#" class="jsonImg2">
					<div class="list-name2"></div>
			</a></li>

			<li class="slide-list"><a href="#" class="jsonImg2">
					<div class="list-name2"></div>
			</a></li>

		</ul>
	</section>
	<section id="section5">
		<div class="section5_banner">
			<img src="${pageContext.request.contextPath}/resources/img/section5_banner_icon2.png" alt="">
			<div>
				<p>친구 초대 이벤트</p>
				<h3>친구 초대하고 5천원 적립금 받으세요!</h3>
			</div>
			<button type="submit">바로가기</button>
		</div>
	</section>

	<!-- 푸터 -->
	<%@ include file="include/footer.jsp" %>

	<!-- Swiper JS (dom로딩후 실행하기 위해 바디하단작성)-->
	<script
		src="https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js"></script>
	<!-- Initialize Swiper -->
	<script src="${pageContext.request.contextPath}/resources/js/swiper.js"></script>


	<!--모달팝업 -->
	<div id="dialog" class="dialog">
		<div class="tb">
			<div class="inner" style="max-width: 800px">
				<div class="top">
					<div class="title">떠나요! 초신선 가을캠핑</div>
					<a href="#" class="modal-close" style="color: black">닫기</a>
				</div>
				<div class="ct">
					<img src="${pageContext.request.contextPath}/resources/img/web-popup-240927-01.png" alt="" />
				</div>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script>
		//모달 열기
		function modal(id) {
			$('#' + id).fadeIn();
		}
		//모달 닫기
		$(document).ready(function() {
			$('.modal-close').on('click', function(e) {
				e.preventDefault();
				const modal = $(this).closest('.dialog');
				modal.fadeOut();
			}); //end modal
			
		});
	</script>
</body>
</html>