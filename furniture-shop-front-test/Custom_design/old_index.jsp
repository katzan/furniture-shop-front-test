<%@ page import="com.katz.jpa.testjpa.model.*" %>
<%@ page import="com.katz.web.mebelshop.model.*" %>
<%@ page import="javax.persistence.*" %>
<%@ page import="java.util.Collection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Test!!! А это тест на русском языке!<br>

<%
  // EntityManagerFactory emf =
   //(EntityManagerFactory)getServletContext().getAttribute("emf");
   EntityManagerFactory emf =
   Persistence.createEntityManagerFactory("employee");
    EntityManager em = emf.createEntityManager();
    ShoppingCategoryService service = new ShoppingCategoryService(em);
    Collection<ShoppingCategory> shcs = service.getAllCategories();
    for (ShoppingCategory shc : shcs) {
%>   
    <%=shc.getName() %><br> 	
  
<%    	
    }   
%>
</body>
</html>