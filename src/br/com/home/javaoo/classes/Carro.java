package br.com.home.javaoo.classes;

public final class Carro extends Veiculo {

    private int quatidadePortas;

    public int getQuatidadePortas() {
        return quatidadePortas;
    }

    public void setQuatidadePortas(int quatidadePortas) {
        this.quatidadePortas = quatidadePortas;
    }

    public Carro() {
        this.quantidadeRodas = 4;
    }

    @Override
    public void preparar() {
        System.out.println("Colocar o cinto de seguranca!");
    }

    public Carro(String nome, String marca) {
        this.quantidadeRodas = 4;
        this.setNome(nome);
        this.setMarca(marca);

    }

    public Carro(String nome, String marca, String chassi) {

    }

}
