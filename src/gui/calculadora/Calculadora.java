package gui.calculadora;

import javax.swing.*;

public class Calculadora {
    private JTextField visor;
    private JPanel pnlMain;
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

    public Calculadora() {
        ControladorCalculadora controlador = new ControladorCalculadora(this);

        botao1.addActionListener(new BotaoNumeroHandler(1, controlador));
        botao2.addActionListener(new BotaoNumeroHandler(2, controlador));
        botao3.addActionListener(new BotaoNumeroHandler(3, controlador));
        botao4.addActionListener(new BotaoNumeroHandler(4, controlador));
        botao5.addActionListener(new BotaoNumeroHandler(5, controlador));
        botao6.addActionListener(new BotaoNumeroHandler(6, controlador));
        botao7.addActionListener(new BotaoNumeroHandler(7, controlador));
        botao8.addActionListener(new BotaoNumeroHandler(8, controlador));
        botao9.addActionListener(new BotaoNumeroHandler(9, controlador));
        botao0.addActionListener(new BotaoNumeroHandler(0, controlador));

        botaoSoma.addActionListener(new BotaoOperacaoHandler(Operacao.SOMA, controlador));
        botaoMultiplicacao.addActionListener(new BotaoOperacaoHandler(Operacao.MULTIPLICACAO, controlador));
        botaoSubtracao.addActionListener(new BotaoOperacaoHandler(Operacao.SUBSTRACAO, controlador));
        botaoDivisao.addActionListener(new BotaoOperacaoHandler(Operacao.DIVISAO, controlador));
        botaoIgual.addActionListener(new BotaoOperacaoHandler(Operacao.IGUAL, controlador));
    }

    public JPanel getPnlMain() {
        return pnlMain;
    }

    public void atualizarVisor(double numero) {
        this.visor.setText(String.valueOf(numero));
    }
}
