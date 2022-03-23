<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link href="css/welcomestyle.css" rel="stylesheet" type="text/css">

</head>
<body>
<div class="welcome">
<div class="leftbar">
<h1>Welcome, <c:out value="${thisUser.userName }"></c:out></h1>
<p>Books from everyone shelves:</p>
</div>
<div class="rightbar">
<a href="/">Logout</a>
<a href="/books/new">+ Add to my shelf!</a>
</div>
</div><br><br><br>
<table>
<tr>
<th>ID</th>
<th>Title</th>
<th>Author Name</th>
<th>Posted By</th>
</tr>
<c:forEach var="book" items="${books}">
<tr>
<td> <c:out value="${book.id}"></c:out> </td>
<td> <a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a> </td>
<td> <c:out value="${book.autherName}"></c:out> </td>
<td> <c:out value="${book.user.userName}"></c:out> </td>
</tr>
</c:forEach>

</table>
</body>
</html>