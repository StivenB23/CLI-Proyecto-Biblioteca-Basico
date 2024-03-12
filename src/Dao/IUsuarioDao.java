package Dao;

import java.util.Stack;

import Model.Libro;
import Model.Usuario;

public interface IUsuarioDao {
    public Stack<Usuario> listarsUsuarios();
    
    public Usuario buscarUsuarioId(int id);

    public void guardarUsuario();

    public void prestarLibroUsuario(int idUsuario, Libro libro);
    
    public void devolverLibroUsuario(int idLibro);
}
