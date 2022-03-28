<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22/03/2022
  Time: 8:38 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Khách hàng sử dụng dịch vụ</title>
    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <br>
    <a class="btn btn-warning" href="/index.jsp">Về trang chủ</a>
    <a class="btn btn-danger" href="/contract?action=detail">Hợp Đồng Chi Tiết</a>
    <a class="btn btn-primary" href="/contract">Hợp Đồng</a>
    <br>
    <br>
    <h3 class="text-primary">Danh Sách khách hàng sử dụng dịch vụ đi kèm</h3>
    <table border="1" id="example" class="table table-striped table-bordered">
        <thead class="table-dark">
        <tr>
            <th>Họ Tên</th>
            <th>Dịch Vụ Đi Kèm</th>
            <th>Số Lượng</th>
            <th class="text-center">Sửa</th>
            <th class="text-center">Xoá</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="hopDong" items="${list}">
        <tr>
            <td>${hopDong.getHoTen()}</td>
            <td>${hopDong.getDichVuDiKem()}</td>
            <td>${hopDong.getSoLuong()}</td>
            <td class="text-center">
                <a class="btn btn-primary"
                   href="/contract?action=update-khachhang-dich-vu-di-kem&maHopDongChiTiet=${hopDong.getMaHopDongChiTiet()}">Chỉnh
                    Sửa</a>
            </td>
            <td class="text-center">
                <button onclick="deleteHopDongChiTiet('${hopDong.getMaHopDongChiTiet()}','${hopDong.getHoTen()}','${hopDong.getDichVuDiKem()}','${hopDong.getSoLuong()}')"
                        type="button" class="btn btn-primary"
                        data-toggle="modal" data-target="#exampleModal">
                    Xoá Dịch Vụ Đi Kèm
                </button>
            </td>
            </c:forEach>
        </tr>
        </tbody>
    </table>
</div>
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/contract?action=xoa-khachhang-dich-vu-di-kem" method="post">
                <input type="hidden" name="idHopDongChiTiet" id="idHopDongChiTiet">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Xác Nhận Xoá Dịch Vụ Này ?</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <table class="table table-dark">
                        <thead class="table-dark">
                        <tr>
                            <td>Tên Khách Hàng</td>
                            <td>Tên Dịch Vụ</td>
                            <td>Số Lượng</td>
                        </tr>
                        </thead>
                        <tbody class="table-light table-hover">
                        <tr>
                            <td style="font-size: 18px;color: black" name="tenKhachHang" id="tenKhachHang"></td>
                            <td style="font-size: 18px;color: black" name="tenDichVu" id="tenDichVu"></td>
                            <td style="font-size: 18px;color:black" name="soLuong" id="soLuong"></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Huỷ</button>
                    <button type="submit" class="btn btn-primary">Xác Nhận</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<script>
    function deleteHopDongChiTiet(maHopDongChiTiet, tenKhachHang, tenDichVu, soLuong) {
        document.getElementById("idHopDongChiTiet").value = maHopDongChiTiet;
        document.getElementById("tenKhachHang").innerText = tenKhachHang;
        document.getElementById("tenDichVu").innerText = tenDichVu;
        document.getElementById("soLuong").innerText = soLuong;
    }
</script>
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
</html>
