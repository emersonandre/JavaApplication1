/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Analista
 */
public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL ="jdbc:mysql://localhost:3306/locadora";
    private static final String USER = "master";
    private static final String PASS = "145819";
    
    public static Connection GetConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na Conexão...",ex);
        }
    }
    
    public static void CloseConnection(Connection conn){
       try{
            if(conn != null){
                conn.close();}
        }catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    
    public static void CloseConnection(Connection conn, PreparedStatement stmt){
        CloseConnection(conn);
            try {
               if(stmt != null){
                   stmt.close();
               } 
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    
    public static void CloseConnection(Connection conn, PreparedStatement stmt,ResultSet rs){
        CloseConnection(conn,stmt);
            try {
               if(rs != null){
                   rs.close();
               } 
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
