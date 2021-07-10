package AtividadesSemana2.dia12.exercicio01;

public class ControleRemoto {

    private Televisao televisao;

    public void aumentarVolume() {
        this.televisao.ajustarVolume(1);
    }

    public void diminuirVolume() {
        this.televisao.ajustarVolume(-1);
    }

    public void consultarVolume() {
        this.televisao.consultarVolume();
    }

    public void aumentarCanal() {
        this.televisao.aumentarCanal();
    }

    public void diminuirCanal() {
        this.televisao.diminuirCanal();
    }

    public void consultarCanal() {
        this.televisao.consultarCanal();
    }

    public void trocarCanal(int novoCanal) {
        this.televisao.trocarCanal(novoCanal);
    }

    public void informacoesTV() {
        this.televisao.informacoesTV();
    }

    public Televisao getTelevisao() {
        return televisao;
    }

    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }

    public static void main(String[] args) {

        Televisao samgung = new Televisao();

        ControleRemoto controleRemoto = new ControleRemoto();

        controleRemoto.setTelevisao(samgung);

        controleRemoto.aumentarVolume();
        controleRemoto.aumentarCanal();

        controleRemoto.aumentarCanal();

        controleRemoto.informacoesTV();

        controleRemoto.trocarCanal(99);

        controleRemoto.aumentarCanal();
        controleRemoto.informacoesTV();

        controleRemoto.aumentarCanal();
        controleRemoto.informacoesTV();



    }
}
