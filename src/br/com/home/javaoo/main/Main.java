package br.com.home.javaoo.main;

import br.com.home.javaoo.classes.Carro;
import br.com.home.javaoo.classes.Moto;

public class Main {

    public static void main(String[] args) {
        try {
            Carro corsa = new Carro("Corsa", "GM");
            corsa.setChassi("ABCDE");
            corsa.abastecer(10);
            corsa.setQuatidadePortas(4);
            System.out.println(corsa.getNome());
            System.out.println("Quantidade de  Portas: " + corsa.getQuatidadePortas());
            System.out.println(corsa.getQuantidadeCombustivel());
            System.out.println(corsa.getQuantidadeRodas());
            System.out.println(String.format("O veiculo %s esta ligado ? %b", corsa.getNome(), corsa.isLigado()));
            corsa.ligar();

           Moto fazer = new Moto();
           fazer.setNome("fazer");

        } catch (Exception e) {
            System.out.println("** Ocorreu um error: " + e.getMessage());
        }
    }
}
