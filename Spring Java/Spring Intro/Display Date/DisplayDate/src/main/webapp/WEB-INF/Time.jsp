<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/Time.css">
<script type="text/javascript" src="js/time.js"></script>


</head>
<body>
<div class=time>
<h1> <c:out value="${time}"> </c:out> </h1>
</div>
</body>
</html>