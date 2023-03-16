<%--
  Created by IntelliJ IDEA.
  User: camilla
  Date: 15/03/23
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<h2>Benvenuto nella home page</h2>
<p>Sei loggato come <%= request.getAttribute("users") %></p>
<a href="logout">Logout</a>
</body>
</html>
