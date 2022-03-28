<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 23/03/2022
  Time: 9:45 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hợp đồng chi tiết</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <br>
    <a class="btn btn-warning" href="/index.jsp">Về trang chủ</a>
    <br>
    <a class="btn btn-danger" href="/contract">Về Trang hợp đồng</a>
    <br>
    <h3 class="text-primary">Tổng Tiền Khách Hàng</h3>
    <table class="table">
        <thead class="table-dark">
        <tr>
            <th>Tên Khách Hàng</th>
            <th>Tên Dịch Vụ</th>
            <th>Chi Phí Thuê</th>
            <th>Tiền Đặt Cọc</th>
            <th>Tiền Dịch Vụ Kèm Theo</th>
            <th>Tổng Tiền Thanh Toán</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="khachHang" items="${list}">
        <tr>
            <td>${khachHang.getHoTenKhachHang()}</td>
            <td>${khachHang.getTenDichVu()}</td>
            <td>${khachHang.getChiPhiThue()}</td>
            <td>${khachHang.getTienDatCoc()}</td>
            <td>${khachHang.getTienDichVuDiKem()}</td>
            <td>${khachHang.getTongTien()}</td>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</html>
