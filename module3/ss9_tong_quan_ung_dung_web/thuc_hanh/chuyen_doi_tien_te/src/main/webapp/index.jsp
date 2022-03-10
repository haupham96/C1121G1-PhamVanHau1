<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 10/03/2022
  Time: 2:03 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Currency Converter</h1>
<form action="/CurrencyConverter" method="get">
    <label>Rate : </label> <br>
    <input type="text" name="rate" placeholder="Rate" size="30" value="22000">
    <br>
    <label>USD : </label> <br>
    <input type="text" name="usd" placeholder="USD" size="30" value="0">
    <br>
    <input type="submit" value="Converter">
</form>
</body>

</html>
