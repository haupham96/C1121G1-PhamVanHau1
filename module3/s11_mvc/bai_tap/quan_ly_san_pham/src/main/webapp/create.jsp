<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13/03/2022
  Time: 5:44 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<h1>Create new Product</h1>
<p>
    <a href="/products">Back to List Product</a>
</p>
<p>
    <c:if test="${message != null}">
        <span style="color: cyan">${message}</span>
    </c:if>
</p>
<form method="post">
    <fieldset>
        <legend>Create New Product</legend>
        <tr>
            <td>Name :</td>
            <td><input type="text" name="name"></td>
        </tr>
        <br>
        <tr>
            <td>Price :</td>
            <td><input type="text" name="price"></td>
        </tr>
        <br>
        <tr>
            <td>Description : </td>
            <td><input type="text" name="description"></td>
        </tr>
        <br>
        <tr>
            <td>Manufacturer :</td>
            <td><input type="text" name="manufacturer"></td>
        </tr>
        <br>
        <tr>
            <td></td>
            <td><input type="submit" value="Add Customer"></td>
        </tr>
    </fieldset>
</form>
</body>
</html>
