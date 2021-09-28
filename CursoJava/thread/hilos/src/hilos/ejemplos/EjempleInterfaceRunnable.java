package hilos.ejemplos;

import runnable.ViajeTarea;

public class EjempleInterfaceRunnable {
    public static void main(String[] args){

        new Thread (new ViajeTarea("Isla de Pascua")).start();
        new Thread (new ViajeTarea("Robinson Crusoe")).start();
        new Thread (new ViajeTarea("Juan Fernandez")).start();
        new Thread (new ViajeTarea("Isla de Chile")).start();


    }
}
