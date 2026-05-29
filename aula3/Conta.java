package aula3;

public class Conta {
    int numero;
    String titular;
    double saldo;
    double limite;

    void sacar(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.numero = 12345;
        conta1.titular = "Lucas";
        conta1.saldo = 1000.00;
        conta1.limite = 500.00;

        System.out.println("Número da conta: " + conta1.numero);
        System.out.println("Titular: " + conta1.titular);
        System.out.println("Saldo: " + conta1.saldo);
        System.out.println("Limite: " + conta1.limite);

        conta1.sacar(200.00);
        System.out.println("Saldo após saque: " + conta1.saldo);

        System.err.println("-----------------------------");

        Conta conta2 = new Conta();
        conta2.numero = 54321;
        conta2.titular = "Maria";
        conta2.saldo = 2000.00; 
        conta2.limite = 1000.00;

        System.out.println("Número da conta: " + conta2.numero);
        System.out.println("Titular: " + conta2.titular);
        System.out.println("Saldo: " + conta2.saldo);
        System.out.println("Limite: " + conta2.limite);

        conta2.sacar(500.00);
        System.out.println("Saldo após saque: " + conta2.saldo);
    }

    Conta(){
        System.out.println("Construtor da classe conta foi chamado!");
    }

}
