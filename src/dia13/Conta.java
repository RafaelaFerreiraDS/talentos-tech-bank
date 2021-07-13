package dia13;

public class Conta {

    private String nome;
    private float saldo;
    private String tipoConta;
    private int numConta;
    private float valorParaDepositar;
    private boolean statusContaAberta;

    public Conta(String nome, float saldoInicial, String tipoConta, int numConta, boolean statusContaAberta) {
        this.nome = nome;
        this.saldo = saldoInicial;
        this.tipoConta = tipoConta;
        this.numConta = numConta;
        this.statusContaAberta = statusContaAberta;
    }

    public void listarExtrato() {

    }

    public void realizarSaque(float valorSaque) {
        if (this.statusContaAberta) { // validacao se a conta está aberta no Coders Bank
            if (tipoConta.equals("Conta Corrente")) { // validacao do tipo de conta corrente
                if (0 < valorSaque && valorSaque <= getSaldo()) { // validação do valor disponivel na conta
                    setSaldo(getSaldo() - valorSaque);
                } // inserir cheque especial
            } else if (tipoConta.equals("Conta Poupança")) { // validacao conta poupanca
                if (0 < valorSaque && valorSaque <= getSaldo()) {
                    setSaldo(getSaldo() - valorSaque);
                } else {
                    System.out.println("Saldo indisponível");
                }
            } else {
                System.out.println("Tipo de conta inválida");
            }
        } else { // se a conta nao estiver aberta
            System.out.println("Operação indisponível");
        }
    }

    public void depositar() {
        if (this.statusContaAberta) {
            setSaldo(getSaldo() + valorParaDepositar);
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
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
