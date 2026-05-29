package aula4;

public class ex3MaiorNumero {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite n1: ");
        float n1 = scanner.nextFloat();

        System.out.println("Digite n2: ");
        float n2 = scanner.nextFloat();

        float maior = 0;

        scanner.close();
        if (n1 > n2) {
            maior = n1;
        } else {
            maior = n2;
        }
        System.out.println("O maior número é: " + maior);
    }
}
