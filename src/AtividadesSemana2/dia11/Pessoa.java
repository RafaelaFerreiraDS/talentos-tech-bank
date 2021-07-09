package AtividadesSemana2.dia11;

import java.time.Year;

public class Pessoa {
    private String nome;
    private Float altura;
    private Integer anoNasc;

    public Pessoa(String nome, Float altura, Integer anoNasc) { //construtor
        this.setNome(nome);
        this.setAltura(altura);
        this.setAnoNasc(anoNasc);
    }

    public void idadeAnoAtual() {
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - this.anoNasc;
        if (idade > 0) {
            System.out.printf("%s terá %d anos em %d.", this.nome, idade, anoAtual);
        } else if (idade == 0) {
            System.out.printf("%s ainda não fez aniversário.", this.nome, idade, anoAtual);
        } else {
            System.out.println("Ano de nascimento inválido.");
        }
    }

    @Override
    public String toString() {
        return "Dados {" +
                "nome='" + nome + '\'' +
                ", altura=" + altura + " m" +
                ", anoNasc=" + anoNasc +
                '}';
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Float getAltura() {

        return altura;
    }

    public void setAltura(Float altura) {

        this.altura = altura;
    }

    public Integer getAnoNasc() {

        return anoNasc;
    }

    public void setAnoNasc(Integer anoNasc) {

        this.anoNasc = anoNasc;
    }
}
