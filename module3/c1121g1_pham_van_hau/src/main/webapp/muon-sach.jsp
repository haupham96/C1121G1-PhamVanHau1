<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 24/03/2022
  Time: 8:35 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Edit Products</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="/bootstrap-5.0.2-dist/style.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-6 mx-auto">
            <form method="post" action="/sach?action=muon-sach" class="needs-validation" novalidate>
                <input type="hidden" name="sachId" id="sachId" value="${sach.getBookId()}">
                <div class="modal-header">
                    <h4 class="modal-title">Mượn Sách</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Mã mượn sách</label>
                        <input type="text" class="form-control" name="maMuonSach" required id="maMuonSach"
                               pattern="^(MS-)[0-9]{4}$" >
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">sai định dạng MS-0001</div>
                    </div>
                    <div class="form-group">
                        <label>Tên Sách</label>
                        <input disabled type="text" class="form-control" name="tenSach"  id="tenSach" value="${sach.getBookName()}">
                    </div>
                    <div class="form-group">
                        <label>Tên Học Sinh</label>
                        <select name="tenHocSinh" id="colorModal">
                            <c:forEach items="${hocSinhList}" var="hocSinh">
                                <option value="${hocSinh.getStudentId()}" selected>${hocSinh.getStudentName()}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Ngày mượn sách</label>
                        <input disabled type="text" class="form-control" name="ngayMuon" required id="ngayMuon"
                                value="${now}">
                    </div>
                    <div class="form-group">
                        <label>Ngày trả</label>
                        <input type="date" class="form-control" name="ngayTra" required id="ngayTra">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">không để trống</div>
                    </div>
                </div>
                <div class="modal-footer">
                    <a href="/sach" class="btn btn-dark">Huỷ</a>
                    <input type="submit" class="btn btn-info" value="Mượn">
                </div>
            </form>
        </div>
    </div>
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
    $(document).ready(function () {
        // Activate tooltip
        $('[data-toggle="tooltip"]').tooltip();

        // Select/Deselect checkboxes
        var checkbox = $('table tbody input[type="checkbox"]');
        $("#selectAll").click(function () {
            if (this.checked) {
                checkbox.each(function () {
                    this.checked = true;
                });
            } else {
                checkbox.each(function () {
                    this.checked = false;
                });
            }
        });
        checkbox.click(function () {
            if (!this.checked) {
                $("#selectAll").prop("checked", false);
            }
        });
    });
    (function () {
        'use strict';
        window.addEventListener('load', function () {
            // Get the forms we want to add validation styles to
            var forms = document.getElementsByClassName('needs-validation');
            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function (form) {
                form.addEventListener('submit', function (event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();
</script>
</html>

