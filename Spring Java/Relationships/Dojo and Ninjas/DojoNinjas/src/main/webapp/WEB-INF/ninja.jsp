<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>New Ninja</h1>
<form:form action="/ninjas/new" method="post" modelAttribute="ninjas" >
    <p>
    <form:label path="dojo">dojo</form:label>
    <form:errors path="dojo"/>
    <form:select path="dojo">
      <c:forEach var="dojo" items="${dojos}">
      <form:option value="${dojo.id}"><c:out value="${dojo.name}"></c:out></form:option>
      </c:forEach>
    </form:select>

    </p>
    <p>
        <form:label path="firstName">first name:</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">last name:</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
    <p>
        <form:label path="age">age:</form:label>
        <form:errors path="age"/>
        <form:input path="age"/>
    </p>

    <input type="submit" value="Submit" class="btn btn-primary"/>
</form:form>
</body>
</html>