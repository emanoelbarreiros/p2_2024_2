import java.util.Scanner;

public class LivroNotas {
    private String nomeCurso;

    public LivroNotas(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void exibirBoasVindas() {
        System.out.println("Bem vindo ao livro de notas do curso " + nomeCurso);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void determinarMediaTurma() {
        Scanner scan = new Scanner(System.in);
        int qtdAlunos = 5;
        double nota;
        double acumulador = 0;
        int notasVermelhas = 0;
        int n = 1;
        while (n <= qtdAlunos) {
            System.out.println("Informe a nota " + n);
            nota = scan.nextDouble();
            if (nota < 7) {
                notasVermelhas += 1;
            }
            acumulador += nota;
            n += 1;
        }
        double media = acumulador / qtdAlunos;
        System.out.printf("Média da turma: %.2f%n", media);
        System.out.println(notasVermelhas + " alunos tiraram nota menor que 7.0");
    }
}
