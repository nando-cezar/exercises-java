<%-- 
    Document   : tradutor
    Created on : 21/10/2020, 18:21:18
    Author     : Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tradução</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <h3>
            <c:forEach var="item" items="${Translation}">
                <li>${item}</li>
            </c:forEach>            
        </h3>       
    </body>
</html>
