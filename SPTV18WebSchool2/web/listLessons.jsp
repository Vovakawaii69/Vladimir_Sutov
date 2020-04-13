<%-- 
    Document   : listLessons
    Created on : 26-Mar-2020, 12:54:17
    Author     : vladi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Просмотр предметов</title>
    </head>
    <body>
        <h1>Список предметов</h1>
        <p id="info">${info}</p>
        <c:forEach var="lessons" items="${Lessons}" varStatus="status">
            <li>${status.index+1}.${Lessons.nameOfLessons}</li>
        </c:forEach>
    </body>
</html>
