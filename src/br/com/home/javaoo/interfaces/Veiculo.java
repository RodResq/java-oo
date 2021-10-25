package br.com.home.javaoo.interfaces;

import br.com.home.javaoo.excecoes.AbastecimentoVeiculoLigadoException;

public interface Veiculo {

    void abastecer(float litros) throws AbastecimentoVeiculoLigadoException;

    void preparar();
}
