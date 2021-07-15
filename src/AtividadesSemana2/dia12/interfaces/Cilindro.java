package AtividadesSemana2.dia12.interfaces;

public class Cilindro implements FormaGeometrica {

    private Circulo base;

    private double altura;

    public Cilindro(Circulo base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String forma() {
        return "Cilindro";
    }

    @Override
    public void mostrar() {

    }
}
