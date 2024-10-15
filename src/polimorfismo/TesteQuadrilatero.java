package polimorfismo;

import java.util.Collections;

public class TesteQuadrilatero {
    public static void main(String[] args) {
        Quadrilatero[] quadrilateros = new Quadrilatero[3];

        quadrilateros[0] = new Retangulo(2,4);
        quadrilateros[1] = new Retangulo(4,2);
        quadrilateros[2] = new Trapezio(1,2,3,4,3);

        for (Quadrilatero q : quadrilateros) {
            System.out.println(q + " " + q.calcularArea());
        }
        Comparable q1 = new Retangulo(2,4);
        Comparable q2 = new Trapezio(1,2,3,4,3);

        try {
            int resultado = q1.compareTo(q2);

            if (resultado < 0) {
                System.out.println("O primeiro é menor que o segundo");
            } else if (resultado > 0) {
                System.out.println("O segundo é menor que o primeiro.");
            } else {
                System.out.println("Os dois são iguais.");
            }
        } catch (ClassCastException e) {
            System.out.println("Compare apenas quadilateros entre si.");
        }


    }
}
