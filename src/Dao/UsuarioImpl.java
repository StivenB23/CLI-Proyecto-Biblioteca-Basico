package Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Libro;
import Model.Usuario;

public class UsuarioImpl implements IUsuarioDao {

    private LibroImpl libroImpl = new LibroImpl();

    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public List<Usuario> listarsUsuarios() {
        return this.usuarios;
    }

    @Override
    public Usuario buscarUsuarioId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUsuarioId'");
    }

    @Override
    public Usuario buscarUsuarioIdentificacion(int id) {
        
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void devolverLibroUsuario(int idLibro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'devolverLibroUsuario'");
    }

    @Override
    public void prestarLibroUsuario(String identificacionUsuario, String nombreLibro) {
        Libro libro = libroImpl.buscarLibroTitulo(nombreLibro);
        Usuario usuario = buscarUsuarioId(Integer.parseInt(identificacionUsuario));
    }

}
