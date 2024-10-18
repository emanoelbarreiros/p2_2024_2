package gui.calculadora;

import javax.swing.*;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        JFrame janela = new JFrame();
        janela.setContentPane(calculadora.getPnlMain());
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Calculadora");
        janela.pack();
        janela.setResizable(false);
        //janela.setSize(500, 500);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
