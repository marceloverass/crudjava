
package br.com.model;

import br.com.entidade.Adocao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

public class CadastroDAO extends DAO{

    private Object data;
     public void inserir(Adocao al) {
         try {
            abrirBanco();
            Date data = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
            String query = "INSERT INTO adocao(codigo,nome,idade,situacao,data_entrada,data_adocao) VALUES(null,?, ?, ?, ?, ?)";
            pst = (PreparedStatement) con.prepareStatement(query);
           pst.setString(1, al.getNome());
           pst.setString(2, al.getIdade());
           pst.setString(3, al.getSituacao());
           pst.setString(4, data.toString());
           pst.setString(5, al.getData_Adocao());
            pst.execute();
            fecharBanco();
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
    }
     // metodo listagem
     public ArrayList<Adocao> listarTudo () throws Exception {
       ArrayList<Adocao> listaadocao = new ArrayList<Adocao>();
         try{
         abrirBanco();  
         String query = "select * FROM adocao";
         pst = con.prepareStatement(query);
         ResultSet rs = pst.executeQuery();
         Adocao user ;
         while (rs.next()){ 
           user = new Adocao();
           user.setCodigo(rs.getInt("codigo"));
           user.setNome(rs.getString("nome"));
           user.setIdade(rs.getString("idade"));
           user.setSituacao(rs.getString("situacao"));
           user.setData_Entrada(rs.getDate("data_entrada"));
           user.setData_Adocao(rs.getString("data_adocao"));
           listaadocao.add(user); 
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return listaadocao;
     }
     
     public void deletar(Adocao al) throws Exception{
         abrirBanco();
         String query = "delete from adocao where codigo=?";
         pst=(PreparedStatement) con.prepareStatement(query);
         pst.setInt(1, al.getCodigo());
         pst.execute();
        fecharBanco();
     }
     
     public Adocao pesquisar(int id) throws Exception {
    try {
            Adocao al = new Adocao();
            System.out.println(" Chegou no pesquisar registo" + id);
            abrirBanco();
            String query = "select * FROM adocao where codigo=?";
            pst = con.prepareStatement(query);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                al.setCodigo(rs.getInt("codigo"));
                al.setNome(rs.getString("nome"));
                al.setIdade(rs.getString("idade"));
                al.setSituacao(rs.getString("situacao"));
                al.setData_Entrada(rs.getDate("data_entrada"));
                al.setData_Adocao(rs.getString("data_adocao"));
            return al;
            }
            fecharBanco();
    } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
    }
    return null;
	}
     
    public void alterar(Adocao al) throws Exception {
		try {
    abrirBanco();
    String query = "UPDATE adocao SET nome=?,idade=?,situacao=?,data_adocao=? WHERE codigo=?;";
    pst = con.prepareStatement(query);
    pst.setString(1, al.getNome());
    pst.setString(2, al.getIdade());
    pst.setString(3, al.getSituacao());
    pst.setString(4, al.getData_Adocao());
       pst.setInt(5, al.getCodigo());
    pst.execute();
    fecharBanco();
    } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
    }
	}
}
