package Model;

public class Libro {
    private static int contadorId = 0;
    private int id = 0;
    private String titulo;
    private String autor;
    private String editorial;
    private int edicion;
    private String fechaPublicacion;
    private boolean disponible = true;

    public Libro() {
        this.id = ++contadorId;
    }
    
    public Libro(String titulo, String autor, String editorial, int edicion, String fechaPublicacion) {
        this.id = ++contadorId;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", edicion=" + edicion +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
