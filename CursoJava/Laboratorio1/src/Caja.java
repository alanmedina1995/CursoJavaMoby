public class Caja {

    private int ancho;
    private int alto;
    private int profundidad;

    public Caja() {
        this.ancho=0;
        this.alto=0;
        this.profundidad=0;
    }

    public Caja(int ancho, int alto, int profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public int calcularVolumen(){
        var volumen = this.ancho * this.alto * this.profundidad;
        return volumen;
    }

}
