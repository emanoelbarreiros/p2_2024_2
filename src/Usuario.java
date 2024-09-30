


public class Usuario {

    private String nome;
    private String cpf;
    private int idade;

    public Usuario(String n, String c, int i) {
        nome = n;
        cpf = c;
        idade = i;
    }

    public Usuario() {
        this.nome  = "";
        this.cpf = "";
        this.idade = 0;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
