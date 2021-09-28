package ejemplosStream;

import models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamDistint {
    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Pato Gusman","Pato Gusman","Pato Gusman","Pato Gusman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .distinct();
        nombres.forEach(System.out::println);



    }
}
