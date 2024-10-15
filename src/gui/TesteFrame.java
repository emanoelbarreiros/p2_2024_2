package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TesteFrame {
    private JPanel pnlMain;
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton rb1;

    public TesteFrame() {
        button1.addActionListener(new BotaoActionListener());
    }

    public JPanel getPnlMain() {
        return pnlMain;
    }


}
