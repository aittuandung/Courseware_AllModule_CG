<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 13/07/2022
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Đây là home</h1>
<table>
    <c:forEach var="p" items="${products}">
    <tr>
        <td>${p.id}</td>
        <td>${p.name}</td>
        <td><img src="${p.img}" width="300" height="250"></td>
        <td>${p.price}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
