import java.util.Scanner;

public class TesteFor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o capital a ser investido: ");
        double capital = scan.nextDouble();

        System.out.println("Informe a taxa de juros para o cálculo: ");
        double taxa = scan.nextDouble();

        System.out.println("Por quanto tempo o capital deve ser investido? ");
        int tempo = scan.nextInt();

        double montante = capital;
        for (int cont = 0; cont < tempo; cont++) {
            montante = montante + montante * taxa;
        }

        int cont = 0;
        while (cont < tempo) {
            montante = montante + montante * taxa;
            cont++;
        }

        System.out.printf("Valor final após o tempo investido: R$ %.2f%n", montante);
    }
}
