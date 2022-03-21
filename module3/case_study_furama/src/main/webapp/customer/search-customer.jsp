<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 18/03/2022
  Time: 8:30 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Delete Customer</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>
<h1 class="text-danger">Tìm thấy khách hàng :</h1>
<table class="table">
    <thead class="table-dark">
    <tr>
        <th>Tên Khách Hàng</th>
        <th>Hạng Khách Hàng</th>
        <th>Ngày Sinh</th>
        <th>Giới tính</th>
        <th>CMND</th>
        <th>Số điện thoại</th>
        <th>Email</th>
        <th>Địa Chỉ</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach var="khachHang" items="${khachHangList}">
    <tr>
        <td><c:out value="${khachHang.hoTen}"/></td>
        <td><c:out value="${khachHang.loaiKhach}"/></td>
        <td><c:out value="${khachHang.ngaySinh}"/></td>
        <c:if test="${khachHang.gioiTinh == 0}">
            <td><c:out value="Nữ"/></td>
        </c:if>
        <c:if test="${khachHang.gioiTinh == 1}">
            <td><c:out value="Nam"/></td>
        </c:if>
        <td><c:out value="${khachHang.soCMND}"/></td>
        <td><c:out value="${khachHang.soDienThoai}"/></td>
        <td><c:out value="${khachHang.email}"/></td>
        <td><c:out value="${khachHang.diaChi}"/></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
    <a href="/customers" class="btn btn-primary">Trở Lại Danh Sách Khách Hàng</a>
<br>
    <a href="/index.jsp" class="btn btn-warning">Trở Lại Trang Chủ</a>
</body>
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
