<%-- jsp 주석 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String na = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String ma = request.getParameter("major");
		String[] ho = request.getParameterValues("hobby") ;
		String si = request.getParameter("site");
	%>
	
	<h3>이름: <%=na %></h3>
	<h3>나이: <%=age %></h3>
	<h3>전공: <%=ma %></h3>
	<% out.println("<h3> 취미:");
		for(int i = 0;i<ho.length;i++) {
			String hob = ho[i];
			out.println(hob+" ");
		}
		out.println("<h3>");
	%>
	<h3>사이트: <%=si %></h3>
	
</body>
</html>