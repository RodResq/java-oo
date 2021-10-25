package br.com.home.javaoo.classes;

import br.com.home.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.home.javaoo.excecoes.FrenagemVeiculoLigadoException;

public final class Moto extends Veiculo{

    public Moto() {
        this.quantidadeRodas = 2;
    }

    public Moto(String nome, String marca) {
        this.quantidadeRodas = 2;
        this.setNome(nome);
        this.setMarca(marca);
    }

    @Override
    public void acelerar() throws AceleracaoVeiculoLigadoException {
        if(this.ligado) {
            this.velocidade += 3;
        }else {
            throw new AceleracaoVeiculoLigadoException();
        }
    }

    @Override
    public void frear() throws FrenagemVeiculoLigadoException {
        if (this.ligado) {
            this.velocidade -= 3;
        }else {
            throw new FrenagemVeiculoLigadoException();
        }
    }

}
