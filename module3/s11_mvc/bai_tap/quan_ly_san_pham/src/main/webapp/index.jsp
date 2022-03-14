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
    <link href="/static/bootstrap-5.0.2-dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1 class="text-center text-danger">Products List</h1>
<p style="width: 350px">
    <a href="/products?action=create" class="text-light bg-dark" style="text-decoration: none">Create new Product</a>
</p>
<form action="/products?action=search" method="post">
    <div class="input-group mb-3" style="width: 500px;position: relative">
        <input placeholder="Input Name To Search" type="text" class="form-control" aria-label="Sizing example input"
               aria-describedby="inputGroup-sizing-default" style="position: relative;float: left" name="nameSearch">
        <button type="submit" class="btn btn-primary" style="position: relative;float: left">Search</button>
    </div>

</form>
<table class="table" style="border-collapse: collapse">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
        <th scope="col">Description</th>
        <th scope="col">Maunufacturer</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach items="${products}" var="product">
    <tr itemscope="row">
        <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
        <td>${product.getPrice()}</td>
        <td>${product.getDescription()}</td>
        <td>${product.getManufacturer()}</td>
        <td><a href="/products?action=edit&id=${product.getId()}">Edit</a></td>
        <td><a href="/products?action=delete&id=${product.getId()}">Delete</a></td>
    </tr>
    </c:forEach>
    </tr>
    </tbody>
</table>
</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
        crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
        integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>
</html>
