package Dao;

import java.util.Stack;

import Model.Libro;

public class LibroImpl implements ILibroDao {

    private Stack<Libro> libros = new Stack<>();

    @Override
    public Stack<Libro> listarLibros() {
        try {
            return this.libros;
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'listarLibros'");
        }
    }

    @Override
    public Libro buscarLibroId(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarLibroId'");
    }

    @Override
    public void guardarLibro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardarLibro'");
    }

    @Override
    public void actualizarLibr() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarLibr'");
    }

}
