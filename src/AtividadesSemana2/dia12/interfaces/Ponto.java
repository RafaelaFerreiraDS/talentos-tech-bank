package AtividadesSemana2.dia12.interfaces;

public class Ponto implements FormaGeometrica {

    private double coordX;

    private double coordY;

    public Ponto(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    @Override
    public String forma() {
        return "Ponto: (" + coordX + ", " + coordY + ")";
    }

    @Override
    public void mostrar() {

    }


}
