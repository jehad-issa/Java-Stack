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
<h1>Save Travels</h1>
<table>
	<tr>
		<th>Expense</th>
		<th>Vendor</th>
		<th>Amount</th>
		<th>Actions</th>
	</tr>
	   
	   <c:forEach var="travel" items="${travels}">
	<tr>
		<td><c:out value="${travel.expense}"></c:out></td>
		<td><c:out value="${travel.vendor }"></c:out></td>
		<td><c:out value="${travel.amount }"></c:out></td>
		<td><a href="/expense/edit/${travel.id}">edit</a> </td>
		<td>
		<form action="/expense/${travel.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form></td>
		 
		
	</tr>
	</c:forEach>
</table>

<h1>Add an expense:</h1>
<form:form action="/expense" method="post" modelAttribute="travel">
    <p>
        <form:label path="expense">Expense name:</form:label>
        <form:errors path="expense"/>
        <form:input path="expense"/>
    </p>
    <p>
        <form:label path="vendor">Vendor:</form:label>
        <form:errors path="vendor"/>
        <form:input path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount:</form:label>
        <form:errors path="amount"/>
        <form:input path="amount"/>
    </p>
    
    <input type="submit" value="Submit"/>
</form:form>    </body>
</html>