package aula5;

public class aluno {

    String nome;
    int idade;
    int matricula;
    float peso;
    float altura;
    String nacionalidade;
    String endereco;
    String turma;

    // CONSTRUTOR
    public aluno(String nome, int idade, int matricula, float peso,
                 float altura, String nacionalidade,
                 String endereco, String turma) {

        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.peso = peso;
        this.altura = altura;
        this.nacionalidade = nacionalidade;
        this.endereco = endereco;
        this.turma = turma;
    }

    // GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    // MÉTODOS

    void intervalo() {
        System.out.println(this.nome + " está fazendo intervalo!");
    }

    void estudar() {
        System.out.println(this.nome + " está estudando!");
    }

    void assistirAula() {
        System.out.println(this.nome + " está assistindo aula!");
    }

    void fazerTarefa() {
        System.out.println(this.nome + " está fazendo tarefa!");
    }

    // EXIBIR DADOS

    public void dados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Turma: " + this.getTurma());
    }

    // MAIN

    public static void main(String[] args) {

        aluno a1 = new aluno(
                "Lucas",
                17,
                2025303648,
                90.0f,
                1.77f,
                "Brasileiro",
                "Rua A, 01",
                "Turma A"
        );

        aluno a2 = new aluno(
                "Maria",
                18,
                2025303649,
                70.0f,
                1.65f,
                "Brasileira",
                "Rua B, 02",
                "Turma B"
        );

        aluno a3 = new aluno(
                "João",
                19,
                2025303650,
                80.0f,
                1.80f,
                "Brasileiro",
                "Rua C, 03",
                "Turma C"
        );

        aluno a4 = new aluno(
                "Ana",
                20,
                2025303651,
                60.0f,
                1.60f,
                "Brasileira",
                "Rua D, 04",
                "Turma D"
        );

        a1.dados();
        System.out.println("-----------------------------");

        a2.dados();
        System.out.println("-----------------------------");

        a3.dados();
        System.out.println("-----------------------------");

        a4.dados();
        System.out.println("-----------------------------");

        a1.intervalo();
        a2.estudar();
        a3.assistirAula();
        a4.fazerTarefa();
    }
}
