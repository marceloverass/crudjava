<%-- 
    Document   : listagem
    Created on : 11/05/2022, 10:33:33
    Author     : profe
--%>

<%@page import="br.com.entidade.Adocao"%>
<%@page import="br.com.model.CadastroDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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

    <main class="container-geral-listar">
        <div class="corpo-table">
        <table>
            <thead>
                <tr>
                    <th>Código</th>
                    <th>Animal</th>
                    <th>Idade</th>
                    <th>Situação</th>
                    <th>Entrada</th>
                    <th>Data de Adoção</th>
                    <th>Editar</th>
                    <th>Excluir</th>
                </tr>
                
                <%
            String vcodigo="";
            String vnome="";
            String vidade="";
            String vsituacao="";
            String vdata_entrada="";
            String vdata_adocao="";
           
          
            CadastroDAO dao = new CadastroDAO(); 
            Adocao adocao =  new Adocao();
            
            ArrayList<Adocao> listaAdocao = dao.listarTudo();  //recebendo a lista gerada no DAO e colocando na lista que será
            //impressa na tela
            for (int i = 0; i < listaAdocao.size(); i++) {                
                adocao = listaAdocao.get(i);
                vcodigo= String.valueOf(adocao.getCodigo());
                vnome = String.valueOf(adocao.getNome());
                vidade = String.valueOf(adocao.getIdade());
                vsituacao = String.valueOf(adocao.getSituacao());
                vdata_entrada = String.valueOf(adocao.getData_Entrada());
                vdata_adocao = String.valueOf(adocao.getData_Adocao());
        %>
            </thead>
                    <tbody>
                        <tr>
                        <th><%=vcodigo%></th>
                        <th><%=vnome%></th>
                        <th><%=vidade%></th>
                        <th><%=vsituacao%></th>
                        <th><%=vdata_entrada%></th>
                        <th><%=vdata_adocao%></th>
                        <th><a href="editar.do?codigo=<%=vcodigo%>"><i class="editar-icon fa-solid fa-pencil"></i></i></a></th>
                        <th><a href="excluir.do?codigo=<%=vcodigo%>" onclick="return confirm('Confirma exclusão do registro <%=vnome%>?')"><i class="apagar-icon fa-solid fa-trash"> </i></a></th>
                        <th></th>
                    </tr>
                   
                     <%} //fechando FOR 
                %>
                </tbody>
                
            </table>
        </div>
    </main>

    <footer>
        <p><p>Desenvolvido por <a href="https://github.com/marceloverass" style="color:#6ebf8b
">Marcelo Veras</a></p></p>
    </footer>
    <!--Scripts-->
    <script src="https://kit.fontawesome.com/19376f285c.js" crossorigin="anonymous"></script>
</body>
</html>
