package test;

import accesoDatos.IAccesoDatos;
import accesoDatos.ImplementacionMySql;
import accesoDatos.ImplementacionOracle;

public class TestInterfaces {

    public static void main(String[] args){
        IAccesoDatos datos = new ImplementacionMySql();
        imprimir(datos);
        datos = new ImplementacionOracle();
        imprimir(datos);
    }

    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }

}
