package gui.calculadora2;

import javax.swing.*;

public class Calculadora2 {
    private JTextField visor;
    private JPanel pnlPrincipal;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton botaoDivisao;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botaoMultiplicacao;
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botaoSubtracao;
    private JButton botao0;
    private JButton botaoPonto;
    private JButton botaoIgual;
    private JButton botaoSoma;

    private ControladorCalculadora2 controlador;

    public Calculadora2(ControladorCalculadora2 controlador) {
        this.controlador = controlador;
        this.controlador.setCalculadora(this);
        botao0.addActionListener(new BotaoNumeroHandler2(0, controlador));
        botao1.addActionListener(new BotaoNumeroHandler2(1, controlador));
        botao2.addActionListener(new BotaoNumeroHandler2(2, controlador));
        botao3.addActionListener(new BotaoNumeroHandler2(3, controlador));
        botao4.addActionListener(new BotaoNumeroHandler2(4, controlador));
        botao5.addActionListener(new BotaoNumeroHandler2(5, controlador));
        botao6.addActionListener(new BotaoNumeroHandler2(6, controlador));
        botao7.addActionListener(new BotaoNumeroHandler2(7, controlador));
        botao8.addActionListener(new BotaoNumeroHandler2(8, controlador));
        botao9.addActionListener(new BotaoNumeroHandler2(9, controlador));
    }

    public JPanel getPnlPrincipal() {
        return pnlPrincipal;
    }

    public void atualizarVisor(double valor) {
        this.visor.setText(String.valueOf(valor));
    }

}
