<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.nagarro.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Profile</title>
</head>
<body>
<% Employee emp = (Employee)request.getAttribute("employee");
%>
Name:<%=emp.getName() %><p>
Age:<%=emp.getAge() %><p>
City:<%=emp.getCity() %><p>
</body>
</html>