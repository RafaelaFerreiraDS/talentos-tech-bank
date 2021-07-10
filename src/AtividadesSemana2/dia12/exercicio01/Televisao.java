package AtividadesSemana2.dia12.universidade.Composicao.exercicio01;

public class Televisao {

    private int volume = 15;
    private int canal = 5;


    public void ajustarVolume(Integer volume) {
        if (volume == -1) {
            this.diminuirVolume();
        } else if (volume == 1) {
            this.aumentarVolume();
        }
    }


    private void aumentarVolume() {
        if (getVolume() <= 100) {
            this.setVolume(getVolume() + 1);
        } else if (volume == 100) {
            System.out.println("Volume está no máximo");
        }
    }

    private void diminuirVolume() {
        if (getVolume() > 0) {
            this.setVolume(getVolume() - 1);
        } else if (getVolume() == 0) {
            System.out.println("Volume está no mínimo");
        }
    }

    public void consultarVolume() {
        this.getVolume();
    }

    public void aumentarCanal() {
        if (this.canal == 100) {
            this.canal = 1;
        } else {
            this.canal++;
        }
    }

    public void diminuirCanal() {
        if (this.canal == 1) {
            this.canal = 100;
        } else {
            this.canal--;
        }
    }

    public void consultarCanal() {
        this.getCanal();
    }

    public void trocarCanal(int novoCanal) {
        if (canal < 1 || canal > 100) {
            return;
        }
        this.setCanal(novoCanal);
    }

    public void informacoesTV() {
        System.out.println("Volume: " + getVolume());
        System.out.println("Canal: " + getCanal());
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
}
