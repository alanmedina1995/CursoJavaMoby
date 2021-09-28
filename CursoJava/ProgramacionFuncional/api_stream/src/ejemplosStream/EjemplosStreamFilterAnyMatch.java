package ejemplosStream;

import models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFilterAnyMatch {
    public static void main(String[] args) {

    boolean existe = Stream
            .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
            .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) //.split separa por array al indicar " "
            .filter(u -> u.getId().equals(2))
            .peek(System.out::println)
            .anyMatch(u-> u.getId().equals(1));

        System.out.println(existe);


    }
}
