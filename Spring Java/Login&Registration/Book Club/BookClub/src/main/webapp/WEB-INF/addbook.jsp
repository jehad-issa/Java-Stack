<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new Book</title>
<link href="css/addbookstyle.css" rel="stylesheet" type="text/css">
<style>
.top{
	width:100%;
	height:100px;
	display:flex;
	align-items:center;
	justify-content:space-between;
}
.newbookform{
	width:400px;
	height:400px;
	margin:0 auto;
	border:2px solid black;
	font-size:20px;
}
.mythought,.author,.title{
	width:400px;
	height:100px;
	display:flex;
	justify-content:space-around;
	align-items:center;	
}

.btn{
position: relative;
	left:290px;
	box-shadow: 3px 4px black;
	width:80px;  
	height:30px;
}
.addtitle,.addauthor{
height:30px;
}
.addtitle{
position: relative;
	right:5px;
}

.addauthor{
position: relative;
	right:15px;
}

</style>
</head>
<body>
<div class="top">
<h1>Add a Book to Your Shelf!</h1>
<a href="/books">Back to the shelves</a>
</div><br><br>
<div class="newbookform">
<form:form action="/books/new" method="post"  modelAttribute="books">
<div class="title">
<label>Title: </label>
<form:input path="title" type="text" name="title" class="addtitle"/><br><br>
<form:errors path="title"/></div>
<div class="author">
<label>Author : </label>
<form:input path="autherName" type ="text" name="autherName" class="addauthor"/><br><br>
<form:errors path="autherName"/></div>
<div class="mythought">
<label >My Thought: </label>
<form:textarea path="myThought" rows="5" cols="30" class="addthought"></form:textarea><br><br>
<form:errors path="myThought"/></div>
<input type="submit" value="Submit" class="btn">
</form:form>
</div>
</body>
</html>