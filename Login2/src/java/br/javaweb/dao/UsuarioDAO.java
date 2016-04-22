package br.javaweb.dao;

import java.util.List;
import br.javaweb.beans.Usuario;
import br.javaweb.util.JavaWebException;

public interface UsuarioDAO {

    public void save(Usuario p) throws JavaWebException;

    public List<Usuario> getCatalogoProdutos() throws JavaWebException;

    public Usuario getUsuarioById(int id) throws JavaWebException;

    public void createTable() throws JavaWebException;
}