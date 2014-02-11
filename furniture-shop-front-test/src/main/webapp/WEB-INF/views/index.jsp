<%@include file="../layouts/init.jsp" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="cntainer" >
   
	<div id="spanmenu">
		<!--<span class="ulrspan"><a href="#">Главная</a></span><span class="skmenu"></span><span class="last">Каталог мебели</span>-->
		</div>  
		<div style="clear:both;"></div>

			<div id="cntent">
		<div style="clear:both; margin-bottom:20px"></div>
		<div id="product1">
		  <c:forEach items="${categories}" var="category" varStatus="i">
			<div class="trproduct">
				<a href="${pageContext.request.contextPath}/category/${category.id}"><img src="http://mebelvopt.ru/resources/img/${category.smallImageFile }" alt="${category.categoryName }"/></a>
				<div class="pop l1"><span>${category.categoryName }</span></div>
			</div>
			</c:forEach>
		</div>
		<div style="clear:both"></div>
<div id="soderjimoe"><p>Добро пожаловать на сайт MebelVopt.ru!</p> 
<p>Наша компания родилась как компания-перевозчик и долгое время мы помогали 
нашим партнёрам в доставке их груза. Мы много думали, изучали и теперь мы 
занимаемся не только перевозками, но и поставками мебели в Россию. </p>
<p>Мы - оптовая компания по поставке качественной мебели из Китая, Малайзии, 
Вьетнама. Наша работа – помогать нашим партнерам в развитии Российского 
рынка экспортной мебели. Мы сотрудничаем с крупнейшими производителями
мебели в Китае, которые делают качественные аналоги европейской мебели. 
Нашими основными условиями для сотрудничества с фабрикой являются: 
высокое качество, которое мы можем гарантировать нашим партнерам в России, 
отлаженная система поставки, приемлемая цена. </p>
<p>Поэтому работать с нами надежно, просто и выгодно.</p></div>
			</div><!-- #cntent-->
		</div><!-- #cntainer-->