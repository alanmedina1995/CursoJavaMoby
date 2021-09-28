package ejemplosStream;

import models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamDistncUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Gusman", "Pato Gusman", "Paco Gonzalez", "Pepa Gutierrez","Pato Gusman", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();

        nombres.forEach(System.out::println);


    }
}
