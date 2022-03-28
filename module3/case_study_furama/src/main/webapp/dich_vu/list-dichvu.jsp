<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 19/03/2022
  Time: 2:52 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer</title>
    <title>Title</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>
<br>
<a class="btn btn-warning" href="/index.jsp">Về trang chủ</a>
<hr>
<br>
<a class="btn btn-primary" href="/dichVu?action=create&code=1">Thêm Dịch Vụ Villa</a>
<a class="btn btn-primary" href="/dichVu?action=create&code=2">Thêm Dịch Vụ House</a>
<a class="btn btn-primary" href="/dichVu?action=create&code=3">Thêm Dịch Vụ Room</a>
<br>
<br>
<h3 class="text-primary">Danh Sách Dịch Vụ</h3>
<table class="table">
    <thead class="table-dark">
    <tr>
        <th>Tên Dịch Vụ</th>
        <th>Mã Dịch Vụ</th>
        <th>Diện Tích</th>
        <th>Chi phí thuê</th>
        <th>Số người tối đa</th>
        <th>Kiểu Thuê</th>
        <th>Loại Dịch Vụ</th>
        <th>Tiêu Chuẩn Phòng</th>
        <th>Tiện Nghi Khác</th>
        <th>Diện Tích Hồi bơi</th>
        <th>Số Tầng</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="dichVu" items="${list}">
        <tr>
            <td>${dichVu.getTenDichVu()}</td>
            <td>${dichVu.getDichVuCode()}</td>
            <td>${dichVu.getDienTich()}</td>
            <td>${dichVu.getChiPhiThue()}</td>
            <td>${dichVu.getSoNguoiToiDa()}</td>
            <td>${dichVu.getKieuThue()}</td>
            <td>${dichVu.getLoaiDichVu()}</td>
            <td>${dichVu.getTieuChuanPhong()}</td>
            <td>${dichVu.getMoTaTienNghiKhac()}</td>
            <c:if test="${dichVu.getDienTichHoBoi() == -1}">
                <td>No hồ bơi</td>
            </c:if>
            <c:if test="${dichVu.getDienTichHoBoi() != -1}">
                <td>${dichVu.getDienTichHoBoi()}</td>
            </c:if>
            <c:if test="${dichVu.getSoTang() == -1}">
                <td>No Floor</td>
            </c:if>
            <c:if test="${dichVu.getSoTang() != -1}">
                <td>${dichVu.getSoTang()}</td>
            </c:if>
        </tr>
    </c:forEach>
    </tbody>
</table>
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
