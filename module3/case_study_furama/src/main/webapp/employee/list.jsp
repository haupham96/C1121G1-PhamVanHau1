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
    <title>List Employee</title>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/employee?action=delete" method="post">
                <input type="hidden" name="idModal" id="idModal">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Xác Nhận Xoá Nhân Viên ?</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <p style="font-size: 30px;color: #0a58ca" name="name" id ="name"></p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Huỷ</button>
                    <button type="submit" class="btn btn-primary">Xác Nhận</button>
                </div>
            </form>
        </div>
    </div>
</div>
<br>
<a class="btn btn-warning" href="/index.jsp">Về trang chủ</a>
<center>
    <h1>List Employee</h1>

    <tr>
        <h2>
            <a href="/employee?action=create">Add New Employee</a>
        </h2>
    </tr>
    <tr>
        <form action="/employee" method="post">
            <input type="hidden" name="action" value="search">
            <input type="text" name="searchName">
            <input type="submit" value="Search By Name">
        </form>
    </tr>

</center>
<div align="center">
</div>
<table border="1" id="example" class="table table-striped table-bordered">
    <thead>
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
        <th>Chức Năng</th>
    </tr>
    </thead>
    <tbody>
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
            <td>
                <a class="btn btn-primary" href="/employee?action=edit&id=${nhanVien.getMaNhanVien()}">Edit</a>
                <button onclick="deleteNhanVien('${nhanVien.getMaNhanVien()}','${nhanVien.getHoTen()}')" type="button" class="btn btn-primary"
                        data-toggle="modal" data-target="#exampleModal">
                    Delete
                </button>
            </td>
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
<script>
    $.extend(true, $.fn.dataTable.defaults, {
        "searching": false,
        "ordering": false
    });
    $(document).ready(function () {
        $('#example').DataTable({
            "lengthMenu": [[5, 10, 15, -1], [5, 10, 15, "All"]]
        });
    });
</script>
<script>
    function deleteNhanVien(maNhanVien,tenNhanVien) {
        document.getElementById("idModal").value = maNhanVien ;
        document.getElementById("name").innerText = tenNhanVien ;
    }
</script>
</html>
