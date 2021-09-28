package ejemplosStream;

import models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemplosStreamMap {
    public static void main(String[] args) {

//        Stream<String> nombre = Stream
//                .of("Pato", "Paco", "Pepa", "Pepe")
//                .map(String::toUpperCase)
//                .peek(System.out::println) //Inspecciona la linea anterior e imprime
//                .map(String::toLowerCase);
//
//        List<String> lista = nombre.collect(Collectors.toList());
//        lista.forEach(System.out::println);

    Stream<Usuario> nombres = Stream
            .of("Paco Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
            .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1])) //.split separa por array al indicar " "
            .peek(System.out::println)
            .map(usuario -> {
                String nombre = usuario.getNombre().toUpperCase();
                usuario.setNombre(nombre);
                return usuario;
            });

    List<Usuario> lista = nombres.collect(Collectors.toList());
    lista.forEach(System.out::println);

    }
}
