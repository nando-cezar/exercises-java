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

            #minhaTabela{
                width:100%;
                margin:1% auto;
                border:0;
                box-shadow: 0 5px 30px darkgrey;
                border-spacing: 0;
            }

            #minhaTabela thead th{
                font-weight: bold;
                background-color: black;
                color: white;

                padding:5px 10px;
            }

            #minhaTabela tr td{
                padding:5px 10px;
                text-align: center;

                cursor: pointer; /**importante para não mostrar cursor de texto**/
            }

            #minhaTabela tr td:last-child{
                text-align: center;
            }

            /**Cores**/
            #minhaTabela tr:nth-child(odd){
                background-color: #eee;
            }

            /**Cor quando passar por cima**/
            #minhaTabela tr:hover td{
                background-color: #feffb7;
            }

            /**Cor quando selecionado**/
            #minhaTabela tr.selecionado td{
                background-color: #aff7ff;
            }

            button#visualizarDados{
                background-color: white;
                border: 1px solid black;
                width:50%;
                margin: 10px auto;
                padding:10px 0;
                display: block;
                color: black;
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
                <table id='minhaTabela'>
                    <tr>
                        <th>ID</th>
                        <th>Titulo</th>
                        <th>Usuário</th>
                    </tr>
                    <c:forEach items="${Topics}" var="topic">
                        <tr>
                            <td>${topic.id}</td>
                            <td>${topic.title}</td>
                            <td>${topic.user.name}</td>
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
                    <button id="visualizarDados">Visualizar Dados</button>
                </div>
            </div>

        </div>
    </body>
    <script>
        var tabela = document.getElementById("minhaTabela");
        var linhas = tabela.getElementsByTagName("tr");

        for (var i = 0; i < linhas.length; i++) {
            var linha = linhas[i];
            linha.addEventListener("click", function () {
                //Adicionar ao atual
                selLinha(this, false); //Selecione apenas um
                //selLinha(this, true); //Selecione quantos quiser
            });
        }

        /**
         Caso passe true, você pode selecionar multiplas linhas.
         Caso passe false, você só pode selecionar uma linha por vez.
         **/
        function selLinha(linha, multiplos) {
            if (!multiplos) {
                var linhas = linha.parentElement.getElementsByTagName("tr");
                for (var i = 0; i < linhas.length; i++) {
                    var linha_ = linhas[i];
                    linha_.classList.remove("selecionado");
                }
            }
            linha.classList.toggle("selecionado");
        }

        /**
         Exemplo de como capturar os dados
         **/
        var btnVisualizar = document.getElementById("visualizarDados");

        btnVisualizar.addEventListener("click", function () {
            var selecionados = tabela.getElementsByClassName("selecionado");
            //Verificar se eestá selecionado
            if (selecionados.length < 1) {
                alert("Selecione pelo menos uma linha");
                return false;
            }

            var dados = "";

            for (var i = 0; i < selecionados.length; i++) {
                var selecionado = selecionados[i];
                selecionado = selecionado.getElementsByTagName("td");
                dados += "ID: " + selecionado[0].innerHTML + " - Titulo: " + selecionado[1].innerHTML + " - Usuario: " + selecionado[2].innerHTML + "\n";
            }

            alert(dados);
        });
    </script>
</html>

