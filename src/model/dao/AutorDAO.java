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
import model.bean.Autor;

public class AutorDAO {
    public void create(Autor autor){
        Connection conn = ConnectionFactory.GetConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("INSERT INTO autor(nome, dt_nasc, cidade, estado, pais) VALUES (?,?,?,?,?)");
              stmt.setString(1,autor.getNome());
              stmt.setString(2,autor.getDt_nasc());
              stmt.setString(3,autor.getCidade());
              stmt.setString(4,autor.getEstado());
              stmt.setString(5,autor.getPais());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar:"+ex);
        }finally{
            ConnectionFactory.CloseConnection(conn, stmt);
        }
    }
    
    public void update(Autor a){
        Connection conn = ConnectionFactory.GetConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("UPDATE autor SET nome=?,dt_nasc=?,cidade=?,estado=?,pais=? WHERE id=?");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getDt_nasc());
            stmt.setString(3, a.getCidade());
            stmt.setString(4, a.getEstado());
            stmt.setString(5, a.getPais());
            stmt.setInt(6, a.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar:"+ex);
        }finally{
            ConnectionFactory.CloseConnection(conn, stmt);
        }
    }
    
    public void delete(Autor a){
        Connection conn = ConnectionFactory.GetConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("DELETE FROM autor WHERE id=?");
            stmt.setInt(1, a.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso...");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir:"+ex);
        }finally{
            ConnectionFactory.CloseConnection(conn, stmt);
        }
    }
    public List<Autor> read(){
        Connection conn = ConnectionFactory.GetConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Autor> Autor = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM autor");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Autor at = new Autor();
                at.setId(rs.getInt("id"));
                at.setNome(rs.getString("nome"));
                at.setDt_nasc(rs.getString("dt_nasc"));
                at.setCidade(rs.getString("cidade"));
                at.setEstado(rs.getString("estado"));
                at.setPais(rs.getString("pais"));
                
                Autor.add(at);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.CloseConnection(conn, stmt, rs);
        }
        
        return Autor;
    }
    
    public List<Autor> readBuscar(String autor){
        Connection conn = ConnectionFactory.GetConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Autor> at = new ArrayList<>();
        
        try {
            stmt = conn.prepareStatement("SELECT * FROM autor WHERE nome LIKE ?");
            stmt.setString(1, "%"+autor+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Autor atr = new Autor();
                atr.setId(rs.getInt("id"));
                atr.setNome(rs.getString("nome"));
                atr.setDt_nasc(rs.getString("dt_nasc"));
                atr.setCidade(rs.getString("cidade"));
                atr.setEstado(rs.getString("estado"));
                atr.setPais(rs.getString("pais"));
                
                at.add(atr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.CloseConnection(conn, stmt, rs);
        }
        
        return at;
    }
}
