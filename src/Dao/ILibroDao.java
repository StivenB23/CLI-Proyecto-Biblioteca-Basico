package Dao;
import java.util.Stack;

import Model.Libro;

public interface ILibroDao {
    public Stack<Libro> listarLibros();

    public Libro buscarLibroId(int id);

    public void guardarLibro();

    // Si alcanza el tiempo
    public void actualizarLibr();
}
