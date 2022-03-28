<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 23/03/2022
  Time: 10:28 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Form</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <div class="row">
        <div class="col-12">
            <table width="50%" align="center" style="border: 1px solid gray;border-radius: 20px" cellpadding="10px"
                   cellspacing="5px">
                <tr>
                    <div class="col-12">
                    <td>
                        <div class="input-group mb-3">
                            <span class="input-group-text" id="inputGroup-sizing-default">Họ Tên</span>
                            <input type="text" class="form-control" aria-label="Sizing example input"
                                   aria-describedby="inputGroup-sizing-default">
                        </div>
                    </td>
                    </div>
                </tr>

                <tr>
                    <div class="col-6">
                        <td>
                            <div class="input-group mb-3">
                                <span class="input-group-text" id="inputGroup-sizing-default1">Ngày Trước</span>
                                <input type="date" class="form-control" aria-label="Sizing example input"
                                       aria-describedby="inputGroup-sizing-default1">
                            </div>
                        </td>
                    </div>
                    <div class="col-6">
                        <td>
                            <div class="input-group mb-3">
                                <span class="input-group-text" id="inputGroup-sizing-default2">Ngày Sau</span>
                                <input type="date" class="form-control" aria-label="Sizing example input"
                                       aria-describedby="inputGroup-sizing-default2">
                            </div>
                        </td>
                    </div>
                </tr>


                <tr></tr>
            </table>
        </div>
    </div>
</div>

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
