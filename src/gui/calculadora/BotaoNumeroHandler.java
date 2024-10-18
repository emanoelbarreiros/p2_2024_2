package gui.calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoNumeroHandler implements ActionListener {
    private int numero;
    private ControladorCalculadora controlador;

    public BotaoNumeroHandler(int numero, ControladorCalculadora controlador) {
        this.numero = numero;
        this.controlador = controlador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.controlador.numeroPressionado(this.numero);
    }
}
