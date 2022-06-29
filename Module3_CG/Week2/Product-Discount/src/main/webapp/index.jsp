<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form method="post" action="/display-discount">
    <p>Product Description</p>
    <input type="text" name="txtDes">
    <p>List Price</p>
    <input type="text" name="txtPrice">
    <p>Discount Percent</p>
    <input type="text" name="txtDiscount"><br><br>
    <input type="submit" id="submit" value="Calculate Discount">
</form>
</body>
</html>