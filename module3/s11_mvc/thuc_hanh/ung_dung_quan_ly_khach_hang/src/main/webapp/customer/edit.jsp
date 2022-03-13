<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13/03/2022
  Time: 12:57 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Customer</title>
</head>
<body>
<h1>Edit Customer</h1>
<p>
    <c:if test="${message != null}">
    <span style="color: green">${message}</span>
    </c:if>
</p>
<p>
    <a href="/customers">Back to Customer List</a>
</p>
<form method="post">
<fieldset>
    <legend>Customer Information</legend>
    <tr>
        <td>Name : </td>
        <td><input type="text" name="name" id="name" value="${customer.getName()}"></td>
    </tr>
    <tr>
        <td>Email : </td>
        <td><input type="text" name="email" id="email" value="${customer.getEmail()}"></td>
    </tr>
    <tr>
        <td>Address : </td>
        <td><input type="text" name="address" id="address" value="${customer.getAddress()}"></td>
    </tr>
    <tr>
        <td></td>
        <td><input type="submit" value="Update Customer"></td>
    </tr>
</fieldset>
</form>
</body>
</html>
