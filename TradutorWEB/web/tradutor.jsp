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
        <title>Tradutor</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
            *{
                box-sizing:border-box;
                margin:0;
                padding:0
            }
            html{
                width: 100%;
                height:100%;
            }
            body {
                width: 100%;
                height:100%;
                background: #D2DBDC;
                margin: 0;
                font-family: 'Segoe UI', Helvetica Neue, Helvetica, Lucida Grande, Arial;
            }
            .app-window {
                background:url(http://i.stack.imgur.com/DGejA.jpg) center center;
                background-size: cover;
                height: 100%;
                padding: 5% 10px;
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
            .title-container{

                background-size: cover;
                height: 20%;
                padding: 0 10px;
                width: 80%;

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
            span, h2 {
                -webkit-flex: 1 0 auto;
                flex: 1 0 auto;
            }

            .line {
                background: #FFF;
                height: 2px;
                width: 60px;                
            }

            h2 {
                color: #FFF;
                text-align: center;
                overflow: auto;
                font-size: 180%;
                min-width: 100%;
            }    
            @media(min-width: 450px) {
                h2 {
                    font-size: 150%;
                }
            }

            .sidebar {

                background-color: rgba(0,0,0,0.2);
                background-size: cover;
                border-radius: 10px;
                height: 80%;
                padding: 2% 20px;
                width: 80%;

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

            .title-observation{

                width: 100%;
                margin: 10px;

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
            
            p{
                color: #FFF;
                text-align: center;
                font-size: 180%;
            }
            @media(min-width: 450px) {
                P {
                    font-size: 120%;
                }
            }
            
            h3{           
                color: #FFF;
                text-align: center;
                overflow: auto;
                font-size: 180%;
                min-width: 100%;
                list-style-type: none;
            }
            @media(min-width: 450px) {
                h2 {
                    font-size: 150%;
                }
            }

            .set-input{
                flex-direction: row;
            }


        </style>
    </head>
    <body>        
        <div class="app-window">
            <div class="title-container">
                <span class='line'></span>
                <h2>Tradutor</h2>
                <span class='line'></span>
            </div>
            <div class="sidebar">
                <div class="title-observation">
                    <p>Resultado abaixo!</p>
                </div>
                <div class="set-input">
                    <h3>
                        <c:forEach var="item" items="${Translation}">
                            <li>${item}</li>
                            </c:forEach>            
                    </h3> 
                </div>
                <br>
            </div>
        </div>
    </body>
</html>
