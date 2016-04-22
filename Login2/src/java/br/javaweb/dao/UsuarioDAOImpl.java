package br.javaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import br.javaweb.beans.Usuario;
import br.javaweb.util.JavaWebException;

public abstract class UsuarioDAOImpl implements UsuarioDAO {

    private final String INSERT_QUERY = "insert into informacoes (nome,email) values (?,?)";
    private final String SELECT_ALL_QUERY = "select * from informacoes";
    private final String SELECT_BY_ID_QUERY = "select * from informacoes where id = ? ";
    private final static String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS informacoes ( nome varchar(50) default NULL, email varchar(50) default NULL,PRIMARY KEY  (id))";

    public void save(Usuario p) throws JavaWebException {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement prepStmt = null;
        try {
            conn = GerenciadorConexoes.getConexao();
            prepStmt = conn.prepareStatement(INSERT_QUERY);
            prepStmt.setString(1, p.getNome());
            prepStmt.setString(2, p.getEmail());
            
            prepStmt.execute();
        } catch (SQLException e) {
            String msg = "[InformacoesDB][save(Informacoes p)]: " + e.getMessage();
            JavaWebException ge = new JavaWebException(msg, e);
            throw ge;
        } finally {
            GerenciadorConexoes.closeAll(conn, prepStmt, rs);
        }
    }

   