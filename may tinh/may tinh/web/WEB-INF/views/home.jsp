<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 19/07/2019
  Time: 4:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculate" method="get">
    <h2><b>Caculator</b></h2>
    <input type="number" name="number1">
    <input type="number" name="number2"><br><br>
    <input type="submit" value="addition(+)" name="operator">
    <input type="submit" value="subtraction(-)" name="operator">
    <input type="submit" value="multiplication(x)" name="operator">
    <input type="submit" value="division(/)" name="operator">
</form>
${result}
</body>
</html>
