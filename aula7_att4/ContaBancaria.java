package aula7_att4;

public class ContaBancaria {
    int numeroConta;
    double saldo;
    String titular;

    public ContaBancaria(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
    
}