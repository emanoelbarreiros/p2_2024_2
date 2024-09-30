import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo à calculadora.");
        System.out.println("Informe a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Fatorial");

        int operacao = scan.nextInt();

        System.out.println("Informe os operandos, separados por espaço:");

        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case 1 : //soma
                resultado = num1 + num2;
                break;
            case 2 : //subtracao
                resultado = num1 - num2;
                break;
            case 3 : //multiplicacao
                resultado = num1 * num2;
                break;
            case 4 : //divisao
                resultado = num1 / num2;
                break;
            case 5: //fatorial
                resultado = fatorial((int) num1);
            default:
                System.out.println("Operação não reconhecida.");
        }

        System.out.printf("Resultado: %.4f%n", resultado);
    }

    public static int fatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}