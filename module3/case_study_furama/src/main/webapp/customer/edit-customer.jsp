<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 18/03/2022
  Time: 3:20 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Customer</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>
<center>
    <h3><a style="text-decoration: none;color: red" href="/customers">Trở về danh sách Khách Hàng</a></h3>
    <br>
    <h3><a style="text-decoration: none;color: blue" href="index.jsp">Trở về Trang Chủ</a></h3>
    <br>
    <form action="/customers?action=edit&id=${khachHang.getMaKhachHang()}" method="post">
        <table border="1" cellpadding="10px" >
            <thead>
            <h4 class="text-primary">Chỉnh sửa khách hàng :</h4>
            </thead>
            <tbody>
            <tr>
                <th>Họ Tên :</th>
                <td><input type="text" name="hoTen" value="${khachHang.getHoTen()}"></td>
                <td><p style="color: red">${errors.get("hoTen")}</p></td>
            </tr>
            <tr>
                <th>Ngày Sinh :</th>
                <td><input type="text" name="ngaySinh" value="${khachHang.getNgaySinh()}"></td>
                <td> <p style="color: red">${errors.get("ngaySinh")}</p></td>
            </tr>
            <tr>
                <th>Giới tính :</th>
                <td>
                    <select name="gioiTinh" >
                        <c:if test="${khachHang.getGioiTinh() == 0 }">
                            <option selected value="0">Nữ</option>
                            <option value="1">Nam</option>
                        </c:if>
                        <c:if test="${khachHang.getGioiTinh() == 1 }">
                            <option value="0" >Nữ</option>
                            <option selected value="1">Nam</option>
                        </c:if>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Số CMND :</th>
                <td><input type="text" name="soCMND" value="${khachHang.getSoCMND()}"></td>
                <td><p style="color: red">${errors.get("soCMND")}</p></td>
            </tr>
            <tr>
                <th>Số Điện Thoại:</th>
                <td><input type="text" name="soDienThoai" value="${khachHang.getSoDienThoai()}"></td>
                <td>  <p style="color: red">${errors.get("soDienThoai")}</p></td>
            </tr>
            <tr>
                <th>Email:</th>
                <td><input type="text" name="email" value="${khachHang.getEmail()}"></td>
                <td><p style="color: red">${errors.get("email")}</p></td>
            </tr>
            <tr>
                <th>Địa Chỉ:</th>
                <td><input type="text" name="diaChi" value="${khachHang.getDiaChi()}"></td>
                <br>
                <td> <p style="color: red">${errors.get("diaChi")}</p></td>
            </tr>
            <tr>
                <th>Loại Khách</th>
                <td>
                    <select name="loaiKhach">
                        <c:forEach var="loaiKhach" items="${loaiKhachList}">
                            <c:if test="${loaiKhach.getMaLoaiKhach() == khachHang.getLoaiKhach()}">
                                <option selected value="${loaiKhach.getMaLoaiKhach()}">${loaiKhach.getTenLoaiKhach()}</option>
                            </c:if>
                            <c:if test="${loaiKhach.getMaLoaiKhach() != khachHang.getLoaiKhach()}">
                                <option value="${loaiKhach.getMaLoaiKhach()}">${loaiKhach.getTenLoaiKhach()}</option>
                            </c:if>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Xác Nhận</th>
                <td><input type="submit" value="Chỉnh Sửa"></td>
            </tr>
            </tbody>
        </table>
    </form>
    <c:if test="${message!= null}">
        <h3 style="color: red">Chỉnh Sửa thành công</h3>
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

