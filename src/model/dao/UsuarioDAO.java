package model.dao;


import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Analista
 */
public class UsuarioDAO {
    public void create(usuario u){
        Connection conn = ConnectionFactory.GetConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("INSERT INTO USUARIO(nome,usuario,senha) VALUES(?,?,?) ");
            stmt.setString(1,u.getNome());
            stmt.setString(2,u.getUsuario());
            stmt.setString(3,u.getSenha());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar:"+ex);
        }finally{
            ConnectionFactory.CloseConnection(conn, stmt);
        }
    }
    
    public List<usuario> read(){
        Connection conn = ConnectionFactory.GetConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<usuario> usuarios = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                usuario user = new usuario();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setUsuario(rs.getString("usuario"));
                user.setSenha(rs.getString("senha"));
                
                usuarios.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.CloseConnection(conn, stmt, rs);
        }
        
        return usuarios;
    }
    public void update(usuario u){
        Connection conn = ConnectionFactory.GetConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("UPDATE usuario SET nome=?,usuario=?,senha=? WHERE id=?");
            stmt.setString(1, u.getNome());
            stmt.setString(2,u.getUsuario());
            stmt.setString(3,u.getSenha());
            stmt.setInt(4, u.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar:"+ex);
        }finally{
            ConnectionFactory.CloseConnection(conn, stmt);
        }
    }
    
    public void delete(usuario u){
        Connection conn = ConnectionFactory.GetConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("DELETE FROM usuario WHERE id=?");
            stmt.setInt(1, u.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir:"+ex);
        }finally{
            ConnectionFactory.CloseConnection(conn, stmt);
        }
    }
    
    public boolean CheckLogin(String login, String senha){
        Connection conn = ConnectionFactory.GetConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM usuario WHERE usuario=? and senha=?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                check = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.CloseConnection(conn, stmt, rs);
        }
        
        return check;
    }
    
    public List<usuario> readBuscar(String usuario){
        Connection conn = ConnectionFactory.GetConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<usuario> usuarios = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM usuario WHERE usuario LIKE ?");
            stmt.setString(1, "%"+usuario+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                usuario user = new usuario();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setUsuario(rs.getString("usuario"));
                user.setSenha(rs.getString("senha"));
                
                usuarios.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.CloseConnection(conn, stmt, rs);
        }
        
        return usuarios;
    }
}
