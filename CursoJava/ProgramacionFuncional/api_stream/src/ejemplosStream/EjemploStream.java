package ejemplosStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        //Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "pepe");
        //nombres.forEach(System.out::println);

//        String[] arr = {"Pato", "Paco", "Pepa", "pepe"};
//        Stream<String> nombres = Arrays.stream(arr);
//        nombres.forEach(System.out::println);

//        Stream<String> nombres = Stream.<String>builder()
//                .add("Pato")
//                .add("paco")
//                .add("pepe")
//                .add("pepa")
//                .build();
//        nombres.forEach(System.out::println);

        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("paco");
        lista.add("pepe");
        lista.add("pepa");

        Stream<String> nombres = lista.stream();
        //nombres.forEach(System.out::println);
        lista.stream().forEach(System.out::println);

    }
}
