<%-- 
    Document   : resposta
    Created on : 17/10/2020, 10:43:42
    Author     : Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Melhores produtos</title>
    </head>
    <body>
        <h1>Os melhores produtos do tipo # ${param.product} # são:</h1>
        <ul>
            <c:forEach var="item" items="${Products}">
                <li>${item}</li>
            </c:forEach>            
        </ul>
    </body>
</html>
