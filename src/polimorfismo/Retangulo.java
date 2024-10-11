package polimorfismo;

public class Retangulo extends Quadrilatero {

    public Retangulo(int lado1, int lado2) {
        super(lado1, lado1, lado2, lado2);
    }

    @Override
    public int calcularArea() {
        return this.getTamLado1()*this.getTamLado3();
    }

    public String toString() {
        return "Retangulo";
    }
}
