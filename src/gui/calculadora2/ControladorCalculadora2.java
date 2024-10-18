package gui.calculadora2;

public class ControladorCalculadora2 {

    private double operando1;
    private Calculadora2 calculadora;

    public void numeroPressionado(double numero) {
        this.operando1 = operando1 * 10 + numero;
        this.calculadora.atualizarVisor(this.operando1);
    }

    public void setCalculadora(Calculadora2 calculadora) {
        this.calculadora = calculadora;
    }
}
