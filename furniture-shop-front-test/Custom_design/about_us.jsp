<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Информация о нас</title>

<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>

<body>
	<div id="header">																																																																								
		<div id="header_inside">
			<img src="images/header.jpg" alt="setalpm" width="999" height="222" border="0" usemap="#Map" /><br />																																										
			<ul id="menu">
				<li><a href="index.html" class="but1">Главная</a></li>
				<li><a href="about_us.jsp" class="but2_active">О нас</a></li>
				<li><a href="news_events.jsp" class="but3">Новости &amp; События</a></li>
				<li><a href="services.jsp" class="but4">Услуги</a></li>
				<li><a href="cabinet.jsp" class="but5">Кабинет</a></li>
				<li><a href="contacts.jsp" class="but6">Контакты</a></li>
			</ul>
		</div>
	</div>
	<div id="wrapper">																																																																																																				
		<div id="content_inside">
		   <%@ include file="/subpages/category_menu.jsp" %>
			<div id="main_block" class="style1">																																																																													
				<div id="item">
					<h4>Информация </h4><br />
					<div class="big_view">
						Здесь размещается информация по данному блоку
					</div>
 
	 			</div>
				<div class="description">
					<p>
						<strong>Новостная лента</strong><br /> 
						Дополнительная информация или новости.
					</p>

				</div>
			</div>
		</div>
	</div>
	<div id="footer">
	  <%@ include file="/subpages/footer_inside.jsp" %>
	</div>
    <map name="Map">
       <area shape="rect" coords="78,45,312,119" href="index.html">
       <area shape="poly" coords="670,87,719,78,727,123,677,130" href="#">
       <area shape="poly" coords="776,124,818,152,793,189,751,160" href="#">
       <area shape="poly" coords="834,52,885,61,878,105,828,96" href="#">
	</map>
</body>
</html>
