package recomendador.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import recomendador.model.Catalogo;
import recomendador.model.Credenciales;
import recomendador.model.UsuarioHistorial;

import java.io.File;
import java.util.List;


public class JsonReader {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public Catalogo leerCatalogoJson(){
        try {
            return objectMapper.readValue(new File("src/main/java/json/informacion/catalogo_general.json"), Catalogo.class);
        }catch (Exception e){
            System.out.println("Error al leer el archivo JSON: "+e.getMessage());
            return null;
        }
    }

    public List<Credenciales> leerCredencialesJson(){
        try {
            File credencialesJson = new File("src/main/java/json/credenciales/usuarios_credenciales.json");
            return objectMapper.readValue(credencialesJson, new TypeReference<List<Credenciales>>() {});
        }catch (Exception e){
            System.out.println("Error al leer el archivo JSON: "+e.getMessage());
            return null;
        }
    }

    public UsuarioHistorial leerHistorialUsuario(String nombreUsuario){
        try {
            File historialUsuariosJson = new File("src/main/java/json/historial/usuario_"+nombreUsuario+".json");
            return objectMapper.readValue(historialUsuariosJson, UsuarioHistorial.class);

        }catch (Exception e){
            System.out.println("Error al leer el archivo JSON: "+e.getMessage());
            return null;
        }
    }



}
