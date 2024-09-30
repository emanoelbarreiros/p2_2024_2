package jogodavelha;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Tabuleiro tab = new Tabuleiro();
        Scanner scan = new Scanner(System.in);

        System.out.println("Olã, bem vindo ao Jogo da Velha.");
        System.out.println("O primeiro jogador é o X.");

        char vez = 'X';
        int linha = 0;
        int coluna = 0;
        boolean jogadaRealizada = false;
        System.out.println(tab);

        while (true) {
            System.out.println("Vez do jogador " + vez);
            System.out.print("Informe linha e coluna: ");
            linha = scan.nextInt();
            coluna = scan.nextInt();

            if (tab.jogadaValida(linha, coluna)) {
                tab.realizarJogada(vez, linha, coluna);
                jogadaRealizada = true;

                if (tab.vencedor(vez)) {
                    System.out.println(tab);
                    System.out.printf("O jogador %c venceu!%n", vez);
                    break;
                } else {
                    if (tab.empate()) {
                        System.out.println(tab);
                        System.out.println("O jogo empatou!");
                        break;
                    }
                }
            } else {
                System.out.println("Jogada inválida. Escolha outra posição.");
            }

            System.out.println(tab);

            if (jogadaRealizada) {
                jogadaRealizada = false;
                if (vez == 'X') {
                    vez = 'O';
                } else {
                    vez = 'X';
                }
            }
        }
    }
}
