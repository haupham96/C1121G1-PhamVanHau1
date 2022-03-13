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
    <title>Edit</title>
</head>
<body>
<p>
    <a href="/products">Back to Main</a>
</p>
<h1>Edit Product</h1>
<p>
    <c:if test="${message!=null}">
        <span style="color: red">${message}</span>
    </c:if>
</p>
<form method="post">
    <fieldset>
        <legend>Edit Detail :</legend>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value="${product.getName()}"></td>
        </tr>
        <br>
        <tr>
            <td>Price</td>
            <td><input type="text" name="price" value="${product.getPrice()}"></td>
        </tr>
        <br>
        <tr>
            <td>Description</td>
            <td><input type="text" name="des" value="${product.getDescription()}"></td>
        </tr>
        <br>
        <tr>
            <td>Manufacturer</td>
            <td><input type="text" name="manufacturer" value="${product.getManufacturer()}"></td>
        </tr>
        <br>
        <tr>
            <td>Submit</td>
            <td><input type="submit" value="Edit"></td>
        </tr>
    </fieldset>
</form>
</body>
</html>
