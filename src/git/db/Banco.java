/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.db;

import git.gui.FrCadastroProjeto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tiago B
 */
public class Banco {
    
    public Banco(){}//Construtor de classe.
    
    private Connection connect() throws ClassNotFoundException{
        String url = "jdbc:sqlite:C:\\Projetos\\dbsqlite\\dbgit.db";
        Connection connection = null;
        
        try 
        {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            //Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        
        return connection;
    }
    
    public void Conectar() throws ClassNotFoundException{
      /*  Connection c = null;
        String url = "jdbc:sqlite:C:\\Projetos\\dbsqlite\\dbgit.db";        
        try
        { 
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:\\Projetos\\dbsqlite\\dbgit.db");
            System.out.println("Banco conectado !");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FrCadastroProjeto.class.getName()).log(Level.SEVERE, null, ex);
        }        */
        String sql = "Insert into infoide(null,nomeide, nomeprocesso, diretorio, nomeprojeto) values(null,?,?,?,?);";
        Connection conn = this.connect();
        try
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);
        }catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
    }//metodo Conectar
    
    public void insertDados(InfoIde infoide) throws ClassNotFoundException{
        String sql = "Insert into infoide(nomeide, nomeprocesso, diretorio, nomeprojeto) values(?,?,?,?);";
        Connection conn = this.connect();
        try
        {
            PreparedStatement pstmt = conn.prepareStatement(sql);                       
            pstmt.setString(1, infoide.getNomeIde());
            pstmt.setString(2, infoide.getNomeProcesso());
            pstmt.setString(3, infoide.getDiretorio());
            pstmt.setString(4, infoide.getNomeProjeto());
            pstmt.executeUpdate();
        }catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }        
    }
    
    public DefaultTableModel RetornaDados() throws ClassNotFoundException, SQLException{
        
        String sql = "select id, nomeide, nomeprocesso, diretorio, nomeprojeto, dataatualizacao FROM infoide";
        
        Connection con = this.connect();
        
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next())
        {
            System.out.println(rs.getInt("id")+" "+rs.getString("nomeide")+" "+rs.getString("nomeprocesso"));
        }
        
        
        DefaultTableModel modelo = null;
        
        String[] nomeColunas = {"Id","Nome Ide", "Nome Processo", "Diretorio", "Nome Projeto", "Data Atualização"};
        
        return modelo;
    }//metodo RetornaDados
}
