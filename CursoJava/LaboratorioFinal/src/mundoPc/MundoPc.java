package mundoPc;

import com.gm.mundopc.*;

public class MundoPc {

    public static void main(String[] args){
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bt", "HP");
        Raton raton = new Raton("BT", "hp");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, raton);

        Monitor monitorGamer = new Monitor("Gamer", 14);
        Teclado tecladoGamer = new Teclado("bt", "Gamer");
        Raton ratonGamer = new Raton("BT", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora HP", monitorGamer, tecladoGamer, ratonGamer);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);

        orden1.mostrarrden();
    }

}
