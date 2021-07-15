package AtividadesSemana3.dia13;

public class Deposito {

    private float valorDoDeposito;
    private float saldo;

    public Deposito(float valorDoDeposito, float saldo) {
        this.valorDoDeposito = valorDoDeposito;
        this.saldo = saldo;
    }

    public void depositarValor() {
        this.setSaldo(getSaldo() + this.valorDoDeposito);
        System.out.println(getSaldo());
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
