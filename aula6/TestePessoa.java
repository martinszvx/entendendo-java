package aula6;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setSobrenome("Silva");
        p1.setIdade(25);
        p1.setNacionalidade("Brasileira");

        System.out.println("Bem vindo " + p1.getNome() + " " + p1.getSobrenome() + "!");
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Nacionalidade: " + p1.getNacionalidade());
    }
}