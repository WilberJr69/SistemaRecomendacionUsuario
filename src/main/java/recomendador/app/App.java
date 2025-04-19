package recomendador.app;

import recomendador.services.AutenticacionUsuario;
import recomendador.services.Recomendacion;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nombreUsuario, passwordUsuario;

        System.out.print("Escriba su nombre de usuario: "); nombreUsuario = input.nextLine();
        System.out.print("Escriba su password: "); passwordUsuario = input.nextLine();

        AutenticacionUsuario autenticacionUsuario = new AutenticacionUsuario();

        if (autenticacionUsuario.usuarioAutenticado(nombreUsuario, passwordUsuario)) {
            System.out.println("🎉 Usuario logeado correctamente");

            Recomendacion recomendacion = new Recomendacion();

            System.out.println("\nCanciones que te pueden gustar que aun no has escuchado: ");
            recomendacion.cancionesRecomendadas(nombreUsuario)
                    .forEach(c -> System.out.println("🎵 " + c.getTitulo()));

            System.out.println("\nLibros que te pueden gustar que aun no has leido: ");
            recomendacion.librosRecomendados(nombreUsuario)
                    .forEach(l -> System.out.println("📘 " + l.getTitulo()));

            System.out.println("\nPeliculas que te pueden gustar que aun no has visto: ");
            recomendacion.peliculasRecomendadas(nombreUsuario)
                    .forEach(p -> System.out.println("🎬 "+p.getTitulo()));

        } else {
            System.out.println("Usuario o password incorrecto");
        }





    }
}
