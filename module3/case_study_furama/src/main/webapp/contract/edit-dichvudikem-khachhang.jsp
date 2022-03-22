<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22/03/2022
  Time: 10:00 SA
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
    <br>
    <a class="btn btn-warning" href="/index.jsp">Về trang chủ</a>
    <a class="btn btn-danger" href="/contract?action=detail">Hợp Đồng Chi Tiết</a>
    <a class="btn btn-primary" href="/contract">Hợp Đồng</a>
    <a class="btn btn-dark" href="/contract?action=dichvu-khachhang">Khách hàng sử dụng dịch vụ</a>
    <br>
    <form method="post">
        <table border="1" cellpadding="10px" >
            <thead>
            <h4 class="text-primary">Chỉnh sửa dịch vụ khách hàng :</h4>
            </thead>
            <tbody>
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
                <th>Dịch Vụ Đi Kèm :</th>
                <td>
                    <select name="dichVuDiKem">
                        <c:forEach var="dichVuDiKem" items="${dichVuDiKemList}">
                            <c:if test="${contractDetai.getMaDichVuDiKem() == dichVuDiKem.getMaDichVuDiKem()}">
                                <option selected value="${dichVuDiKem.getMaDichVuDiKem()}">${dichVuDiKem.getTenDichVuDiKem()}</option>
                            </c:if>
                            <c:if test="${contractDetai.getMaDichVuDiKem() != dichVuDiKem.getMaDichVuDiKem()}">
                                <option value="${dichVuDiKem.getMaDichVuDiKem()}">${dichVuDiKem.getTenDichVuDiKem()}</option>
                            </c:if>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Số Lượng :</th>
                <td><input type="text" name="soLuong" value="${contractDetai.getSoLuong()}"></td>
                <td><p style="color: red">${errors.get("soLuong")}</p></td>
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

