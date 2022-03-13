<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13/03/2022
  Time: 5:44 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
<p>
    <a href="/products">Back to Main</a>
</p>
<h1>Product detail :</h1>
<table style="border-collapse: collapse;border: black 1px solid">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Manufacturer</td>
    </tr>
    <tr>
        <td>${product.getName()}</td>
        <td>${product.getPrice()}</td>
        <td>${product.getDescription()}</td>
        <td>${product.getManufacturer()}</td>
    </tr>
</table>
</body>
</html>
