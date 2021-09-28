package ejemplosStream;

import models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemplosStreamFilterEmpty {
    public static void main(String[] args) {

        long count = Stream
                .of("Pato Gusman", "", "", "Pepe Mena", "Pepe Garcia")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("count = " + count);



    }
}
