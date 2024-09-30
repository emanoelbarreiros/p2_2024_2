package jogodavelha;

import java.util.Arrays;

public class Tabuleiro {

    private char[][] tabuleiro =
            {{'-','-','-'},
             {'-','-','-'},
             {'-','-','-'}};

//    public Tabuleiro() {
//        tabuleiro = ;
//    }

    public String toString() {
        String resultado =
                String.format("| %c %c %c |%n" +
                              "| %c %c %c |%n" +
                              "| %c %c %c |%n",
                        tabuleiro[0][0],
                        tabuleiro[0][1],
                        tabuleiro[0][2],
                        tabuleiro[1][0],
                        tabuleiro[1][1],
                        tabuleiro[1][2],
                        tabuleiro[2][0],
                        tabuleiro[2][1],
                        tabuleiro[2][2]);

        return resultado;
    }

    public void realizarJogada(char jogada, int linha, int coluna) {
        tabuleiro[linha][coluna] = jogada;
    }

    public boolean jogadaValida(int linha, int coluna) {
        boolean valida = linha >= 0
                && linha <= 2
                && coluna >= 0
                && coluna <= 2
                && tabuleiro[linha][coluna] == '-';
        return valida;
    }

    public boolean vencedor(char jogador) {
        //verificar linhas
        boolean linha0 = tabuleiro[0][0] == jogador
                && tabuleiro[0][1] == jogador
                && tabuleiro[0][2] == jogador;

        boolean linha1 = tabuleiro[1][0] == jogador
                && tabuleiro[1][1] == jogador
                && tabuleiro[1][2] == jogador;

        boolean linha2 = tabuleiro[2][0] == jogador
                && tabuleiro[2][1] == jogador
                && tabuleiro[2][2] == jogador;

        //verificar colunas
        boolean coluna0 = tabuleiro[0][0] == jogador
                && tabuleiro[1][0] == jogador
                && tabuleiro[2][0] == jogador;

        boolean coluna1 = tabuleiro[0][1] == jogador
                && tabuleiro[1][1] == jogador
                && tabuleiro[2][1] == jogador;

        boolean coluna2 = tabuleiro[0][2] == jogador
                && tabuleiro[1][2] == jogador
                && tabuleiro[2][2] == jogador;
        //verificar diagonais

        boolean diagonalP = tabuleiro[0][0] == jogador
                && tabuleiro[1][1] == jogador
                && tabuleiro[2][2] == jogador;

        boolean diagonalS = tabuleiro[0][2] == jogador
                && tabuleiro[1][1] == jogador
                && tabuleiro[2][0] == jogador;

        return linha0 || linha1 || linha2
                || coluna0 || coluna1 || coluna2
                || diagonalP || diagonalS;
    }

    public boolean empate() {
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }

        return true;
    }
}
