<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 23/03/2022
  Time: 1:32 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                        <h2>Manage <b>Products</b></h2>
                    </div>
                    <div class="col-sm-6">
                        <a href="#addModal" class="btn btn-success" data-toggle="modal"><i
                                class="material-icons">&#xE147;</i> <span>Add New Product</span></a>
                    </div>
                </div>
                <div class="row">
                    <form method="get">
                        <br/>
                        <input type="hidden" name="action" value="search">
                        <input class="mt-1" type="text" name="nameSearch" size="25" placeholder="Enter Product Name" value="${searchName}">
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
                    <th>STT</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Color</th>
                    <th>Category Name</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
<%--                ${product.getCategoryId()}--%>
                <c:forEach var="product" items="${productDTOList}" varStatus="loop">
                    <tr>
                        <td>${loop.count}</td>
                        <td>${product.getName()}</td>
                        <td>${product.getPrice()}</td>
                        <td>${product.getQuantity()}</td>
                        <c:forEach var="color" items="${colorList}">
                            <c:if test="${color.getId() == product.getColor()}">
                                <td>${color.getName()}</td>
                            </c:if>
                        </c:forEach>
                        <c:forEach var="category" items="${categoryList}">
                            <c:if test="${category.getId() == product.getCategoryName()}">
                                <td>${category.getName()}</td>
                            </c:if>
                        </c:forEach>
                        <td>
                            <a href="#editModal" class="edit" data-toggle="modal">
                                <i class="material-icons" data-toggle="tooltip" title="Edit" onclick='sendProductInfor("${product.getId()}", "${product.getName()}", "${product.getPrice()}", "${product.getQuantity()}", "${product.getColor()}", "${product.getCategoryName()}")'>&#xE254;</i></a>
                            <a href="#deleteModal" class="delete" data-toggle="modal">
                                <i class="material-icons" data-toggle="tooltip" title="Delete" onclick='sendProductIdName("${product.getId()}","${product.getName()}")'>&#xE872;</i></a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>


        </div>
    </div>
</div>
<!-- Add Modal HTML -->
<div id="addModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="post" action="products?action=create" class="needs-validation" novalidate>
                <div class="modal-header">
                    <h4 class="modal-title">Add Product</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Name</label>
                        <%--                        [A-Za-z0-9]+([A-Za-z0-9]+)*--%>
                        <input type="text" class="form-control" name="name" required pattern="^\w+( \w+)*$">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Name cannot have any extra spaces or no characters</div>
                        <%--                        <small class="error">hihi</small>--%>
                    </div>
                    <div class="form-group">
                        <label>Price</label>
                        <input type="text" class="form-control" name="price" required pattern="^([0]*[1-9][0-9]*)|[1-9][0-9]*$">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Price must be greater than 0</div>
                    </div>
                    <div class="form-group">
                        <label>Quantity</label>
                        <input type="text" class="form-control" name="quantity" required pattern="^\d+$">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Quantity must be greater than 0</div>
                    </div>
                    <div class="form-group">
                        <label>Color</label>
                        <select name="color">
                            <c:forEach items="${colorList}" var="color">
                                <option value="${color.getId()}">${color.getName()}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Category Name</label>
                        <select name="category_id">
                            <c:forEach items="${categoryList}" var="category">
                                <option value="${category.getId()}">${category.getName()}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-success" value="Add">
                </div>
            </form>
        </div>
    </div>
</div>

<!-- Edit Modal HTML -->
<div id="editModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="post" action="products?action=edit" class="needs-validation" novalidate >
                <input type="hidden" name="idEditModal" id="isEdit">
                <div class="modal-header">
                    <h4 class="modal-title">Edit Product</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label>Name</label>
                        <input type="text" class="form-control" name="name" required id="nameEdit"
                               pattern="^\w+( \w+)*$">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Name cannot have any extra spaces or no characters</div>
                    </div>
                    <div class="form-group">
                        <label>Price</label>
                        <input type="text" class="form-control" name="price" required id="priceEdit"
                               pattern="^([0]*[1-9][0-9]*)|[1-9][0-9]*$">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Price must be greater than 0</div>
                    </div>
                    <div class="form-group">
                        <label>Quantity</label>
                        <input type="text" class="form-control" name="quantity" required id="quantityEdit"
                               pattern="^\d+$">
                        <div class="valid-feedback">Valid</div>
                        <div class="invalid-feedback">Quantity must be greater than 0</div>
                    </div>
                    <div class="form-group">
                        <label>Color</label>
                        <select name="color" id="colorModal">
                            <c:forEach items="${colorList}" var="color">
                                    <option value="${color.getId()}" selected>${color.getName()}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Category Name</label>
                        <select name="category_id" id="categoryNameEdit">
                            <c:forEach items="${categoryList}" var="category">
                                <option selected value="${category.getId()}" selected>${category.getName()}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-info" value="Save">
                </div>
            </form>
        </div>
    </div>
</div>

<!-- Delete Modal HTML -->
<div id="deleteModal" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <form method="post" action="/products?action=delete">
                <input type="hidden" name="idModalDelete" id="isDelete">
                <div class="modal-header">
                    <h4 class="modal-title">Delete Product</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                </div>
                <div class="modal-body">
                    <p>Are you sure you want to delete this Product ?</p>
                    <p style="font-size: 20px" class="text-center text-dark" id="nameDeleteModal"></p>
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-danger" value="Delete">
                </div>
            </form>
        </div>
    </div>
</div>
<a href="/products?action=new">Welcome</a>
<a href="/products?action=add">Welcome</a>
</body>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap4.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script>
    $.extend( true, $.fn.dataTable.defaults, {
        "searching": false,
        "ordering": false
    } );
    $(document).ready(function() {
        $('#example').DataTable({
            "lengthMenu": [[5, 10, 15, -1], [5, 10, 15, "All"]]
        });
    } );
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

    function sendProductInfor(id, name, price, quantity, color, category_name) {
        document.getElementById('isEdit').value = id;
        document.getElementById('nameEdit').value = name;
        document.getElementById('priceEdit').value = price;
        document.getElementById('quantityEdit').value = quantity;
        document.getElementById('colorModal').value = color;
        document.getElementById('categoryNameEdit').value = category_name;
    }

    function sendProductIdName(id,name) {
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

