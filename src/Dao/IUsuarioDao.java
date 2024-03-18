package Dao;

import java.util.List;

import Model.Usuario;

public interface IUsuarioDao {
    public List<Usuario> listarsUsuarios();
    
    public Usuario buscarUsuarioId(int id);

    Usuario buscarUsuarioIdentificacion(String identificacion);

    public void guardarUsuario(Usuario usuario);

    public void prestarLibroUsuario(String identificacionUsuario, int idLibro);
    
    public void devolverLibroUsuario(String identificacionUsuario, int idLibro);

}
