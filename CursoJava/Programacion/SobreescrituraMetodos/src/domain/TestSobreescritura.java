//package domain;
//
//public class TestSobreescritura {
//
//    public static void main(String[] args){
//
//        Empleado empleado = new Empleado("Karla", 1000);
//        //imprimir(empleado);
//
//        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
//        //System.out.println("gerente1: " + gerente1.obtenerDetalles());
//        //imprimir(gerente1);
//        determinarTipo(gerente1);
//    }
//
//    //Ejemplo polimorfirmo
//    public static void imprimir(Empleado empleado){
//        System.out.println("empleado: " + empleado.obtenerDetalles()) ;
//    }
//
//    //Ejemplo de InstanceOf
//    public static void determinarTipo(Empleado empleado){
//        if(empleado instanceof Gerente){
//            System.out.println("Es de tipo Gerente");
//            Gerente gerente = (Gerente) empleado;
//            System.out.println("gerente: " + gerente.getDepartamento());
//        }
//        else if(empleado instanceof Empleado){
//            System.out.println("Es de tipo Empleado");
//            System.out.println("empleado: " + empleado.getNombre());
//
//        }
//        if(empleado instanceof Object){
//            System.out.println("Es de tipo Object");
//            empleado.toString();
//
//        }
//    }
//
//}
