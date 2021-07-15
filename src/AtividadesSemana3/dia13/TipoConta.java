package AtividadesSemana3.dia13;

public class TipoConta {

    private String tipo;
    private boolean statusContaAberta = false;
    private float limiteChequeEspecial;


    public TipoConta(String tipo, boolean statusContaAberta, float limiteChequeEspecial) {
        this.tipo = tipo;
        this.statusContaAberta = statusContaAberta;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isStatusContaAberta() {
        return statusContaAberta;
    }

    public void setStatusContaAberta(boolean statusContaAberta) {
        this.statusContaAberta = statusContaAberta;
    }

    public float getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(float limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
