package gui.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoOperacaoHandler implements ActionListener {

    private Operacao operacao;
    private ControladorCalculadora controlador;

    public BotaoOperacaoHandler(Operacao operacao, ControladorCalculadora controlador) {
        this.operacao = operacao;
        this.controlador = controlador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.controlador.operacaoPressionada(this.operacao);
    }
}
