package paquete1;

import paquete1.*;

public class TestModificadoresAccesoDefault {

//    public static void main (String[] args){
//        Clase1 clase1 = new Clase1();
//        clase1.atributoDefault = "Cambio de la prueba";
//        System.out.println("clase atributo default: " + clase1.atributoDefault);
//    }

    public static void main (String[] args){
        Clase1 clase1 = new Clase1("Publico");
        clase1.setAtributoPrivado("Cambio valor atributo");
        System.out.println("clase1: " + clase1.getAtributoPrivado());
    }



}
