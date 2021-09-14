package test;

public class TestAutoboxingUnboxing {

    public static void main (String[] args){
        //Clases envolventes  de tipos primitivos
        /*
        int - Integer
        long - Long
        double - Double
        float - Float
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
         */

        Integer entero = 10;
        System.out.println("entero: " + entero);
        System.out.println("entero double: " + entero.doubleValue() );
        
        int entero2 = entero;
        System.out.println("entero2: " + entero2);
    }

}
