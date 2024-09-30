import java.util.Scanner;

public class Grafico {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de números:");

        int n = scan.nextInt();

        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scan.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
