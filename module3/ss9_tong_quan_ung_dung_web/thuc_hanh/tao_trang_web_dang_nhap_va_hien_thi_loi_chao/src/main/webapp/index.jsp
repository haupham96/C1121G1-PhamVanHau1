<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 10/03/2022
  Time: 1:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style type="text/css">
        .login {
            height: 180px;
            width: 230px;
            margin: 0;
            padding: 10px;
            border: 1px #CCC solid;
        }

        .login input {
            padding: 5px;
            margin: 5px
        }
    </style>
</head>
<body>
<form method="post" action="/index">
    <div>
        <input type="text" name="username" size="30" placeholder="username">
        <br>
        <input type="password" name="password" size="30" placeholder="password">
        <br>
        <input type="submit" value="sign in">
    </div>
</form>
</body>
</html>
