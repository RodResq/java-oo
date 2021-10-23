package br.com.home.javaoo.main;

import br.com.home.javaoo.classes.Veiculo;

public class Main {

    public static void main(String[] args) {
        try {
            Veiculo corsa = new Veiculo();
            corsa.setMarca("GM");
            corsa.setNome("Corsa");
            corsa.setChassi("ABCD");
            corsa.abastecer(10);
            System.out.println(corsa.getNome());
            System.out.println(corsa.getQuantidadeCombustivel());
            corsa.ligar();
        } catch (Exception e) {
            System.out.println("** Ocorreu um error: " + e.getMessage());
        }
    }
}
