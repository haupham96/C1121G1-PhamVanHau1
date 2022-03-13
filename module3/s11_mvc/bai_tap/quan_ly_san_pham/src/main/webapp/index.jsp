<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13/03/2022
  Time: 4:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<h1>Products List</h1>
<p>
    <a href="/products?action=create">Create new Product</a>
</p>
<form action="/products?action=search" method="post">
    <input type="text" name="nameSearch" placeholder="input name to search">
    <input type="submit" value="search">
</form>
<table style="border-collapse: collapse;border: 1px solid black">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Maunufacturer</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getManufacturer()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">Edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
