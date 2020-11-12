<%-- 
    Document   : topics
    Created on : 02/11/2020, 16:42:12
    Author     : Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CourseraWEB | Topics</title>
        <style>
            *{
                box-sizing:border-box;
                margin:0;
                padding:0
            }

            html, body{
                width: 100%;
                height:100%;
                font-family: 'Segoe UI', Helvetica Neue, Helvetica, Lucida Grande, Arial;
            }
            body {
                background:url(https://s2.best-wallpaper.net/wallpaper/3840x2160/1801/England-Wales-waterfall-river-trees_3840x2160.jpg);
                background-size: auto;
                background-repeat: no-repeat;
                background-position: center;
            }
            .app-window {

                margin: 20px;
                /* flexbox */
                display: -webkit-flex;
                display: flex;

                /* comportamento: em linha com wrap */
                -webkit-flex-flow: row wrap;
                flex-flow: row wrap;

                /* conteúdo justificado no centro */
                -webkit-justify-content: center;
                justify-content:center;
            }
            .title-container{

                margin: 2%;
                height: 20%;
                width: 100%;

                /* flexbox */
                display: -webkit-flex;
                display: flex;

                /* comportamento: em linha com wrap */
                -webkit-flex-flow: row wrap;
                flex-flow: row wrap;

                /* conteúdo justificado no centro */
                -webkit-justify-content: center;
                justify-content:center;
            }

            .line {
                background: #fff;
                height: 2px;
                width: 60px;
                margin-top: 2%; 
                margin-bottom: 2%;
            }

            span, h2 {
                -webkit-flex: 1 0 auto;
                flex: 1 0 auto;
            }

            h2 {
                color: #fff;
                text-align: center;
                overflow: auto;
                font-size: 100%;
                min-width: 100%;
            }    
            @media(min-width: 450px) {
                h2 {
                    font-size: 130%;
                }
            }

            .sidebar {

                background-color: rgba(0,0,0,0.2);
                border-radius: 10px;
                height: 100%;
                width: 100%;
                padding: 20px;


                /* flexbox */
                display: -webkit-flex;
                display: flex;

                /* comportamento: em linha com wrap */
                -webkit-flex-flow: row wrap;
                flex-flow: row wrap;

                /* conteúdo justificado no centro */
                -webkit-justify-content: center;
                justify-content:center;
            }

            input[type=submit] {
                background-color: rgba(10,23,55,0.5);
                width: 100%;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
                color: white;
                cursor: pointer;
            }

            th{
                color: #FFF;
            }

            td{
                color: #FFF;
            }
            
            .rodape{
                margin: 2%;
                height: 20%;
                width: 100%;
                

                /* flexbox */
                display: -webkit-flex;
                display: flex;

                /* comportamento: em linha com wrap */
                -webkit-flex-flow: row wrap;
                flex-flow: row wrap;

                /* conteúdo justificado no centro */
                -webkit-justify-content: center;
                justify-content:center;
            }
        </style>
    </head>
    <body>
        <div class="app-window">
            <div class="title-container">
                <span class='line'></span>
                <h2>Coursera WEB</h2>
                <span class='line'></span>
            </div>
            <div class="sidebar">
                <table width="100%" border="1px">
                    <tr>
                        <th>ID</th>
                        <th>Titulo</th>
                        <th>Usuário</th>
                        <th>Descrição</th>
                    </tr>
                    <c:forEach items="${Topics}" var="topic">
                        <tr>
                            <td>${topic.id}</td>
                            <td>${topic.title}</td>
                            <td>${topic.user.name}</td>
                            <td>${topic.description}</td>
                        </tr>
                    </c:forEach>
                </table>
                <br>
                <div class="rodape" >
                    <form style=" float: right; margin: 1%; width: 48%;" action="">
                        <div class="set-input">
                            <input type="submit" value="Consulte ranking!"/></p>               
                        </div>
                    </form>
                    <br>
                    <form style=" float: left; margin: 1%; width: 48%;" action="callInsertTopic">
                        <div class="set-input">
                            <input type="submit" value="Inserir tópico!"/></p>               
                        </div>
                    </form>
                </div>
            </div>

        </div>
    </body>
</html>
