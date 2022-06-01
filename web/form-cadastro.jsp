<%-- 
    Document   : form-cadastro
    Created on : 01/04/2022, 21:31:32
    Author     : profe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="pt-br">
<head>
    <!--Fontes do google-->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap" rel="stylesheet">
    <link rel="icon" href="favicon.ico">
    <!---->

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sistema de cadastro</title>
    <link rel="stylesheet" href="css/style.css">

</head>
<body>
    
    <header class="header-container">
        <ul>
            <li><a href="form-cadastro.jsp">Cadastro</a></li>
            <li><a href="listagem.jsp">Listagem</a></li>
        </ul>
    </header><!--Cabeçalho de navegação-->

    <main class="container-geral">
        <div class="form-container">
            <div class="icon-container">
                <img src="https://cdn-icons-png.flaticon.com/512/91/91544.png" width="100px">
                <h3>Cadastrar:</h3>
            </div>
            <div class="form">
                <form method="post" action="inserir.do">
                    <p>Nome do animal:</p>
                    <input type="text" name="nome" required >
                    <p>Idade:</p>
                    <input  type="text" name="idade" required>
                    <p>Situação (A: Adotado / D: Disponível):</p>
                    <input  type="text" name="situacao" maxlength="1" required>         
                    <input  type="text" name="data_adocao" hidden="">
                    <input type="submit" value="Enviar">
                </form>
            </div>
        </div>
    </main>
    
    <footer>
        <p>Desenvolvido por <a href="https://github.com/marceloverass" style="color:#6ebf8b
">Marcelo Veras</a></p>
    </footer>
    <!--Scripts-->
    <script src="https://kit.fontawesome.com/19376f285c.js" crossorigin="anonymous"></script>
</body>
</html>
<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="inserir.do" method="post">
            <p>Nome:<input type="text" name="nm"></p> 
            <p>E-mail<input type="text" name="email"></p>
            <p><input type="submit" value="enviar"></p>
        </form>
    </body>
</html> -->
