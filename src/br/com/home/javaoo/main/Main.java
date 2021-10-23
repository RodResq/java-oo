package br.com.home.javaoo.main;

import br.com.home.javaoo.classes.Carro;

public class Main {

    public static void main(String[] args) {
        try {
            Carro corsa = new Carro("Corsa", "GM");
            corsa.setChassi("ABCDE");
            corsa.abastecer(10);
            System.out.println(corsa.getNome());
            System.out.println(corsa.getQuantidadeCombustivel());
            System.out.println(corsa.getQuantidadeRodas());
            System.out.println(String.format("O veiculo %s esta ligado ? %b", corsa.getNome(), corsa.isLigado()));
            corsa.ligar();

            Carro celta = new Carro();
            celta.ligar();
        } catch (Exception e) {
            System.out.println("** Ocorreu um error: " + e.getMessage());
        }
    }
}
