<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 20/03/2022
  Time: 2:26 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>
<h1 class="text-danger">Tìm thấy Nhân Viên :</h1>
<table class="table">
    <thead class="table-dark">
    <tr>
        <th>Tên Nhân Viên</th>
        <th>Ngày Sinh</th>
        <th>CMND</th>
        <th>Lương</th>
        <th>Số điện thoại</th>
        <th>Email</th>
        <th>Địa Chỉ</th>
        <th>Vị Trí</th>
        <th>Trình Độ</th>
        <th>Bộ Phận</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:forEach var="nhanVien" items="${list}">
    <tr>
        <td><c:out value="${nhanVien.getHoTen()}"/></td>
        <td><c:out value="${nhanVien.getNgaySinh()}"/></td>
        <td><c:out value="${nhanVien.getSoCMND()}"/></td>
        <td><c:out value="${nhanVien.getLuong()}"/></td>
        <td><c:out value="${nhanVien.getSoDienThoai()}"/></td>
        <td><c:out value="${nhanVien.getEmail()}"/></td>
        <td><c:out value="${nhanVien.getDiaChi()}"/></td>
        <td><c:out value="${nhanVien.getViTri()}"/></td>
        <td><c:out value="${nhanVien.getTrinhDo()}"/></td>
        <td><c:out value="${nhanVien.getBoPhan()}"/></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/employee" class="btn btn-primary">Trở Lại Danh Sách Nhân Viên</a>
<br>
<a href="/index.jsp" class="btn btn-warning">Trở Lại Trang Chủ</a>
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
