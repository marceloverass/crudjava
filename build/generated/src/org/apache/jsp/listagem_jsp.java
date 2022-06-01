package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.entidade.Adocao;
import br.com.model.CadastroDAO;
import java.util.ArrayList;

public final class listagem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <!--Fontes do google-->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;0,700;0,800;1,300;1,400;1,500;1,600;1,700;1,800&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"icon\" href=\"favicon.ico\">\n");
      out.write("    <!---->\n");
      out.write("\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Sistema de cadastro</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <header class=\"header-container\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"form-cadastro.jsp\">Cadastro</a></li>\n");
      out.write("            <li><a href=\"listagem.jsp\">Listagem</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </header><!--Cabeçalho de navegação-->\n");
      out.write("\n");
      out.write("    <main class=\"container-geral-listar\">\n");
      out.write("        <div class=\"corpo-table\">\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Código</th>\n");
      out.write("                    <th>Animal</th>\n");
      out.write("                    <th>Idade</th>\n");
      out.write("                    <th>Situação</th>\n");
      out.write("                    <th>Entrada</th>\n");
      out.write("                    <th>Data de Adoção</th>\n");
      out.write("                    <th>Editar</th>\n");
      out.write("                    <th>Excluir</th>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                ");

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
        
      out.write("\n");
      out.write("            </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                        <th>");
      out.print(vcodigo);
      out.write("</th>\n");
      out.write("                        <th>");
      out.print(vnome);
      out.write("</th>\n");
      out.write("                        <th>");
      out.print(vidade);
      out.write("</th>\n");
      out.write("                        <th>");
      out.print(vsituacao);
      out.write("</th>\n");
      out.write("                        <th>");
      out.print(vdata_entrada);
      out.write("</th>\n");
      out.write("                        <th>");
      out.print(vdata_adocao);
      out.write("</th>\n");
      out.write("                        <th><a href=\"editar.do?codigo=");
      out.print(vcodigo);
      out.write("\"><i class=\"editar-icon fa-solid fa-pencil\"></i></i></a></th>\n");
      out.write("                        <th><a href=\"excluir.do?codigo=");
      out.print(vcodigo);
      out.write("\" onclick=\"return confirm('Confirma exclusão do registro ");
      out.print(vnome);
      out.write("?')\"><i class=\"apagar-icon fa-solid fa-trash\"> </i></a></th>\n");
      out.write("                        <th></th>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                     ");
} //fechando FOR 
                
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("        <p><p>Desenvolvido por <a href=\"https://github.com/marceloverass\" style=\"color:#6ebf8b\n");
      out.write("\">Marcelo Veras</a></p></p>\n");
      out.write("    </footer>\n");
      out.write("    <!--Scripts-->\n");
      out.write("    <script src=\"https://kit.fontawesome.com/19376f285c.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
