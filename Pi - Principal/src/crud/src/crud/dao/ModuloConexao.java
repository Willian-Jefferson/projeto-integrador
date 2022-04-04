/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.dao;
import java.sql.*;

public class ModuloConexao {
    
    // Método responsável por estabelecer a conexão com o banco
    public static Connection conector() {
        
        java.sql.Connection conexao; // variável que recebe o String de conexão
        String driver = "org.sqlite.JDBC";// chama o Driver importado para Bibliotecas (conector)
        String url = "jdbc:sqlite:myBlog.sqlite"; // armazenando informações referente ao Banco
       // String user = "root"; //armazenando informações referente ao Banco
        //String password = "mysql1985"; //armazenando informações referente ao Banco
        
        // estabelecendo conexão com o Banco
        try {            
            conexao = DriverManager.getConnection(url);
            return conexao;
        } catch (SQLException e) {                      
            return null;
        }
    }    
}