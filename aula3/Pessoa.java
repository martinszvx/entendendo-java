package aula3;



public class Pessoa {
    //Difinição de variáveis:
    String nome;
    int idade;
    String cidade;
    Float altura;
    String profissao;

    // como fzr metodo para pessoa1:
    public void digitar() {
        System.out.println(nome + " está digitando!");
    }

    public void andar() {
        System.out.println(nome + " está andando!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Lucas";
        pessoa1.idade = 17;
        pessoa1.cidade = "Rio Grande do Sul";
        pessoa1.altura = 1.75f;
        pessoa1.profissao = "Estudante";

        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Cidade: " + pessoa1.cidade);
        System.out.println("Altura: " + pessoa1.altura);
        System.out.println("Profissão: " + pessoa1.profissao);

        pessoa1.digitar();
        pessoa1.andar();
    }
}

