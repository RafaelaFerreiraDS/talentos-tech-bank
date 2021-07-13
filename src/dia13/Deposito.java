package dia13;

public class Deposito {

    private float valorDoDeposito;
    private float saldo;

    public Deposito(float valorDoDeposito, float saldo) {
        this.valorDoDeposito = valorDoDeposito;
        this.saldo = saldo;
    }

    public void depositar(){
        this.setSaldo(getSaldo() + valorDoDeposito);
    }

    public float getValorDoDeposito() {
        return valorDoDeposito;
    }

    public void setValorDoDeposito(float valorDoDeposito) {
        this.valorDoDeposito = valorDoDeposito;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
