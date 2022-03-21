<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16/03/2022
  Time: 1:40 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>HomePage</title>
    <link rel="stylesheet" href="/bootstrap/bootstrap-5.0.2-dist/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-6 float-start">
            <img class="mt-3" src="/picture/FURAMA.png" width="80px" height="80px">
        </div>
        <div class="col-6 float-end">
            <p class="mt-3 text-end">Login Information</p>
        </div>
    </div>
</div>
<div class="container-fluid">
    <div class="row border-bottom border-dark border-top border-dark position-relative text-center">
        <div class="col-2 mt-3">
            <a class="text-decoration-none" href="index.jsp">Home</a>
        </div>
        <div class="col-2 mt-3">
            <a class="text-decoration-none" href="/employee">Employee</a>
        </div>
        <div class="col-2 mt-3">
            <a class="text-decoration-none" href="/customers">Customer</a>
        </div>
        <div class="col-2 mt-3">
            <a class="text-decoration-none" href="/dichVu">Service</a>
        </div>
        <div class="col-2 mt-3">
            <a class="text-decoration-none" href="#">Contact</a>
        </div>
        <div class="col-2">
            <form class="position-relative" action="/furama?action=search" method="post">
                <input class="mt-3" type="text" name="search" placeholder="Search">
            </form>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row">
        <div class="col-3 border-start border-dark border-end border-dark border-bottom border-dark" style="height: 700px">

        </div>
        <div class="col-9 border-end border-dark border-bottom border-dark" style="height: 700px"></div>
    </div>
</div>
<div class="container-fluid">
    <div class="row border-bottom border-dark" style="height: 200px">

    </div>
</div>

</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.bundle.min.js"></script>
<script src="bootstrap/bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
        integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
</html>
