package ejemplosStream;

import models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFilterSingle2 {
    public static void main(String[] args) {

    Usuario usuario = Stream
            .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
            .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) //.split separa por array al indicar " "
            .filter(u -> u.getId().equals(2))
            .findFirst().orElseGet(() -> new Usuario("Joe", "Doe"));

        System.out.println(usuario);
    }
}
