package aula1;
public class Celular2 {
     public static void main(String[] args) {
        Celular Iphone = new Celular();
        Celular samsung = new Celular();
        
        samsung.modelo = "Samsung A54";
        samsung.cor = "Preto";
        samsung.formato = "Retangular";
        samsung.TipoMaterial = "Plástico";

        samsung.largura = 7.7;
        samsung.comprimento = 15.8;
        samsung.espessura = 0.82;

        samsung.ID = 1;

//==============================================
        
        Iphone.modelo = "Iphone 14 Pro Max";
        Iphone.cor = "Verde";
        Iphone.formato = "Retangular";
        Iphone.TipoMaterial = "Aluminio";

        Iphone.largura = 7.15;
        Iphone.comprimento = 14.67;
        Iphone.espessura = 0.74;

        Iphone.ID = 2;        

//==============================================

        samsung.ligar();
        System.out.println(" ");
        samsung.statusCelular();
        System.out.println(" ");
        samsung.desligar();
        samsung.separacao();

        Iphone.ligar();
        System.out.println(" ");
        Iphone.statusCelular();
        System.out.println(" ");
        Iphone.desligar();
        Iphone.separacao();
    }

}
