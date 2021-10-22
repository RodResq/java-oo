package br.com.home.javaoo.classes;

public class Veiculo {
    public String nome;
    public String marca;
    public String chassi;
    public int quantidadeRodas;

    public void ligar() {
        System.out.println("O veiculo ligou");
    }

    public void desligar() {
        System.out.println("O veiculo desligou");
    }

    public float abastecer(float litros) {
        return 0;
    }

}
