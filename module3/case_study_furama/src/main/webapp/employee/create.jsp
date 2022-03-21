<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 20/03/2022
  Time: 2:25 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Employee</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>
<center>
    <h3><a class="btn btn-warning" style="text-decoration: none;color: white" href="index.jsp">Trở về Trang Chủ</a></h3>
    <br>
    <h3><a class="btn btn-primary" style="text-decoration: none;color: white" href="/employee">Trở về danh sách Nhân
        Viên</a></h3>
    <br>

    <form method="post">
        <table border="1" cellpadding="10px">
            <thead>
            <h4 class="text-primary">Tạo mới Nhân Viên :</h4>
            </thead>
            <tbody>
            <tr>
                <th>Họ Tên :</th>
                <td><input type="text" name="hoTen"></td>
                <td><p style="color: red">${errors.get("hoTen")}</p></td>
            </tr>
            <tr>
                <th>Ngày Sinh :</th>
                <td><input type="text" name="ngaySinh"></td>
                <td><p style="color: red">${errors.get("ngaySinh")}</p></td>
            </tr>
            <tr>
                <th>Số CMND :</th>
                <td><input type="text" name="soCMND"></td>
                <td><p style="color: red">${errors.get("soCMND")}</p></td>
            </tr>
            <tr>
                <th>Lương :</th>
                <td><input type="text" name="luong"></td>
                <td><p style="color: red">${errors.get("luong")}</p></td>
            </tr>
            <tr>
                <th>Số Điện Thoại:</th>
                <td><input type="text" name="soDienThoai"></td>
                <td><p style="color: red">${errors.get("soDienThoai")}</p></td>
            </tr>
            <tr>
                <th>Email:</th>
                <td><input type="text" name="email"></td>
                <td><p style="color: red">${errors.get("email")}</p></td>
            </tr>
            <tr>
                <th>Địa Chỉ:</th>
                <td><input type="text" name="diaChi"></td>
                <br>
                <td><p style="color: red">${errors.get("diaChi")}</p></td>
            </tr>
            <tr>
                <th>Vị Trí</th>
                <td>
                    <select name="viTri">
                        <c:forEach var="viTri1" items="${viTriList}">
                            <option value="${viTri1.getMaViTri()}">${viTri1.getTenViTri()}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Trình Độ</th>
                <td>
                    <select name="trinhDo">
                        <c:forEach var="trinhDo1" items="${trinhDoList}">
                            <option value="${trinhDo1.getMaTrinhDo()}">${trinhDo1.getTenTrinhDo()}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Bộ Phận</th>
                <td>
                    <select name="boPhan">
                        <c:forEach var="boPhan1" items="${boPhanList}">
                            <option value="${boPhan1.getMaBoPhan()}">${boPhan1.getTenBoPhan()}</option>
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
