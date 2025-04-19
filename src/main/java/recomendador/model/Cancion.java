package recomendador.model;

import java.util.Objects;

public class Cancion {

    private String titulo;
    private String artista;
    private String genero;
    private double duracionMin;
    private int popularidad;



    public Cancion() {
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(double duracionMin) {
        this.duracionMin = duracionMin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Double.compare(duracionMin, cancion.duracionMin) == 0 && popularidad == cancion.popularidad && Objects.equals(titulo, cancion.titulo) && Objects.equals(artista, cancion.artista) && Objects.equals(genero, cancion.genero);
    }

}
