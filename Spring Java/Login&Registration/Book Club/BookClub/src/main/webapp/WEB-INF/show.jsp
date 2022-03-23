<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.top{
	width:100%;
	height:80px;
	display:flex;
	align-items:center;
	justify-content:space-between;
	}
	
.btn{
	box-shadow: 3px 4px black;
	width:80px;  
	height:30px;
	}
	.username{
	color:red;
	}
</style>
</head>
<body>
<div class="top">
<h1><c:out value="${book.title}"> </c:out> </h1>
<a href="/books">Back to the shelves</a>
</div>
<h2 ><c:out value="${book.user.userName}"></c:out> read <c:out value="${book.title}"  > </c:out> by <c:out value="${book.autherName}"> </c:out></h2><hr>
<h3>Thought :</h3>
<p><c:out value="${book.myThought}"> </c:out><hr>

<a href="/books/${book.id}/edit">Edit</a>

</body>
</html>