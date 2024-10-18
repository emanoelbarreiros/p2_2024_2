package gui.calculadora2;

import gui.calculadora.BotaoNumeroHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoNumeroHandler2 implements ActionListener {

    private int numero;
    private ControladorCalculadora2 controlador;

    public BotaoNumeroHandler2(int numero, ControladorCalculadora2 controlador) {
        this.numero = numero;
        this.controlador = controlador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controlador.numeroPressionado(this.numero);
    }
}
