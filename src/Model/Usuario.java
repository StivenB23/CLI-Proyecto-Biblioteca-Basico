package Model;

import java.util.LinkedList;
import java.util.Queue;

public class Usuario {
    private static int contadorId = 0;

    private int id;
    private String identificador;
    private String nombre;
    private String correo;
    private Queue<Libro> librosPrestados = new LinkedList<>();

    public Usuario() {
        this.id = ++contadorId;

    }

    public Usuario(String identificador, String nombre, String correo) {
        this.id = ++contadorId;
        this.identificador = identificador;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
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

    public void addLibrosPrestados(Libro libro){
        this.librosPrestados.add(libro);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", identificador='" + identificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Libros='" + librosPrestados + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

}
