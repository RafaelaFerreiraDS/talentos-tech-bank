package AtividadesSemana2.dia12.interfaces;

public class Circulo implements FormaGeometrica {

    private Ponto raio;
    private Ponto centro;


    public Circulo(Ponto raio, Ponto centro) {
        this.raio = raio;
        this.centro = centro;
    }

    @Override
    public String forma() {
        return "Circulo";
    }

    @Override
    public void mostrar() {

    }
}
