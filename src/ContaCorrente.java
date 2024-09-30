import conta.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numero, double saldo) {
        super();
        this.setNumero(numero);
        this.setSaldo(saldo);
    }


    public String toString() {
        return this.getNumero() + " " + this.getSaldo();
    }

}
