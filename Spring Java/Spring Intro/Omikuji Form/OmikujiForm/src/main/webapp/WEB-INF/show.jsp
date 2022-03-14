<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/show.css">

</head>
<body>
<h1>Here's Your Omikuji</h1>
<div class=par>
<h2>In <c:out value="${counter}"></c:out> years, you wii
;ive in <c:out value="${city}"></c:out> with <c:out value="${person}"></c:out> as your roommate,
<c:out value="${hobby}"></c:out> for a living.
The next time you see a <c:out value="${living}"></c:out> you will have good luck
also, <c:out value="${desc}"></c:out>.</h2></div><br>
<div class=back>
<a href=http://localhost:8080/omikuji>Go Back</a>
</div>
</body>
</html>