<%-- 
    Document   : addSchoolClasses
    Created on : 24-Mar-2020, 14:55:11
    Author     : vladi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add School classes</title>
    </head>
    <body>
        <h1>Add school class</h1>
        <p id="info">${info}</p>
        <form action="addSchoolClasses" method="POST">
            Класс:<input type="text" name="title" value="${title}"><br>
            <button type="submit">Добавить класс в школе</button>
        </form>
    </body>
</html>
