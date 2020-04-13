<%-- 
    Document   : listTeachers
    Created on : 26-Mar-2020, 12:59:26
    Author     : vladi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Просмотр учителей</title>
    </head>
    <body>
        <h1>Список учителей</h1>
        <p id="info">${info}</p>
        <c:forEach var="teachers" items="${Teachers}" varStatus="status">
            <li>${status.index+1}.${Teachers.Fname}.${Teachers.Lname}</li>
        </c:forEach>
    </body>
</html>
