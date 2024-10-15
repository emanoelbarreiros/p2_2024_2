package gui;

import javax.swing.*;
import java.util.InputMismatchException;

public class TesteFrameMain {

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
