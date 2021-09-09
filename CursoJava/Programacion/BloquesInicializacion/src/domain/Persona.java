package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    //Bloque estatico, se ejecuta una unica vez
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    //Bloque dinamico se ejecuta en cada creacion del objeto
    {
        System.out.println("Ejecucion de bloque dinamico");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                '}';
    }
}
