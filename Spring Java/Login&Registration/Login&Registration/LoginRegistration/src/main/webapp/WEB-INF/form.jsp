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
<h1>Welcome!</h1>
<p>Join our growing community</p>
<h1>Register</h1>
<form:form action="/register" method="post" modelAttribute="newUser">
<label>User Name : </label>
<form:input path="userName" type="text" name="userName"/><br><br>
<form:errors path="userName"/>

<label>Email : </label>
<form:input path="email" type="text" name="email"/><br><br>
<form:errors path="email"/>

<label>Password : </label>
<form:input path="password" type="password" name="password"/><br><br>
<form:errors path="password"/>

<label>Confirm Pw : </label>
<form:input path="confirm" type="password" name="confirm"/><br><br>
<form:errors path="confirm"/>

<input type="submit" value="Register">

</form:form><br><br>

<h1>Login</h1>
<form:form action="/login" method="post" modelAttribute="newLogin">

<label>Email : </label>
<form:input path="email" type="email" name="email"/><br><br>
<form:errors path="email"/>

<label>Password : </label>
<form:input path="password" type="password" name="password"/><br><br>
<form:errors path="password"/>
<input type="submit" value="Login">


</form:form>
</body>
</html>