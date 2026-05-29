package aula3;

public class Main {

    String nome;

    void cantar(){
        System.out.println(nome + " está cantando!");
    }

    public static void main(String[] args) {
        Main p1 = new Main();
        p1.nome = "Lucas";
        p1.cantar();

    }
}
