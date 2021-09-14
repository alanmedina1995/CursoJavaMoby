package domain;

public class Escritor extends Empleado {

    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", TipoEscritura: " + tipoEscritura.getDescripcion();
    }


}
