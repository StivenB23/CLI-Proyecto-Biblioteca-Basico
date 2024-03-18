package Dao;

import java.util.ArrayList;
import java.util.List;

import Model.Libro;
import Model.Usuario;

public class UsuarioImpl implements IUsuarioDao {
    private static UsuarioImpl instance; 
    private LibroImpl libroImpl = LibroImpl.getInstance();
    private List<Usuario> usuarios = new ArrayList<>();
    private UsuarioImpl(){
        
    }
    public static UsuarioImpl getInstance() {
        if (instance == null) {
            instance = new UsuarioImpl();
        }
        return instance;
    }

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
    public Usuario buscarUsuarioIdentificacion(String identificacion) {
         Usuario us = new Usuario();
         return us;
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
    public void prestarLibroUsuario(String identificacionUsuario, int idLibro) {
        Libro libro = libroImpl.buscarLibroId(idLibro);
        // Usuario usuarioPrestamo = buscarUsuarioIdentificacion(identificacionUsuario);
        for (Usuario usuario : usuarios) {
            if (usuario.getIdentificador().equals(identificacionUsuario)) {
                usuario.addLibrosPrestados(libro);
                break;
            }
        }
    }

}
