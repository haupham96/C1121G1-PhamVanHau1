<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 21/03/2022
  Time: 11:33 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Thêm mới Hợp Đồng</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>
<center>
    <h3><a class="btn btn-warning" style="text-decoration: none;color: white" href="index.jsp">Trở về Trang Chủ</a></h3>
    <br>
    <h3><a class="btn btn-primary" style="text-decoration: none;color: white" href="/contract">Trở về Hợp Đồng</a></h3>
    <br>
    <form method="post">
        <table border="1" cellpadding="10px">
            <thead>
            <h4 class="text-primary">Tạo mới Hợp Đồng :</h4>
            </thead>
            <tbody>
            <tr>
                <th>Ngày Bắt Đầu</th>
                <td><input type="text" name="ngayLamHopDong"></td>
                <td><p style="color: red">${errors.get("ngayLamHopDong")}</p></td>
            </tr>
            <tr>
                <th>Ngày Kết Thúc</th>
                <td><input type="text" name="ngayKetThuc"></td>
                <td><p style="color: red">${errors.get("ngayKetThuc")}</p></td>
            </tr>
            <tr>
                <th>tiền Đặt Cọc</th>
                <td><input type="text" name="tienDatCoc"></td>
                <td><p style="color: red">${errors.get("tienDatCoc")}</p></td>
            </tr>
            <tr>
                <th>Tên Nhân Viên :</th>
                <td>
                    <select name="maNhanVien">
                        <c:forEach var="nhanVien" items="${maNhanVienList}">
                            <option value="${nhanVien.getMaNhanVien()}">${nhanVien.getTenNhanVien()}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Tên Khách Hàng:</th>
                <td>
                    <select name="maKhachHang">
                        <c:forEach var="khachHang" items="${maKhachHangList}">
                            <option value="${khachHang.getMaKhachHang()}">${khachHang.getTenKhachHang()}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Tên Dịch Vụ :</th>
                <td>
                    <select name="maDichVu">
                        <c:forEach var="dichVu" items="${maDichVuList}">
                            <c:if test="${dichVu.getLoaiDichVu() != 3}">
                                <option value="${dichVu.getMaDichVu()}">${dichVu.getTenDichVu()}</option>
                            </c:if>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Xác Nhận</th>
                <td><input type="submit" value="Tạo Mới"></td>
            </tr>
            </tbody>
        </table>
    </form>
    <c:if test="${message!= null}">
        <h3 style="color: red">Thêm mới thành công</h3>
    </c:if>
</center>
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
