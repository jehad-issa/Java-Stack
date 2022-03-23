<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login and Registration</title>
<link href="css/formstyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1>Book Club</h1>
<p>A place for friends to shear thoughts on books</p>
<div class="container">
<div class="register">
<h1>Register</h1>
<form:form action="/register" method="post"  modelAttribute="newUser">
<label>User Name : </label>
<form:input path="userName" type="text" name="userName" class="regname"/><br><br>
<form:errors path="userName"/>

<label>Email : </label>
<form:input path="email" type="text" name="email" class="regemail"/><br><br>
<form:errors path="email"/>

<label>Password : </label>
<form:input path="password" type="password" name="password" class="regpassword" /><br><br>
<form:errors path="password"/>

<label>Confirm Pw : </label>
<form:input path="confirm" type="password" name="confirm" class="regconfirm"/><br><br>
<form:errors path="confirm"/>

<input type="submit" value="Register" class="btn">

</form:form>
</div>
<div class="login">
<h1>Login</h1>
<form:form action="/login" method="post" modelAttribute="newLogin">

<label>Email : </label>
<form:input path="email" type="email" name="email"  class="logemail"/><br><br>
<form:errors path="email"/>

<label>Password : </label>
<form:input path="password" type="password" name="password"/><br><br>
<form:errors path="password"/>
<input type="submit" value="Login" class="btn">
</form:form>
</div>
</div>
</body>
</html>