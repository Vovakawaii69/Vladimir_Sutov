<%-- 
    Document   : addLessons
    Created on : 24-Mar-2020, 20:40:31
    Author     : vladi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add lessons to the school</title>
    </head>
    <body>
        <h1>Add lessons</h1>
        <p id="info">${info}</p>
        Название предмета:<input type="text" name="nameOfLesson" value="${nameOfLesson}">
        <button type="submit">Добавить предмет</button>
    </body>
</html>
