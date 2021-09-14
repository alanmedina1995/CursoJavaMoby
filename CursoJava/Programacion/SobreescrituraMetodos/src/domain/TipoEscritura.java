package domain;

public enum TipoEscritura {
    CLASICO("Escritura a Mano"),
    MODERNA("Escritura digital");

    private final String descripcion;

    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
}
