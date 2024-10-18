package gui.calculadora2;

import javax.swing.*;

public class CalculadoraTeste2 {

    public static void main(String[] args) {
        ControladorCalculadora2 controlador = new ControladorCalculadora2();
        Calculadora2 calc = new Calculadora2(controlador);

        JFrame janela = new JFrame("Calculadora");
        janela.setContentPane(calc.getPnlPrincipal());
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
