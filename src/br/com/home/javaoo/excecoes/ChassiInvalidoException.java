package br.com.home.javaoo.excecoes;

public class ChassiInvalidoException extends Exception {

    public ChassiInvalidoException(String chassi) {
        super(String.format("Esse chassi e invalido [%s]", chassi));
    }
}
