package aula1;
public class Celular {
    String modelo;
    String formato;
    String cor;
    protected String TipoMaterial;
    double largura, comprimento, espessura;
    /*prvate*/ int ID = 0; /* por ter esse private, o codigo n ve, é um metodo de segurança, para n ser acessado por outros 
    codigos, só pode ser acessado dentro da propria classe, ou seja, dentro do proprio celular. Tire PRIVATE PARA FUNCIONAR*/

    //==============================

    //LISTA DE MÉTODOS
    
    void ligar(){
        //desenvolvimento da logica
        System.out.println("Celular ligando...");
    }

    void desligar(){
        System.out.println("Celular desligando...");
    }

    void separacao(){
        System.out.println("================================");
    }

    //verificar escopo JAVA 
    
    void statusCelular(){
        System.out.println("DADOS DO CELULAR");

        System.out.println("Modelo: "+modelo);
        System.out.println("formato: "+formato);
        System.out.println("cor: "+cor); 
        System.out.println("TipoMaterial: "+TipoMaterial);
        System.out.println("Largura: "+largura+"cm"); 
        System.out.println("Comprimento: "+comprimento+"cm");
        System.out.println("Espessura: "+espessura); 
        System.out.println("ID:"+ ID);
    }
}

