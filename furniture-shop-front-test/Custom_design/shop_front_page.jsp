<%@ include file="/init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Furniture Shop</title>
<meta http-equiv="Content-Type" content="text/html">
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>

<body>
	<div id="header">																																																																								
		<div id="header_inside">
			<img src="/images/header.jpg" alt="setalpm" width="999" height="222" border="0" usemap="#Map" /><br />																																										
			<ul id="menu">
				<li><a href="index.html" class="but1_active">Главная</a></li>
				<li><a href="about_us.jsp" class="but2">О нас</a></li>
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
			<div id="main_block">
				<div class="about">
					<img src="/images/title2.gif" alt="" width="191" height="30" /><br />
					<p> В нашем мебельном магазине мы предлагаем Вам лучшие образцы современной мебели, по низким ценам с отличным сервисом. Широкий ассортимент китайской мебели на любой вкус. Профессиональные консультанты помогут Вам выбрать именно то, что Вам нужно. Заказывайте мебель у нас с удовольствием!</p>
					<a href="#">more info</a>
				</div>
				<div class="news">
					<img src="/images/title3.gif" alt="" width="69" height="30" /><br />
					<p>Этот новостной блок предназначен для размещения в нем последних актуальных новостей как нашего магазина, так и мировой мебельной отрасли. Спецпредложения тоже могу здесь размещаться.  </p>
				</div>
				<div id="items">
<%
  EntityManagerFactory emf =
  (EntityManagerFactory)getServletContext().getAttribute("emf");
     
     EntityManager em1 = emf.createEntityManager();
     ShoppingItemService service1 = new ShoppingItemService(em1);
     ShoppingItem item = service1.findShoppingItem("d212ad053a699f90013a69a2294d0001");
     em1.close();
%>
   <c:if test="<%=item!=null %>">
					<div class="item">
						<img src="http://images.inomebel.ru:8080/portal/image/shopping/item?img_id=" alt="" width="202" height="173" /><br />
						<span><%=item.getPrice() %>руб.</span><a href="items/<%=item.getItemId() %>" class="view">Модель</a><a href="#" class="buy">Заказать</a>
					</div>
  </c:if>
					<div class="item">
						<img src="/images/item2.jpg" alt="" width="202" height="173" /><br />
						<span>$150</span><a href="index2.html" class="view">Модель</a><a href="#" class="buy">Заказатьt</a>
					</div>
					<div class="item">
						<img src="/images/item3.jpg" alt="" width="202" height="173" /><br />
						<span>$250</span><a href="index2.html" class="view">Модель</a><a href="#" class="buy">Заказать</a>
					</div>
					<div class="item">
						<img src="/images/item4.jpg" alt="" width="202" height="173" /><br />
						<span>$120</span><a href="index2.html" class="view">Модель</a><a href="#" class="buy">Заказать</a>
					</div>
					<div class="item">
						<img src="/images/item5.jpg" alt="" width="202" height="173" /><br />
						<span>$1255</span><a href="index2.html" class="view">Модель</a><a href="#" class="buy">Заказать</a>
					</div>
					<div class="item">
						<img src="/images/item6.jpg" alt="" width="202" height="173" /><br />
						<span>$215</span><a href="index2.html" class="view">Модель</a><a href="#" class="buy">Заказать</a>
					</div>
					<div class="item">
						<img src="/images/item2.jpg" alt="" width="202" height="173" /><br />
						<span>$150</span><a href="index2.html" class="view">Модель</a><a href="#" class="buy">Заказатьt</a>
					</div>
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

