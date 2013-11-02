<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<div xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:spring="http://www.springframework.org/tags" xmlns:util="urn:jsptagdir:/WEB-INF/tags/util" xmlns:c="http://java.sun.com/jsp/jstl/core" xmlns:fmt="http://java.sun.com/jsp/jstl/fmt" version="2.0">
 

  <spring:message code="label_collection_index" htmlEscape="false" var="title"/>
 <!--  <util:panel id="title" title="${title}">
    <spring:message code="application_name" htmlEscape="false" var="app_name"/>
    <h3>
      <spring:message arguments="${app_name}" code="welcome_titlepane"/>
    </h3>
  </util:panel> -->
  
  	<div class="collectionBanner group">	 					
		<table class="swatched-banner"> 
			<tbody> 
				<tr> 
					<td style="height: 276px;" class="categoryBannerDesc" valign="middle"> 
													
						<a href="" class="catLink"></a><h1 class="brand bannerHead1 categoryHeader"> 
							<a href=""><span class="brand bannerHead"> 
								${furCollection.collectionName }<span class="collection"> 
								 
									</span></span> 
									</a></h1> 
													
										<h4 class="">1 цвет<br/><br/>Цена за комплект по запросу <!--   от <fmt:formatNumber  groupingUsed="true">${furCollection.collectionPrice }</fmt:formatNumber>  руб.</h4> 
										(кровать + 2 тумбы)-->
										</td> 
									<td class="banner-image" rowspan="2"><a href=""><img src="${pageContext.request.contextPath}/resources/img/${furCollection.smallImageFile}"/>
										</a></td> 
										</tr>
											<tr>
										<td style="height: 66px;" class="banner-swatches">
										<a href=""><img src="${pageContext.request.contextPath}/resources/images/sw_cg_bed_empire.jpg" alt=""/>
											</a></td>
						</tr>	
				</tbody>
		</table>
	</div>
	
	<c:if test="${furCollection.furnitureItems!=null and !furCollection.furnitureItems.isEmpty()}">
	 	<div id="items">

	 	<c:forEach items="${furCollection.furnitureItems}" var="furCal">
	 	   <div class="item_shell">
	 				<div class="item_name">${furCal.itemName } </div>
					<div class="item">
						 <a href="${pageContext.request.contextPath}/item/${furCal.id}">  
						   <img src="${pageContext.request.contextPath}/resources/img/${furCal.smallImageFile }" alt=""  />
						 </a>
						<div> Цена по запросу <!-- <span> <fmt:formatNumber groupingUsed="true">${furCal.itemPrice}</fmt:formatNumber>  руб.</span> --></div>
					</div>
				 </div>
				</c:forEach>
	 	
	
	   </div>
	</c:if>
 
	
			<!-- 	 	<c:forEach items="${furCollection.furnitureItems}" var="furCal">
					<div class="item">
						    <img src="/furniture-shop-test/img/${furCal.smallImageFile }" alt=""  /><br />
						<a href="${pageContext.request.contextPath}/collection/${furCal.id}" class="view">Модель</a><a href="#" class="buy">Заказать</a><br/>
						<div><span> <fmt:formatNumber groupingUsed="true">${furCal.itemPrice}</fmt:formatNumber>  руб.</span></div>
					</div>
				</c:forEach>   -->
				
		<!-- 	 	    <c:forEach items="${furCollection.furnitureItems}" var="furCal">
              <div class="item" >
                <a class="gallery-img four" name="prod1617188" href="">
                  <img class="test_image" alt="Фото продукта" src="/furniture-shop-test/img/${furCal.smallImageFile }"></img>
                  </a><div class="product-title"><a href="">
                   St. James Bed
           <div class="price"><strong><span></span>
             ${furCal.itemPrice} руб.
        </strong></div></a></div><div class="two-column-bc-a"><a href="">
           <span class="galleryDescription"></span></a>
      </div>
     </div>
	</c:forEach> -->
	
</div>
    