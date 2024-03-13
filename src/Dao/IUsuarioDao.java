package Dao;

import java.util.List;

import Model.Libro;
import Model.Usuario;

public interface IUsuarioDao {
    public List<Usuario> listarsUsuarios();
    
    public Usuario buscarUsuarioId(int id);

    public void guardarUsuario(Usuario usuario);

    public void prestarLibroUsuario(int idUsuario, Libro libro);
    
    public void devolverLibroUsuario(int idLibro);
}
