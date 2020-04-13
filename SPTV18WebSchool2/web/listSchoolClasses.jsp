<%-- 
    Document   : listSchoolClasses
    Created on : 25-Mar-2020, 11:06:22
    Author     : vladi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Просмотр классов в школе</title>
    </head>
    <body>
        <h1>Посмотреть список классов</h1>
        <p id="info">${info}</p>
        <c:forEach var="schoolClasses" items="${listSchoolClasses}" varStatus="status">
        <li>${status.index+1}.${schoolClasses.title}</li>
        </c:forEach>
    </body>
</html>
