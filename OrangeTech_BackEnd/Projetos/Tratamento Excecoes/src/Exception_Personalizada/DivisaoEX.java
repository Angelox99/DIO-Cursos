package Exception_Personalizada;

public class DivisaoEX extends Exception {
    private int numerador;
    private int denominador;

    public DivisaoEX(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
