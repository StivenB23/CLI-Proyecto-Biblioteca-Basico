package Dao;

import java.util.Stack;

import Model.Libro;
import Model.Usuario;

public class UsuarioImpl implements IUsuarioDao {

    @Override
    public Stack<Usuario> listarsUsuarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarsUsuarios'");
    }

    @Override
    public Usuario buscarUsuarioId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUsuarioId'");
    }

    @Override
    public void guardarUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarUsuario'");
    }

    @Override
    public void prestarLibroUsuario(int idUsuario, Libro libro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prestarLibroUsuario'");
    }

    @Override
    public void devolverLibroUsuario(int idLibro) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'devolverLibroUsuario'");
    }

}
