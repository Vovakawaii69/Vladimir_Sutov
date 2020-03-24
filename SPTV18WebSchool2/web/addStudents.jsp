<%-- 
    Document   : addStudents
    Created on : 24-Mar-2020, 20:23:16
    Author     : vladi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add students to the school class</title>
    </head>
    <body>
        <h1>Add students</h1>
        <p id="info">${info}</p>
        Имя студента:<input type="text" name="fname" value="${fname}">
        Фамилия студента:<input type="text" name="lname" value="${lname}">
        Возраст студента:<input type="text" name="age" value="${age}">
        <button type="submit">Добавить ученика</button>
    </body>
</html>
