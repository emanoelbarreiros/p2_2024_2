package gui;

import javax.swing.*;

public class PaintPanelTest {
    public static void main(String[] args) {
        PaintPanel panel = new PaintPanel();

        JFrame frame = new JFrame();
        frame.setContentPane(panel.getPanel());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
