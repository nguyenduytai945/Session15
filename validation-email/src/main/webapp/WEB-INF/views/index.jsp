<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 7/18/2019
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Email validate</h1>
<h3 style="color:red">${message}</h3>
<form method="post" action="validate">
    <input type="text" name="email"><br>
    <input type="submit" value="validate">

</form>
</body>
</html>
