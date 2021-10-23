package br.com.home.javaoo.classes;

import br.com.home.javaoo.excecoes.ChassiInvalidoException;

public class Veiculo {
    private String nome;
    private String marca;
    private String chassi;
    protected int quantidadeRodas;
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

    public void setChassi(String chassi) throws ChassiInvalidoException {
        if(chassi.length() == 5) {
            this.chassi = chassi;
        } else {
            throw new ChassiInvalidoException(chassi);
        }
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
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
