<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">

</head>
<body>
<h1>Fruit Store</h1>
<div class=container>
<table>
<tr>
<th>name</th>
<th>price</th>
</tr>
<c:forEach var="oneFruit" items="${FruitFromMyController}">
        <tr>
        <td><c:out value="${oneFruit.name}"></c:out></td>
                <td><c:out value="${oneFruit.price}"></c:out></td>
        
        </tr>
    </c:forEach>
</table>
</div>
</body>
</html>