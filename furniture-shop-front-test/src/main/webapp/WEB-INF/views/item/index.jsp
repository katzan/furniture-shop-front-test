<%@include file="../../layouts/init.jsp" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<p>
  <div id="cont">
	 <div id="podrinfo">
	 <div id="bigphoto"><div id="big"><img src="http://mebelvopt.ru/resources/img/${furnitureItem.largeImageFile }" alt="${furnitureItem.itemName}"/></div></div>
	 <div id="infoprod"><h2 class="hv">${furnitureItem.itemName}</h2>
	 <div class="infpr">
	 <p class="inftab"><span>Артикул:</span></p>
	 <p class="nazvinf"><span>${furnitureItem.codeNumber }</span></p>
	 <p class="inftab"><span>Основной материал:</span></p>
	 <p class="nazvinf"><span>${furnitureItem.materials }</span></p>
	 <p class="inftab"><span>Размеры:</span></p>
	 <p class="nazvinf"><span>${furnitureItem.dimensions}</span></p>
	 <p class="inftab"><span>Основной цвет:</span></p>
	 <div id="colorprod"><div class="color"><div class="br1"></div></div><div class="color"><div class="br2"></div></div></div>
	 <div style="clear:both"></div>
	 <p class="inftab"><span>Другой цвет:</span></p>
	 <p class="nazvinf"><span>отсутствует</span></p>
 	 <p class="inftab"><span>Цена (розница):</span></p>
	 <p class="nazvinf"><span><fmt:formatNumber>${furnitureItem.itemPrice }</fmt:formatNumber> руб.  </span></p>
	<div id="otpravka1" class="pri"><a href="${pageContext.request.contextPath}/cart/add/${furnitureItem.id }"><button>Отложить</button></a></div>


	 </div></div>
	 <div style="clear:both"></div>
	 <div id="opisanie"><h2 style="margin-bottom:10px">Описание товара:</h2>
	 <div class="inform2 brtl">${furnitureItem.itemDescription } </div></div>
	 </div>
	 	 		<div style="clear:both"></div>
</div>
