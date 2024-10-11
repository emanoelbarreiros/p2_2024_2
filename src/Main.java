import conta.Conta;
import gui.TesteFrame;


import javax.swing.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void lancaExcecao() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
        try {
            TesteFrame panel = new TesteFrame();

            JFrame frame = new JFrame();
            frame.setContentPane(panel.getPnlMain());
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("A Input Mismatch Exception ocorreu.");
        } 

    }
}