package br.com.home.javaoo.classes;

import br.com.home.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.home.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.home.javaoo.excecoes.ChassiInvalidoException;
import br.com.home.javaoo.excecoes.FrenagemVeiculoLigadoException;

public abstract class Veiculo {
    private String nome;
    private String marca;
    private String chassi;
    protected int quantidadeRodas;
    private float quantidadeCombustivel;
    protected Boolean ligado;
    protected float velocidade;

    public Veiculo() {
        this.ligado = false;
        this.velocidade = 0;
    }

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

    public Boolean isLigado() {
        return ligado;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public final void ligar() {
        this.ligado = true;
        this.velocidade = 0;
        System.out.println("O veiculo ligou");
    }

    public final void desligar() {
        this.ligado = false;
        this.velocidade = 0;
        System.out.println("O veiculo desligou");
    }

    public final void abastecer(float litros) throws AbastecimentoVeiculoLigadoException {
        if(!this.ligado) {
            quantidadeCombustivel += litros;
        }else {
            throw new AbastecimentoVeiculoLigadoException();
        }
    }

    public void acelerar() throws AceleracaoVeiculoLigadoException {
        if(this.ligado) {
            this.velocidade += 10;
        }else {
            throw new AceleracaoVeiculoLigadoException();
        }
    }

    public void frear() throws FrenagemVeiculoLigadoException {
        if (this.ligado) {
            this.velocidade -= 10;
        }else {
            throw new FrenagemVeiculoLigadoException();
        }
    }

    public abstract void preparar();

}
