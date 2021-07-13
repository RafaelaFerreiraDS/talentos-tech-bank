package dia13;

public class Conta {

    private String nome;
    private float saldoInicial;
    private String tipoConta;
    private int numConta;
    private boolean statusContaAberta;

    public Conta(String nome, float saldoInicial, String tipoConta, int numConta, boolean statusContaAberta) {
        this.nome = nome;
        this.saldoInicial = saldoInicial;
        this.tipoConta = tipoConta;
        this.numConta = numConta;
        this.statusContaAberta = statusContaAberta;
    }

    public void listarExtrato() {

    }

    public void realizarSaque() {

    }

    public void depositar() {
        if (this.isStatusContaAberta()) {
            this.getSaldoInicial() +
        }


    }

    public void adicionarChequeEspecial() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean isStatusContaAberta() {
        return statusContaAberta;
    }

    public void setStatusContaAberta(boolean statusContaAberta) {
        this.statusContaAberta = statusContaAberta;
    }
}
