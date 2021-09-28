package ejemplosStream;

import models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamFilter {
    public static void main(String[] args) {

    Stream<Usuario> nombres = Stream
            .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
            .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) //.split separa por array al indicar " "
            //.filter(u -> u.getNombre().equals("Pato"))
            .flatMap(u -> {
                if (u.getNombre().equalsIgnoreCase("Pepe"))
                {
                    return Stream.of(u);
                }
                return Stream.empty();                    
            })
            .peek(System.out::println);

        System.out.println(nombres.count());

    }
}
