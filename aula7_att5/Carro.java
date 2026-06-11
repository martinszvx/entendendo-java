package aula7_att5;

public class Carro {
    String marca;
    String modelo;
    int ano;
    double velocidadeAtual;
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;
    }
    void acelerar(double incremento) {
        velocidadeAtual += incremento;
        System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h");
    }
    void frear(double decremento) {
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
        System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h");
    }
    void exibirStatus() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}
