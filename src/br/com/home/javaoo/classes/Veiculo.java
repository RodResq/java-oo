package br.com.home.javaoo.classes;

public class Veiculo {
    private String nome;
    private String marca;
    private String chassi;
    private int quantidadeRodas;
    private float quantidadeCombustivel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void ligar() {
        System.out.println("O veiculo ligou");
    }

    public void desligar() {
        System.out.println("O veiculo desligou");
    }

    public void abastecer(float litros) {
        quantidadeCombustivel += litros;
    }

}