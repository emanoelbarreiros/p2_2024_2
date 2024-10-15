package polimorfismo;

public class Trapezio extends Quadrilatero {

    private int altura;

    public Trapezio(int lado1, int lado2, int lado3, int lado4, int altura) {
        super(lado1, lado2, lado3, lado4);
        this.altura = altura;
    }

    public int calcularArea() {
        return (this.getTamLado4() + this.getTamLado3()) * this.altura / 2;
    }

    public String toString() {
        return "Trapezio";
    }

    public int getAltura() {
        return this.altura;
    }

    @Override
    public int compareTo(Object o) {
        Quadrilatero q = (Quadrilatero) o;
        return this.calcularArea() - q.calcularArea();
    }
}
