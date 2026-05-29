package aula4;

public class ex1MediaAritmetica {
    
    public static void main(String[] args) {
        float n1 = 4;
        float n2 = 5;
        float n3 = 6;

        float media1 = (n1 + n2 + n3) / 3;
        System.out.println("Média1: " + media1);

        float n4 = 7;
        float n5 = 8; 
        float n6 = 9;

        float media2 = (n4 + n5 + n6) / 3;
        System.out.println("Média2: " + media2);

        float mediaFinal = (media1 + media2) / 2;
        System.out.println("Média das Médias: " + mediaFinal);

    }
}