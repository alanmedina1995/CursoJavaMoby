package ejemplosStream;

import java.util.stream.Stream;

public class EjemplosStreamReduce {
    public static void main(String[] args) {

        Stream<String> nombres = Stream
                .of("Pato Gusman","Pato Gusman","Pato Gusman","Pato Gusman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .distinct();
        String resultado = nombres.reduce("", (a, b) -> a+ " "+ b);
        System.out.println("resultado = " + resultado);


    }
}
