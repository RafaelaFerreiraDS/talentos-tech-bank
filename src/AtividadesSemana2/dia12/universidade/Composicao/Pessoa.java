package AtividadesSemana2.dia12.universidade.Composicao;

public class Pessoa {

    private String nome;

    private Universidade universidadeQueTrabalha;

    public Pessoa(String nome, Universidade universidadeQueTrabalha) {
        this.nome = nome;
        this.universidadeQueTrabalha = universidadeQueTrabalha;
    }

    public void informarDadosDaPessoa(){
        System.out.println(this.nome);
        this.universidadeQueTrabalha.informarNome();
    }
}
