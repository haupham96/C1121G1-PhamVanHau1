<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13/03/2022
  Time: 6:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
<p>
    <a href="/products">Back to List Product</a>
</p>
<h3>Product found :</h3>
<table style="border-collapse: collapse;border: 1px solid black">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Maunufacturer</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getManufacturer()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
