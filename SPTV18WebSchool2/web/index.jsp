<%-- 
    Document   : index.jsp
    Created on : Mar 5, 2020, 10:06:28 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Сетевая школа группы SPTV18</title>
    </head>
    <body>
        <h1>Сетевая школа</h1>
        <p id="info">${info}</p>
        <p>
            <a href="showLogin">Вход</a><br>
            <a href="addSchoolClasses">Добавить класс</a><br>
            <a href="addStudents">Добавить ученика</a><br>
            <a href="addTeachers">Добавить учителя</a><br>
            <a href="listSchoolClasses">Cписок классов</a><br>
            <a href="listStudents">Список учеников</a><br>
            <a href="listTeachers">Список учителей</a><br>
        </p>
    </body>
</html>