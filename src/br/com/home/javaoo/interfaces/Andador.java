package br.com.home.javaoo.interfaces;

import br.com.home.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.home.javaoo.excecoes.FrenagemVeiculoLigadoException;

public interface Andador {

    void acelerar() throws AceleracaoVeiculoLigadoException;

    void frear() throws FrenagemVeiculoLigadoException;
}
