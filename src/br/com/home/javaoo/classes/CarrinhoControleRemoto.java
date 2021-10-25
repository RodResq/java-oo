package br.com.home.javaoo.classes;

import br.com.home.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.home.javaoo.excecoes.FrenagemVeiculoLigadoException;
import br.com.home.javaoo.interfaces.Andador;
import br.com.home.javaoo.interfaces.Ligador;

public class CarrinhoControleRemoto implements Ligador, Andador {

    @Override
    public void acelerar() throws AceleracaoVeiculoLigadoException {

    }

    @Override
    public void frear() throws FrenagemVeiculoLigadoException {

    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }
}
