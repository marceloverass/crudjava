<%@page import="java.util.ArrayList"%>
<%@page import="br.com.entidade.Adocao"%>
<%@page import="br.com.model.CadastroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <br/>

          
        
                            
        <%
            String vcodigo="";
            String vnome="";
            String vidade="";
            String vsituacao="";
            String vdata_entrada="";
            String vdata_adocao="";
          
            CadastroDAO dao = new CadastroDAO(); 
            Adocao adocao = new Adocao();
            
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
                       
                          <%=vcodigo%>
                          <%=vnome%>
                          <%=vidade%>
                          <%=vsituacao%>
                          <%=vdata_entrada%>
                          <%=vdata_adocao%>
                           
        
        <a href="alterar?codigo=<%=vcodigo%>" >alterar</a>
        <a href="excluir?codigo=<%=vcodigo%>" onclick="return confirm('Confirma exclusão do registro <%=vnome%>?')">excluir </a></br>
                         
                <%} //fechando FOR 
                %>
         
    </body>
</html>
