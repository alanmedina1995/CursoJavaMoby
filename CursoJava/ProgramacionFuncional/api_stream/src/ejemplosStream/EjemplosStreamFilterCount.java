package ejemplosStream;

import models.Usuario;

import java.util.stream.Stream;

public class EjemplosStreamFilterCount {
    public static void main(String[] args) {

    long count = Stream
            .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
            .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) //.split separa por array al indicar " "
            .filter(u -> u.getId().equals(2))
            .peek(System.out::println)
            .count();

        System.out.println(count);

        
    }
}
