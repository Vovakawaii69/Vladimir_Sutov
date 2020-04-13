<%-- 
    Document   : listStudents
    Created on : 25-Mar-2020, 11:56:45
    Author     : vladi
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Просмотр студентов</title>
    </head>
    <body>
        <h1>Список студентов</h1>
        <p id="info">${info}</p>
        <c:forEach var="List" items="${Students}" varStatus="status">
        <li>${status.index+1}.${Students.fName}.${Students.lName}.${Students.age}</li>
        </c:forEach>
    </body>
</html>
