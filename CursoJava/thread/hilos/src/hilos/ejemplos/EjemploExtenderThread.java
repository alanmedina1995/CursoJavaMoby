package hilos.ejemplos;

import threads.NombreThread;

public class EjemploExtenderThread {
    public static  void main(String[] args){
        Thread hilo = new NombreThread("Jhon Doe");
        hilo.start();

        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();

        NombreThread hilo3 = new NombreThread("Pepe");
        hilo3.start();

        System.out.println(hilo.getState());
    }
}
