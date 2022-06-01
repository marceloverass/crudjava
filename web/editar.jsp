
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap" rel="stylesheet">
    <link rel="icon" href="favicon.ico">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Cadastro</title> 
        
        <link rel="stylesheet" href="css/style.css">

    </head>
    <%  
        String vcodigo="";
        String vnome="";
        String vidade="";
        String vsituacao="";
        String vdata_entrada="";
        String vdata_adocao="";

         vcodigo = (String) request.getAttribute("adocaoBeanCodigo").toString();
         vnome    = (String) request.getAttribute("adocaoBeanNome").toString();
         vidade    = (String) request.getAttribute("adocaoBeanIdade").toString();
         vsituacao    = (String) request.getAttribute("adocaoBeanSituacao").toString();
         vdata_entrada    = (String) request.getAttribute("adocaoBeanData_Entrada").toString();
         vdata_adocao    = (String) request.getAttribute("adocaoBeanData_Adocao").toString();
           %>
    <body>
       
    <center>
        <header class="header-container">
            <h3 class="h3 text-center" style="color:white" class="HAHAHAHA">Deseja alterar este animal?</h3><br/>
        </header>
        
        <div class="col-md-offset-4 col-md-4" >
            <div class="well well-lg" class="HAHAHAHA"> 
        
                <form name="form" action="alterar.do" method="post">
                    <p class="HAHAHAHA" style="padding-top:20px">Código do Animal: <span class="badge"> <%=vcodigo%></span></p>
                    <input type="hidden" name="codigo" value="<%=vcodigo%>">
                    <br/>
                    
                    <div class="form-group">
                        <label class="control-label" for="nome">Nome</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-user"></span> 
                            </div>   
                            <input type="text" name="nome" value="<%=vnome%>" class="form-control" id="nome" style="margin:10px">  
                        </div>
                    </div>
                  
                    <div class="form-group">
                        <label class="control-label" for="idade">Idade</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-envelope"></span> 
                            </div>   
                            <input type="text" name="idade" value="<%=vidade%>" class="form-control" id="idade" style="margin:10px">  
                        </div>
                    </div>
                        
                        <div class="form-group">
                        <label class="control-label" for="situacao">Situação</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-envelope"></span> 
                            </div>   
                            <input type="text" name="situacao" value="<%=vsituacao%>" class="form-control" id="situacao" maxlength="1" style="margin:10px">  
                        </div>
                    </div>
                         
                        <div class="form-group">
                        <label class="control-label" for="data_adocao">Data de Adoção</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-envelope"></span> 
                            </div>   
                            <input type="text" name="data_adocao" value="<%=vdata_adocao%>" class="form-control" id="data_adocao" pattern="\d{1,2}/\d{1,2}/\d{4}" title="dd/mm/yyyy" style="margin:10px">  
                        </div>
                    </div>
                        
                                 
                        <input type="submit" value="Alterar" class="myButton" class="btn btn-info" style="margin-top:20px">
                </form>
            </div>
        </div>
        </center>
        <script src="js/jquery-2.2.4.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
