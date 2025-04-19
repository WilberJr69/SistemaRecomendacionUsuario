package recomendador.model;

import java.util.Objects;

public class Pelicula {

    private String titulo;
    private String genero;
    private int duracionMin;
    private String fecha;
    private int popularidad;

    public Pelicula() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return duracionMin == pelicula.duracionMin && popularidad == pelicula.popularidad && Objects.equals(titulo, pelicula.titulo) && Objects.equals(genero, pelicula.genero) && Objects.equals(fecha, pelicula.fecha);
    }

    public Pelicula(String titulo, String genero, int duracionMin, String fecha, int popularidad) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracionMin = duracionMin;
        this.fecha = fecha;
        this.popularidad = popularidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }


}
