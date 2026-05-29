package aula4;

public class ex5AntecessorSucessor {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite um numero: ");
        float n1 = scanner.nextFloat();

        scanner.close();
        System.out.println("O numero digitado é: " + n1);
        System.out.println("Seu Sucessor é: " + (n1 + 1));
        System.out.println("Seu Antecessor é: " + (n1 - 1));

    }
}
