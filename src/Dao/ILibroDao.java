package Dao;
import java.util.Stack;

import Model.Libro;

public interface ILibroDao {
    public Stack<Libro> listarLibros();

    public Libro buscarLibroId(int id);

    public Libro buscarLibroTitulo(String titulo);

    public void guardarLibro(Libro libro);

    // Si alcanza el tiempo
    public void actualizarLibr();
}
