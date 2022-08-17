<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Management Application</title>
</head>
<body>
<center>
    <h1>Student Management</h1>
    <h2>
        <a href="/students?action=create">Add New Student</a>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Students</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Date</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Class</th>

        </tr>
        <c:forEach var="student" items="${listStudent}">
            <tr>
                <td><c:out value="${student.id}"/></td>
                <td><c:out value="${student.name}"/></td>
                <td><c:out value="${student.date}"/></td>
                <td><c:out value="${student.address}"/></td>
                <td><c:out value="${student.phone}"/></td>
                <td><c:out value="${student.email}"/></td>
                <td><c:out value="${student.classHv}"/></td>
                <td>
                    <a href="/students?action=edit&id=${student.id}">Edit</a>
                    <a href="/students?action=delete&id=${student.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>