package Dao;

import java.util.NoSuchElementException;
import java.util.Stack;

import Model.Libro;

public class LibroImpl implements ILibroDao {
    private static LibroImpl instance;
    private Stack<Libro> libros = new Stack<>();

    private LibroImpl() {

    }

    public static LibroImpl getInstance() {
        if (instance == null) {
            instance = new LibroImpl(); // Crear la instancia solo si no existe
        }
        return instance;
    }

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
        Libro libroEncontrado = null;
        System.out.println(this.libros);
        for (Libro libro : this.libros) {
            if (libro.getId() == id) {
                libroEncontrado = libro;
                break;
            }
        }
        return libroEncontrado;
    }

    @Override
    public Libro buscarLibroTitulo(String titulo) {
        Libro libroEncontrado = new Libro();
        for (Libro libro : this.libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libroEncontrado = libro;
                return libroEncontrado; // Devuelve el libro encontrado inmediatamente
            }
        }
        // Si llega a este punto, significa que no se encontró el libro
        throw new NoSuchElementException("Libro no encontrado con el título: " + titulo);
    }

    @Override
    public void guardarLibro(Libro libro) {
        try {
            this.libros.push(libro);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Unimplemented method 'guardarLibro'");
        }
    }

    @Override
    public void actualizarLibr() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarLibr'");
    }

    @Override
    public void imprimirLibros() {
        for (Libro libro : this.libros) {
            System.out.println("\u001B[34m" + libro.getId() + "\u001B[0m" + ". " + libro.getTitulo());
        }
    }

}
