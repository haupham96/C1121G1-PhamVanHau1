<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 24/03/2022
  Time: 8:35 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Mangage Products</title>
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
<div class="container-fluid-xl">
    <div class="table-responsive">
        <div class="table-wrapper">
            <div class="table-title">
                <div class="row">
                    <div class="col-sm-6">
                        <h2><b>DANH SÁCH MƯỢN</b></h2>
                    </div>
                    <div class="col-sm-6">
                        <a href="/sach" class="btn btn-success"><i
                                class="material-icons">&#xE147;</i> <span>Về Trang Thư Viện Sách</span></a>
                    </div>
                </div>
                <div class="row">
                    <form method="get">
                        <br/>
                        <input type="hidden" name="action" value="search">
                        <input class="mt-1" type="text" name="nameSearch" size="25" placeholder="Nhập Tên Sách">
                        <%--                        <input type="text" name="search_by_price" size="25" placeholder="Enter Price">--%>
                        <%--                        <input type="text" name="search_by_color" size="25" placeholder="Enter Color">--%>
                        <%--                        <input type="text" name="search_by_category" size="25" placeholder="Enter Category">--%>
                        <input class="btn btn-dark" type="submit" size="25" value="Search">
                    </form>
                </div>
            </div>
            <table id="example" class="table table-striped table-hover">
                <thead>
                <tr>
                    <th>Mã Mượn Sách</th>
                    <th>Tên Sách</th>
                    <th>Tên HS</th>
                    <th>Lớp</th>
                    <th>Ngày Mượn</th>
                    <th>Ngày Trả</th>
                    <th>Trả Sách</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="sach" items="${list}">
                    <tr>
                        <td>${sach.getMaMuonSach()}</td>
                        <td>${sach.getBookName()}</td>
                        <td>${sach.getStudentName()}</td>
                        <td>${sach.getStudentClass()}</td>
                        <td>${sach.getBorrowDate()}</td>
                        <td>${sach.getReturnDate()}</td>
                        <td>
                            <a onclick="getNameBookAndId('${sach.getBookName()}','${sach.getMaMuonSach()}','${sach.getBookId()}')"
                               href="#modalAlert" data-toggle="modal"
                               class="btn btn-primary text-white">Trả Sách</a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<div id="modalAlert" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form action="/sach?action=tra-sach" method="post">
                <input type="hidden" name="maMuonSach" id="maMuonSach">
                <input type="hidden" name="maSach" id="maSach">
                <div class="modal-header">
                    <h4 class="modal-title">trả lại sách này ?</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <p style="font-size: 20px" class="text-center text-dark" id="tenSach"></p>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-dark" data-dismiss="modal" value="Huỷ">
                    <input type="submit" class="btn btn-primary" value="OK">
                </div>
            </form>
        </div>
    </div>
</div>

</body>
<script>
    function getNameBookAndId(name, maMuonSach, idSach) {
        document.getElementById('tenSach').innerText = name;
        document.getElementById('maMuonSach').value = maMuonSach;
        document.getElementById('maSach').value = idSach;
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

    function sendProductInfor(id, name, price, quantity, theMuonSach, category_name) {
        document.getElementById('isEdit').value = id;
        document.getElementById('nameEdit').value = name;
        document.getElementById('priceEdit').value = price;
        document.getElementById('quantityEdit').value = quantity;
        document.getElementById('colorModal').value = theMuonSach;
        document.getElementById('categoryNameEdit').value = category_name;
    }

    function sendProductIdName(id, name) {
        document.getElementById('isDelete').value = id;
        document.getElementById('nameDeleteModal').innerText = name;
    }

    // Disable form submissions if there are invalid fields
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
