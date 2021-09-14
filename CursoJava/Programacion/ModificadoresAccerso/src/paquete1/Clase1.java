package paquete1;

//public class Clase1 {
//    /*
//    public String atributoPublico = "Valor atributo publico";
//
//    public Clase1(){
//        System.out.println("Constructor Publico");
//    }
//
//    public void metodoPublico(){
//        System.out.println("Metodo Publico");
//    }
//    */
//
//    protected String atributoProtected = "Valor atributo protected";
//
//    protected Clase1() {
//        System.out.println("Cosntructor protecter");
//    }
//
//    public Clase1(String arg){
//        System.out.println("Constructor publico");
//    }
//
//    protected void metodoProtected(){
//        System.out.println("Metodo protected");
//    }
//
//}

//class Clase1{
//
//    String atributoDefault = "Valor atributo default";
//
//    Clase1(){
//        System.out.println("Constructor Default");
//    }
//
//    void metodoDefault(){
//        System.out.println("Metodo Default");
//    }

    public class Clase1 {

        private String atributoPrivado = "Valor atributo privado";

        private Clase1() {
            System.out.println("Constructor Privado");
        }

        public Clase1(String argumento){
            this();
            System.out.println("Constructo publico privado");
        }

        private void metodoPrivado() {
            System.out.println("Metodo Privado");
        }

        public String getAtributoPrivado() {
            return atributoPrivado;
        }

        public void setAtributoPrivado(String atributoPrivado) {
            this.atributoPrivado = atributoPrivado;
        }
    }

