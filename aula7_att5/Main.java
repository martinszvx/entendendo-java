package aula7_att5;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        carro1.exibirStatus();
        carro1.acelerar(50.0);
        carro1.exibirStatus();
        carro1.frear(20.0);
        carro1.exibirStatus();
    }
}
