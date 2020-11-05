<%-- 
    Document   : singup
    Created on : 02/11/2020, 16:41:53
    Author     : Windows
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html>
    <head>
        <title>CourseraWEB | Signup</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            html, body{
                width: 100%;
                height:100%;
                font-family: 'Segoe UI', Helvetica Neue, Helvetica, Lucida Grande, Arial;
            }
            body {
                background:url(https://i.pinimg.com/originals/3b/8a/d2/3b8ad2c7b1be2caf24321c852103598a.jpg);
                background-size: cover;
                background-repeat: no-repeat;
                display: block;
                margin:0;
                padding:0

            }
            .app-window {

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
                background: #fff;
                height: 2px;
                width: 60px;
                margin-top: 1%; 
                margin-bottom: 1%;
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
                font-size: 100%;
            }

            form{
                flex:1;
                background-size: cover;
            }

            .set-input{
                flex-direction: row;
            }

            label {
                color: #FFF;
                padding: 12px 45px 12px 0;
                display: inline-block;
            }

            input[type=text] {
                color: #FFF;
                background: transparent;
                width: 100%;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
            }

            input[type=password] {
                color: #FFF;
                background: transparent;
                width: 100%;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
            }
            input[type=email] {
                color: #FFF;
                background: transparent;
                width: 100%;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
            }

            input[type=number] {
                color: #FFF;
                background: transparent;
                width: 100%;
                padding: 12px;
                border: 1px solid #ccc;
                border-radius: 4px;
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

            .description-signup{

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
                <div class="title-observation">
                    <p>Preencha corretamente os dados!</p>
                </div>
                <form method="POST" action="signup">
                    <div class="set-input">
                        <label>Login: </label>
                        <input type="text" name="login"  placeholder="Digite aqui..."/>
                    </div>
                    <div class="set-input">
                        <label>Email: </label>
                        <input type="email" name="email"  placeholder="Digite aqui..."/>
                    </div>
                    <div class="set-input">
                        <label>Nome: </label>
                        <input type="text" name="name"  placeholder="Digite aqui..."/>
                    </div>
                    <div class="set-input">
                        <label>Senha: </label>
                        <input type="password" name="password"/>
                    </div>
                    <div class="set-input">
                        <label>Pontos: </label>
                        <input type="number" name="points"/>
                    </div>
                    <br>
                    <input type="submit" value="Cadastre-se"/>
                </form>
            </div>
        </div>
    </body>
</html>

