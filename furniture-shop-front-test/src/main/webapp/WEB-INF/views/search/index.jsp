<%@include file="../../layouts/init.jsp" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8" %>
<div >

   Вы искали фразу: ${sParam } <br/>
   
   <c:forEach items="${searchResults.documents }" var="curDoc">
 	<!-- <div id="searchDoc" class="product">
     <img class="photovse" src="http://www.mebelvopt.ru/resources/img/${curDoc.foto}"/>
     <a class="obram" href="${pageContext.request.contextPath}/${curDoc.controller}/${curDoc.item_id }"> ${curDoc.name } </a> <br/>
      <br/>
   </div> -->
  <div class="productBox">   
		<div class="product">
			<a href="${pageContext.request.contextPath}/${curDoc.controller}/${curDoc.item_id }"><img class="photovse" src="http://www.mebelvopt.ru/resources/img/${curDoc.foto}" alt="${curDoc.name }"/></a>
			
		</div>
		<a class="obram" href="${pageContext.request.contextPath}/${curDoc.controller}/${curDoc.item_id }"> ${curDoc.name } </a> <br/>
		</div>
		
   <div id="artniz"><img src="${pageContext.request.contextPath}/resources/images/artn.png" alt=""/></div>
   </c:forEach>
</div>
