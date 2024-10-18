package gui.calculadora;

public class ControladorCalculadora {

    private Integer operando1 = 0;
    private Integer operando2 = 0;
    private Double resultado;
    private Operacao operacao = Operacao.NENHUMA;
    private Calculadora calculadora;

    public ControladorCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
        this.calculadora.atualizarVisor(this.operando1);
    }

    public void numeroPressionado(int numero) {
        if (operacao == Operacao.NENHUMA) {
            operando1 = operando1 * 10 + numero;
            atualizarVisor(operando1);
        } else {
            operando2 = operando2 * 10 + numero;
            atualizarVisor(operando2);
        }

    }

    public void operacaoPressionada(Operacao operacao) {
        if (operacao == Operacao.IGUAL){
            switch (this.operacao) {
                case SOMA:
                    this.resultado = Double.valueOf(operando1) + operando2;
                    break;
                case MULTIPLICACAO:
                    this.resultado = Double.valueOf(operando1) * operando2;
                    break;
                case SUBSTRACAO:
                    this.resultado = Double.valueOf(operando1) - operando2;
                    break;
                case DIVISAO:
                    this.resultado = Double.valueOf(operando1) / operando2;
                    break;
            }
            calculadora.atualizarVisor(this.resultado);
            this.operando1 = 0;
            this.operando2 = 0;
            this.operacao = Operacao.NENHUMA;
        } else {
            this.operacao = operacao;
        }

    }

    private void atualizarVisor(int valor) {
        this.calculadora.atualizarVisor(valor);
    }


}
