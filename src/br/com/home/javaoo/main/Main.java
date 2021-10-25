package br.com.home.javaoo.main;

import br.com.home.javaoo.classes.Carro;
import br.com.home.javaoo.classes.Moto;
import br.com.home.javaoo.classes.Veiculo;
import br.com.home.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.home.javaoo.excecoes.ChassiInvalidoException;

public class Main {

    public static void main(String[] args) {
        try {
            //principio da subst de Liskov -- Polimorfismo
            Veiculo corsa = new Carro("Corsa", "GM");
            corsa.setChassi("ABCDE");
//            ((Carro)corsa).setQuatidadePortas(4);
            System.out.println(corsa.getNome());
            System.out.println(corsa.getQuantidadeCombustivel());
            System.out.println(corsa.getQuantidadeRodas());
            System.out.println(String.format("O veiculo %s esta ligado ? %b", corsa.getNome(), corsa.isLigado()));
            corsa.abastecer(10);
            corsa.ligar();
            corsa.preparar();
            corsa.acelerar();
            System.out.println(String.format("Velocidade atual do veiculo %f", corsa.getVelocidade()));
            corsa.frear();
            System.out.println(String.format("Velocidade atual do veiculo %f", corsa.getVelocidade()));
//            corsa.abastecer(10);
        }catch (AbastecimentoVeiculoLigadoException e) {
            System.out.println("** Voce nao pode abastecer um veiculo enquanto ele estiver ligado.");
        }catch (ChassiInvalidoException e) {
            System.out.println("** O chassi e invalido: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("** Ocorreu um error: " + e.getMessage());
        }
    }
}
