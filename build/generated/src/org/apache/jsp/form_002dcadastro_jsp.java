package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_002dcadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
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
      out.write("    <main class=\"container-geral\">\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("            <div class=\"icon-container\">\n");
      out.write("                <img src=\"https://cdn-icons-png.flaticon.com/512/91/91544.png\" width=\"100px\">\n");
      out.write("                <h3>Cadastrar:</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form\">\n");
      out.write("                <form method=\"post\" action=\"inserir.do\">\n");
      out.write("                    <p>Nome do animal:</p>\n");
      out.write("                    <input type=\"text\" name=\"nome\" required >\n");
      out.write("                    <p>Idade:</p>\n");
      out.write("                    <input  type=\"text\" name=\"idade\" required>\n");
      out.write("                    <p>Situação (A: Adotado / D: Disponível):</p>\n");
      out.write("                    <input  type=\"text\" name=\"situacao\" maxlength=\"1\" required>         \n");
      out.write("                    <input  type=\"text\" name=\"data_adocao\" hidden=\"\">\n");
      out.write("                    <input type=\"submit\" value=\"Enviar\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("    \n");
      out.write("    <footer>\n");
      out.write("        <p>Desenvolvido por <a href=\"https://github.com/marceloverass\" style=\"color:#6ebf8b\n");
      out.write("\">Marcelo Veras</a></p>\n");
      out.write("    </footer>\n");
      out.write("    <!--Scripts-->\n");
      out.write("    <script src=\"https://kit.fontawesome.com/19376f285c.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<!--<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"inserir.do\" method=\"post\">\n");
      out.write("            <p>Nome:<input type=\"text\" name=\"nm\"></p> \n");
      out.write("            <p>E-mail<input type=\"text\" name=\"email\"></p>\n");
      out.write("            <p><input type=\"submit\" value=\"enviar\"></p>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html> -->\n");
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
