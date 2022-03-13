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
    <title>Delete</title>
</head>
<body>
<h1>Delete Product</h1>
<p>
    <a href="/products">Back to List Products</a>
</p>
<form method="post">
    <fieldset>
        <legend>Delete This Product ?</legend>
        <tr>
            <td>Name :</td>
            <td>${product.getName()}</td>
        </tr>
        <br>
        <tr>
            <td>Price :</td>
            <td>${product.getPrice()}</td>
        </tr>
        <br>
        <tr>
            <td>Description :</td>
            <td>${product.getDescription()}</td>
        </tr>
        <br>
        <tr>
            <td>Manufacturer :</td>
            <td>${product.getManufacturer()}</td>
        </tr>
        <br>
        <tr>
            <td></td>
            <td><input type="submit" value="Delete"></td>
        </tr>
    </fieldset>
</form>
</body>
</html>
