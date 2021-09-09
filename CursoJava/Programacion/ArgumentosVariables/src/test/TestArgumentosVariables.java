package test;

public class TestArgumentosVariables {
    public static void main(String[] arags){
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("Juan", 8,9,10,11);
    }

    private static void variosParametros(String nombre, int... numeros){ //el argumento variable siempre a lo ultimo
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }


    private static void imprimirNumeros(int... numeros){
        for ( int i = 0; i < numeros.length; i++){
            System.out.println("Elemento: " + numeros[i]);
        }
    }

}
