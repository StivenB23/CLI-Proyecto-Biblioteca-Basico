package Model;

import java.util.LinkedList;
import java.util.Queue;

public class Usuario {
    private int identificador;
    private String nombre;
    private String correo;
    private Queue<Libro> librosPrestados = new LinkedList<>();

    public Usuario(){
        
    }

    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Queue<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
    public void setLibrosPrestados(Queue<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
}
