package aula7_att3;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2500.00, 10);
        produto1.exibirInformacoes();

        System.out.println("\nAdicionando 5 unidades ao estoque...");
        produto1.adicionarEstoque(5);
        produto1.exibirInformacoes();

        System.out.println("\nRemovendo 3 unidades do estoque...");
        produto1.removerEstoque(3);
        produto1.exibirInformacoes();

        System.out.println("\nTentando remover 20 unidades do estoque...");
        produto1.removerEstoque(20);
        produto1.exibirInformacoes();
    }
}
