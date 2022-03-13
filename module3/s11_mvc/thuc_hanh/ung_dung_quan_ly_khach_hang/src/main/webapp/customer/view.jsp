<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13/03/2022
  Time: 3:51 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Customer Detail</title>
</head>
<body>
<h1>View Customer</h1>
<p>
  <a href="/customers">Back to Customers List</a>
</p>
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
</table>
</body>
</html>
