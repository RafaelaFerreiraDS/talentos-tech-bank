package dia13;

public class Conta {

    private String nome;
    private float saldo;
    private String tipoConta;
    private int numConta;
    private float valorParaDepositar;
    private boolean statusContaAberta;

    public Conta(String nome, float saldo, String tipoConta, int numConta, float valorParaDepositar, boolean statusContaAberta) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
        this.numConta = numConta;
        this.valorParaDepositar = valorParaDepositar;
        this.statusContaAberta = statusContaAberta;
    }

    public void listarExtrato() {


        System.out.println("Saldo: " + getSaldo());

    }

    public void realizarSaque(float valorSaque) {
        if (this.statusContaAberta) { // validacao se a conta está aberta no Coders Bank
            if (tipoConta.equals("Conta Corrente")) { // validacao do tipo de conta corrente
                if (0 < valorSaque && valorSaque <= getSaldo()) { // validação do valor disponivel na conta
                    setSaldo(getSaldo() - valorSaque);
                } else if (valorSaque > getSaldo()) { // cheque especial
                    setSaldo(getSaldo() - valorSaque);
                    System.out.println("Você entrou no cheque especial. Valor: " + Math.abs(getSaldo()));
                }
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
