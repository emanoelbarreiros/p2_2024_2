package polimorfismo;

public class TesteQuadrilatero {
    public static void main(String[] args) {
        Quadrilatero[] quadrilateros = new Quadrilatero[3];

        quadrilateros[0] = new Retangulo(2,4);
        quadrilateros[1] = new Retangulo(3,6);
        quadrilateros[2] = new Trapezio(1,2,3,4,3);

        for (Quadrilatero q : quadrilateros) {
            System.out.println(q + " " + q.calcularArea());
        }
    }
}
