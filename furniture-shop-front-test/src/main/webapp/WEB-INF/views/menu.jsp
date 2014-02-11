<%@include file="../layouts/init.jsp" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
		<div class="sidebar" id="sideLeft">
				<div class="param"><h3>Категории мебели</h3></div>
			<ul>
				<c:forEach items="${categories}" var="category" varStatus="i">
					<li><a class="sidebar_menu_item" href="${pageContext.request.contextPath}/category/${category.id}">${category.categoryName }</a></li>
				</c:forEach>
				
			</ul>
		</div>
		<!-- .sidebar#sideLeft -->

<div style="clear:both"></div>