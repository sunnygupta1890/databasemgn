<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reference ID</title>
</head>
<body>
<% String a  = request.getParameter("id"); %>
<script>alert("Generated ID for future ref: <%=a%>"); window.location = 'UserPage.jsp'</script>
</body>
</html>