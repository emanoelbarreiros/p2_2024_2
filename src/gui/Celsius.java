package gui;

import javax.swing.*;

public class Celsius {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Informe a temperatura em Farenheit");
        double farenheit = Double.parseDouble(valor);
        double celsius = (farenheit - 32) * 5 / 9;
        JOptionPane.showMessageDialog(null,
                "Temperatura em Celsius" + celsius,
                "Calculadora Temp", JOptionPane.INFORMATION_MESSAGE);
    }
}
