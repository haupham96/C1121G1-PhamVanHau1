<%--
Created by IntelliJ IDEA.
User: Administrator
Date: 19/03/2022
Time: 1:43 CH
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Customer</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>
<center>
    <br>
    <a class="btn btn-warning" href="/index.jsp">< Về trang chủ</a>
    <br>
    <br>
    <a class="btn btn-primary" href="/dichVu">< Trở về danh sách dịch vụ</a>
    <br>
    <br>
    <h3 class="text-primary">Thêm mới dịch vụ</h3>
    <form method="post">
        <table border="1" cellpadding="10px" style="border-collapse: collapse">
            <tr>
                <th>Tên Dịch Vụ</th>
                <td><input type="text" name="tenDichVu"></td>
                <td><small class="text-danger">${map.get("tenDichVu")}</small></td>
            </tr>
            <tr>
                <th>Diện Tích</th>
                <td><input type="text" name="dienTich"></td>
                <td><small class="text-danger">${map.get("dienTich")}</small></td>
            </tr>
            <tr>
                <th>Chi Phí Thuê</th>
                <td><input type="text" name="chiPhiThue"></td>
                <td><small class="text-danger">${map.get("chiPhiThue")}</small></td>
            </tr>
            <tr>
                <th>Số người tối đa</th>
                <td><input type="text" name="soNguoiToiDa"></td>
                <td><small class="text-danger">${map.get("soNguoiToiDa")}</small></td>
            </tr>
            <tr>
                <th>Kiểu thuê</th>
                <td><select name="kieuThue">
                    <c:forEach var="kieuThue1" items="${kieuThueList}">
                        <option value="${kieuThue1.getMaKieuThue()}">${kieuThue1.getTenKieuThue()}</option>
                    </c:forEach>
                </select></td>
            </tr>
            <tr>
                <th>Loại dịch vụ</th>
                <td><select name="loaiDichVu">
                    <c:forEach var="loaiDichVu1" items="${loaiDichVuList}">
                        <c:if test="${loaiDichVu1.getMaLoaiDichVu() == code }">
                            <option value="${loaiDichVu1.getMaLoaiDichVu()}">${loaiDichVu1.getTenLoaiDichVu()}</option>
                        </c:if>
                    </c:forEach>
                </select></td>
            </tr>
            <tr>
                <th>Tiêu chuẩn phòng</th>
                <td><select id="tieuChuanPhong" name="tieuChuanPhong">
                    <option value="Vip">Vip</option>
                    <option value="Normal">Normal</option>
                </select></td>
            </tr>
            <c:if test="${code == 1}">
                <tr>
                    <th>Tiện nghi khác</th>
                    <td><input type="text"  name="moTaTienNghiKhac"></td>
                    <td><small class="text-danger">${map.get("moTaTienNghiKhac")}</small></td>
                </tr>
                <tr>
                    <th>Diện tích hồ bơi</th>
                    <td><input type="text"  name="dienTichHoBoi"></td>
                    <td><small class="text-danger">${map.get("dienTichHoBoi")}</small></td>
                </tr>
                <tr>
                    <th>Số Tầng</th>
                    <td><input type="text"  name="soTang"></td>
                    <td><small class="text-danger">${map.get("soTang")}</small></td>
                </tr>
            </c:if>
            <c:if test="${code == 2}">
                <tr>
                    <th>Tiện nghi khác</th>
                    <td><input type="text"  name="moTaTienNghiKhac"></td>
                </tr>
                <tr>
                    <th>Số Tầng</th>
                    <td><input type="text"  name="soTang"></td>
                </tr>
            </c:if>
            <c:if test="${code == 3}">
                <tr>
                    <th>Tiện nghi khác</th>
                    <td><input type="text"  name="moTaTienNghiKhac"></td>
                </tr>
            </c:if>
            <tr>
                <th>Xác Nhận :</th>
                <td>
                    <button type="submit" class="btn btn-danger">Tạo mới</button>
                </td>
            </tr>
            <tr>
                <c:if test="${message != null }">
                    <td class="text-danger">${message}</td>
                </c:if>
            </tr>
        </table>
    </form>
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

</body>
</html>
