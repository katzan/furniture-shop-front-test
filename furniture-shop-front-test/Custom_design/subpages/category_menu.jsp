<%@ include file="/init.jsp" %>
<% 
   Collection<ShoppingCategory> shcs = (Collection<ShoppingCategory>)request.getAttribute("categories");  
%>

			<div id="sidebar">
				<img src="/images/title1.gif" alt="" width="174" height="30" /><br />																																																																		
				<ul id="list">

<%
    int i=0;
    for (ShoppingCategory shc : shcs) {
    	++i;
    	if(i%2!=0) {
%>   
                 <li class="color"><a href="#"><%=shc.getName() %></a></li>
    <%  }
    	else {
    %>	
                 <li><a href="#"><%=shc.getName() %></a></li>
<%    }    	
    }   
%>			
				</ul>
			</div>