<%-- 
    Document   : addTeachers
    Created on : 24-Mar-2020, 20:33:34
    Author     : vladi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add teachers to the school</title>
    </head>
    <body>
        <h1>Add teachers</h1>
        <p id="info">${info}</p>
        Имя учителя:<input type="text" name="Fname" value="${Fname}">
        Фамилия учителя:<input type="text" name="Lname" value="${Lname}">
        <button type="submit">Добавить учителя</button>
    </body>
</html>
