package recomendador.services;

import recomendador.model.Cancion;
import recomendador.model.Libro;
import recomendador.model.Pelicula;
import recomendador.utils.JsonReader;

import java.util.ArrayList;
import java.util.List;

public class Recomendacion {

    JsonReader jsonReader = new JsonReader();

    public List<Cancion> cancionesUsuario(String nombreUsuario){

        return jsonReader.leerHistorialUsuario(nombreUsuario).getCanciones();

    }

    public List<Cancion> cancionesRecomendadas(String nombreUsario){

        List<String> generosUsuarioCanciones = cancionesUsuario(nombreUsario).stream()
                        .map(Cancion::getGenero)
                        .toList();

        List<Cancion> catalogoCanciones = jsonReader.leerCatalogoJson().getCanciones();
        List<Cancion> cancionesARecomendar = new ArrayList<>(catalogoCanciones.stream()
                .filter(c -> generosUsuarioCanciones.contains(c.getGenero()))
                .toList()
        );

        cancionesARecomendar.removeAll(cancionesUsuario(nombreUsario));
        return cancionesARecomendar;

    }

    public List<Libro> librosUsuarios(String nombreUsuario){

        return jsonReader.leerHistorialUsuario(nombreUsuario).getlibros();

    }

    public List<Libro> librosRecomendados(String nombreUsuario){

        List<String> generoUsuarioLibros = librosUsuarios(nombreUsuario).stream()
                .map(Libro::getGenero)
                .toList();

        List<Libro> catalogoLibros = jsonReader.leerCatalogoJson().getLibros();
        List<Libro> librosARecomendar = new ArrayList<>(catalogoLibros.stream()
                .filter(c -> generoUsuarioLibros.contains(c.getGenero()))
                .toList()
        );

        librosARecomendar.removeAll(librosUsuarios(nombreUsuario));

        return librosARecomendar;

    }

    public List<Pelicula> peliculasUsuario(String nombreUsuario){

        return jsonReader.leerHistorialUsuario(nombreUsuario).getPeliculas();

    }

    public List<Pelicula> peliculasRecomendadas(String nombreUsuario){

        List<String> generosUsuarioPeliculas = peliculasUsuario(nombreUsuario).stream()
                .map(Pelicula::getGenero)
                .toList();

        List<Pelicula> peliculasCatalogo = jsonReader.leerCatalogoJson().getPeliculas();
        List<Pelicula> peliculasARecomendar = new ArrayList<>(peliculasCatalogo.stream()
                .filter(c->generosUsuarioPeliculas.contains(c.getGenero()))
                .toList()

        );
        peliculasARecomendar.removeAll(peliculasUsuario(nombreUsuario));

        return peliculasARecomendar;
    }


}
