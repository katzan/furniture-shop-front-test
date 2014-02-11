	<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@include file="../layouts/init.jsp" %>
	<div id="header" >
 

		<div id="logo"><a href="/"><img src="${pageContext.request.contextPath}/resources/images/logo.png" alt="Главная страница" /></a></div>
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
				<li><a href="${pageContext.request.contextPath}/index.html">Главная</a></li>
				<li><a href="${pageContext.request.contextPath}/catalogue/index.html">Каталог мебели</a></li>
				<li><a href="${pageContext.request.contextPath}/article/article.html">Полезная информация</a></li>
				<li><a href="${pageContext.request.contextPath}/newsevents/news_events.html">Новости</a></li>
				<li><a href="${pageContext.request.contextPath}/contact/contacts.html">Контакты</a></li>			
			</ul>
		</div>
		<div style="clear:both"></div>
	</div><!-- #header-->