
<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Cadastro</title> 
        
        <link rel="stylesheet" href="resoucers/bootstrap/css/bootstrap.min.css">

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
       
        
        <header>
            <h3 class="h3 text-center" >Alterar este Animal?</h3><br/>
        </header>
        
        <div class="col-md-offset-4 col-md-4">
            <div class="well well-lg"> 
        
                <form name="form" action="alterar.do" method="post">
                     Código do Animal: <span class="badge"> <%=vcodigo%></span>
                    <input type="hidden" name="codigo" value="<%=vcodigo%>">
                    <br/>
                    
                    <div class="form-group">
                        <label class="control-label" for="nome">Nome</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-user"></span> 
                            </div>   
                            <input type="text" name="nome" value="<%=vnome%>" class="form-control" id="nome">  
                        </div>
                    </div>
                  
                    <div class="form-group">
                        <label class="control-label" for="idade">Idade</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-envelope"></span> 
                            </div>   
                            <input type="text" name="idade" value="<%=vidade%>" class="form-control" id="idade">  
                        </div>
                    </div>
                        
                        <div class="form-group">
                        <label class="control-label" for="situacao">Situação</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-envelope"></span> 
                            </div>   
                            <input type="text" name="situacao" value="<%=vsituacao%>" class="form-control" id="situacao" maxlength="1">  
                        </div>
                    </div>
                         
                        <div class="form-group">
                        <label class="control-label" for="data_adocao">Data de Adoção</label> <br>
                        <div class="input-group">
                            <div class="input-group-addon">
                                <span class="glyphicon glyphicon-envelope"></span> 
                            </div>   
                            <input type="text" name="data_adocao" value="<%=vdata_adocao%>" class="form-control" id="data_adocao" pattern="\d{1,2}/\d{1,2}/\d{4}" title="dd/mm/yyyy">  
                        </div>
                    </div>
                        
                                 
                    <input type="submit" value="Alterar" class="btn btn-info">
                </form>
            </div>
        </div>
        
        <script src="js/jquery-2.2.4.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
