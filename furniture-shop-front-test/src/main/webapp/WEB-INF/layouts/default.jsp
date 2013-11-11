<%@include file="init.jsp" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>  
			
<head>
	<title>${page_title}</title>
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" type="text/css" media="screen, projection" />
	<link href="${pageContext.request.contextPath}/resources/css/ulstyle.css" type="text/css" rel="stylesheet"/>
	<link href="${pageContext.request.contextPath}/resources/css/style2.css" type="text/css" rel="stylesheet"/>
	<link href="${pageContext.request.contextPath}/resources/jFlowPlusDemo/styles/styler.css" type="text/css" rel="stylesheet"/>
	<link href="${pageContext.request.contextPath}/resources/jFlowPlusDemo/styles/jflow.style.css" type="text/css" rel="stylesheet"/>
</head>

<body>

<div id="wrapper">
	
   <tiles:insertAttribute name="header" ignore="true" />
   <tiles:insertAttribute name="messages" ignore="true"/>
   <tiles:insertAttribute name="body" ignore="true"/>
	<tiles:insertAttribute name="menu" ignore="true"/>

</div><!-- #wrapper -->

    <tiles:insertAttribute name="footer" ignore="true"/>
    
<img id="imgBg" src="${pageContext.request.contextPath}/resources/images/bgfonv.png" alt="" />
<img id="imgBg1" src="${pageContext.request.contextPath}/resources/images/bgfonn.png" alt="" />
</body>
</html>
