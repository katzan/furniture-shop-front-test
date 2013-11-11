	<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@include file="../layouts/init.jsp" %>
	<div id="header" >
 

		<div id="logo"><a href="#"><img src="${pageContext.request.contextPath}/resources/images/logo.png" alt="Главная страница" /></a></div>
		<div id="poisk"><form method="get" action="/search">
		<span>Поиск на сайте:</span>
		<input name="search" value="" type="text" id="searchform"/>
		<button class="maia-button"><div id="searchcl">Поиск</div></button></form></div>
		
		<div id="zvonok">
			<div id="logozvonok"><img src="${pageContext.request.contextPath}/resources/images/tel.png" alt="Телефон"/>
				<span class="nomer">8(495)999-12-09</span>
			</div>
			<div id="rv"><a class="rh" href="#">Зарегистрироваться</a><span></span><a class="vh" href="#">Войти</a></div>
		</div>
		<div id="palkaheader"><img src="${pageContext.request.contextPath}/resources/images/art.png" alt=""/></div>
		<div id="fmenu">
			<ul id="menu">
				<li><a href="#">Главная</a></li>
				<li><a href="#">О нас</a>
					<ul>
						<li><a href="#">наши достижения</a></li>
						<li><a href="#">наши партнеры</a></li>
						<li><a href="#">отзывы о нас</a></li>
					</ul>
				</li>
				<li><a href="#">Каталог мебели</a></li>
				<li><a href="#">Полезная информация</a></li>
				<li><a href="#">Новости</a></li>
				<li><a href="#">Контакты</a></li>			
			</ul>
		</div>
		<div style="clear:both"></div>
	</div><!-- #header-->