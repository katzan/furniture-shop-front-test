<%@include file="../layouts/init.jsp" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
	<c:set var="paramMap" value="${ pageContext.request.parameterMap}"/>
	<c:if test="${paramMap.containsKey('added') }">
	<div class="messages" >
          <ul >
               <li class="success-msg">
                  <ul>
                      <li><spring:message code="item.added"/></li>
                  </ul>
               </li>
           </ul>
        </div> 
        </c:if>
</div>