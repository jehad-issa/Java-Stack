<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>New Dojo</h1>


<form:form action="/dojos/new" method="post" modelAttribute="dojo" >
    <p>
        <form:label path="name">name:</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>


    <input type="submit" value="Submit" class="btn btn-primary"/>
</form:form>

</body>
</html>