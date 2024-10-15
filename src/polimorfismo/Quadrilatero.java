package polimorfismo;

public abstract class Quadrilatero implements Comparable {
    private int tamLado1;
    private int tamLado2;
    private int tamLado3;
    private int tamLado4;

    public Quadrilatero(int lado1, int lado2, int lado3, int lado4) {
        this.tamLado1 = lado1;
        this.tamLado2 = lado2;
        this.tamLado3 = lado3;
        this.tamLado4 = lado4;
    }

    public abstract int calcularArea();

    public int getTamLado1() {
        return tamLado1;
    }

    public int getTamLado2() {
        return tamLado2;
    }

    public int getTamLado3() {
        return tamLado3;
    }

    public int getTamLado4() {
        return tamLado4;
    }
}
