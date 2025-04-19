package recomendador.model;

import java.util.List;

public class UsuarioHistorial {

    private String nombre;
    private List<Cancion> canciones;
    private List<Pelicula> peliculas;
    private List<Libro> libros;

    public UsuarioHistorial() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public List<Libro> getlibros() {
        return libros;
    }

    public void setlibros(List<Libro> libros) {
        libros = libros;
    }
}
