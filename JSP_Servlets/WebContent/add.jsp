<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan"> 
	<script src="myscript.js"></script><br>
	
	<!--directive tag-->
	<%@page  import="java.util.Date, java.awt.*" %>
	 
	<!--Declaration TAG-->
	<%!
		public int a=1;
	%>
	<!--scriptlet tag-->
	<%
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		int resul=n1+n2;
		//out.write("The result is:"+resul);
	%>
	
	<!--expression TAG-->
	<%= "The result is "+resul %>
</body>
</html>