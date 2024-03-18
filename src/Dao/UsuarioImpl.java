package Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import Model.Libro;
import Model.Usuario;

public class UsuarioImpl implements IUsuarioDao {
    private static UsuarioImpl instance;
    private LibroImpl libroImpl = LibroImpl.getInstance();
    private List<Usuario> usuarios = new ArrayList<>();

    private UsuarioImpl() {

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
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getIdentificador().equals(identificacion)) {
                usuarioEncontrado = usuario;
                break;
            }
        }
        if (usuarioEncontrado == null) {
            throw new NoSuchElementException("\u001B[1m" + "\u001B[38;5;202m"
            + "Usuario no encontrado con el número de documento: " + identificacion + "\u001B[0m");
        }
        return usuarioEncontrado;
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void devolverLibroUsuario(String identificadorUsuario, int idLibro) {
        for (Usuario usuario : usuarios) {
            if (usuario.getIdentificador().equals(identificadorUsuario)) {
                usuario.setLibrosPrestados(usuario.devolverLibro());
                break;
            }
        }
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
