<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
<div class="top">
<h1>Change Your Entry</h1>
<a href="/books">Back to the shelves</a>
</div>
<form:form action="/edit/${book.id}" method="POST" modelAttribute="book">
		<input type="hidden" name="_method" value="put">
    <p>
        <form:label path="title">Title :</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="autherName">Author :</form:label>
        <form:errors path="autherName"/>
        <form:input path="autherName"/>
    </p>
    <p>
        <form:label path="myThought">My Thought :</form:label>
        <form:errors path="myThought"/>
        <form:input path="myThought"/>
    </p>
    <input type="submit" value="Submit" class="btn">
    
    </form:form>
</body>
</html>