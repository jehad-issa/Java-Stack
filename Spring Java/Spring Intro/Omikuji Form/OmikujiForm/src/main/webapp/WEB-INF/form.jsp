<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/form.css">

</head>
<body>
<h1>Send an Omikuji!</h1>
<form action="/omikuji/send" method="post">
<div><label>pick any number from 5 to 25</label><br>
<input type="number" name="counter" min="5" max="25"></div><br>
<div><label>Enter the name of any city</label>
<input type="text" name="city"></div><br>
<div><label>Enter the name of any real person</label>
<input type="text" name="person"></div><br>
<div><label>Enter the professional endeavor or hobby:</label>
<input type="text" name="hobby"></div><br>
<div><label>Enter any type of living thing</label>
<input type="text" name="living"></div><br>
<div><label>say something nice to someone</label>
<textarea  name="desc" rows="4" cols="30"></textarea></div><br>
<p>send and show a friend</p>
<input type="submit" value="send" class ="send">
</form>
</body>
</html>