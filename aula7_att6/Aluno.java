package aula7_att6;

public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;

    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    void calcularMedia() {
        double media = (nota1 + nota2) / 2;
        System.out.println("Média do aluno " + nome + ": " + media);
    }

    void exibirInformacoes() {
        double media = (nota1 + nota2) / 2;
        String status = media >= 6.0 ? "Aprovado" : "Reprovado";
        System.out.println("Aluno: " + nome + " - Matrícula: " + matricula + " - Status: " + status);
    }
}
