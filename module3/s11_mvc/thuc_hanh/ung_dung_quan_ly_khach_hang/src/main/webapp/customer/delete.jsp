<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13/03/2022
  Time: 3:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Customer</title>
</head>
<body>
<h1>Delete Customer</h1>
<p>
    <a href="/customers">Back to Customers List</a>
</p>
<form method="post">
    <h3>Are you sure ?</h3>
    <fieldset>
        <legend>Customer Information</legend>
        <table>
            <tr>
                <td>Name :</td>
                <td>${customer.getName()}</td>
            </tr>
            <tr>
                <td>Email :</td>
                <td>${customer.getEmail()}</td>
            </tr>
            <tr>
                <td>Address :</td>
                <td>${customer.getAddress()}</td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Delete Customer"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
