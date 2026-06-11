package aula7_att4;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(12345, 1000.0, "Maria");
        conta1.exibirSaldo();
        conta1.depositar(500.0);
        conta1.exibirSaldo();
        conta1.sacar(200.0);
        conta1.exibirSaldo();
        conta1.sacar(1500.0); // Tentativa de saque com saldo insuficiente
        conta1.exibirSaldo();
    }
}
