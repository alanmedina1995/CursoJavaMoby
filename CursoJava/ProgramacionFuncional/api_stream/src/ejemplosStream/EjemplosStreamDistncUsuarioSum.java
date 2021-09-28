package ejemplosStream;

import models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemplosStreamDistncUsuarioSum {
    public static void main(String[] args) {
        IntStream longNombres = Stream
                .of("Pato Gusman", "Pato Gusman", "Paco Gonzalez", "Pepa Gutierrez","Pato Gusman", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

        IntSummaryStatistics stats = longNombres.summaryStatistics();
        System.out.println("max: "+ stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("sum: " +stats.getSum() );
        System.out.println("promedio: " + stats.getAverage());
        System.out.println("total: " + stats.getCount());

    }
}
