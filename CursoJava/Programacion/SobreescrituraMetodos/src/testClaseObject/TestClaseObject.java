package testClaseObject;

import domain.*;

public class TestClaseObject {

    public static void main(String[] args){
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia");
        }
        else{
            System.out.println("Tienen distinta referencia");
        }

        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        }
        else{
            System.out.println("Los objetos son diferentes");
        }

        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor hascod es igual");
        }
        else{
            System.out.println("El valor hashcode es distinto");
        }


    }

}
