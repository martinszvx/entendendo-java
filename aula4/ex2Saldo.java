package aula4;

public class ex2Saldo {
    public static void main(String[] args) {
        System.out.println("Digite seu saldo: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        float saldo = scanner.nextFloat();
        System.out.println("Seu saldo é: " + saldo);
        scanner.close();

        saldo = saldo * 1.01f;
        System.out.println("Saldo atualizado: " + saldo);
    }
}
