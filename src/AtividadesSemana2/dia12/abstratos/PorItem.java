package AtividadesSemana2.dia12.abstratos;

public final class PorItem extends Empregado {

    private double producao; // salario por producao
    private int quantidade;

    public PorItem(String nome, double producao, int quantidade) {
        super(nome);
        this.producao = producao;
        this.quantidade = quantidade;
    }

    @Override
    public double ganha() {
        return producao * quantidade;
    }
}
