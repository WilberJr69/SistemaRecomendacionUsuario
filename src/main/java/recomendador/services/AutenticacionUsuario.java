package recomendador.services;

import recomendador.model.Credenciales;
import recomendador.utils.JsonReader;

import java.util.List;

public class AutenticacionUsuario {

    JsonReader jsonReader = new JsonReader();
    List<Credenciales> credenciales = jsonReader.leerCredencialesJson();

    public boolean usuarioAutenticado(String nombreUsuario, String passwordUsuario){
        if (
                credenciales.stream().anyMatch(c->c.getUsuario().equals(nombreUsuario)) && credenciales.stream().anyMatch(c->c.getPassword().equals(passwordUsuario))
                
        ){
            return true;
        }else {
            return false;
        }

    }

}
