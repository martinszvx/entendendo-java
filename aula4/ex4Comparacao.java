package aula4;

public class ex4Comparacao {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite n1: ");
        float n1 = scanner.nextFloat();

        System.out.println("Digite n2: ");
        float n2 = scanner.nextFloat();

        scanner.close();
        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
            System.out.println(n1 + " e " + n2 + " são diferentes");
        } else if (n1 < n2) {
            System.out.println(n2 + " é maior que " + n1);
            System.out.println(n1 + " e " + n2 + " são diferentes");
        } else {
            System.out.println(n1 + " e " + n2 + " são iguais");
        }
    }
}
