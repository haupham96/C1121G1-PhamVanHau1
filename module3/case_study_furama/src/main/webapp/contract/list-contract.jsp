<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 21/03/2022
  Time: 11:33 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Hợp Đồng</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <br>
    <a class="btn btn-warning" href="/index.jsp">Về trang chủ</a>
    <a class="btn btn-danger" href="/contract?action=detail">Hợp Đồng Chi Tiết</a>
    <a class="btn btn-primary" href="/contract?action=create">Thêm Hợp Đồng</a>
    <a class="btn btn-secondary" href="/contract?action=dichvu-khachhang">Danh Sách khách hàng sử dụng dịch vụ đi kèm</a>
    <a class="btn btn-success" href="/contract?action=tinhtien">Tổng Chi Phí Của Khách Hàng</a>
    <br>
    <h3 class="text-primary">Danh Sách Hợp Đồng</h3>
    <table class="table">
        <thead class="table-dark">
        <tr>
            <th>Mã hợp đồng</th>
            <th>Ngày Làm Hợp Đồng</th>
            <th>Ngày Kết Thúc</th>
            <th>Tiền Đặt Cọc</th>
            <th>Tên Nhân Viên</th>
            <th>Tên Khách Hàng</th>
            <th>Loại Dịch Vụ</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="hopDong" items="${list}">
        <tr>
            <td>${hopDong.getMaHopDong()}</td>
            <td>${hopDong.getNgayLamHopDong()}</td>
            <td>${hopDong.getNgayKetThuc()}</td>
            <td>${hopDong.getTienDatCoc()}</td>
            <td>${hopDong.getMaNhanVien()}</td>
            <td>${hopDong.getMaKhachHang()}</td>
            <td>${hopDong.getMaDichVu()}</td>
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

