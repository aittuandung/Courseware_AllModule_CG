<%--
  Created by IntelliJ IDEA.
  User: tuan
  Date: 29/06/2022
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = rate * usd;
    %>
<p>Rate : <%=rate%></p>
<p>Usd: <%=usd%></p>
<p>Vnd: <%=vnd%></p>
</body>
</html>
