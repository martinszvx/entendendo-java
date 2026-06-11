package aula7_att6;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "12345", 8.5, 7.0);
        Aluno aluno2 = new Aluno("Maria", "67890", 9.0, 8.5);
        
        aluno1.exibirInformacoes();
        aluno1.calcularMedia();
        
        System.out.println();
        
        aluno2.exibirInformacoes();
        aluno2.calcularMedia();
    }
}