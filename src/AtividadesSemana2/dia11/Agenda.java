package AtividadesSemana2.dia11;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Pessoa> contato = new ArrayList<>();

    public void armazenarContato(String nome, Float altura, Integer anoNasc) {
        Pessoa novoContato = new Pessoa(nome, altura, anoNasc);

        if (contato.size() < 10) {
            this.contato.add(novoContato);
        } else {
            System.out.println("Agenda lotada...");
        }
    }

    public void removerContato(String nome) {
        Integer index = buscarPessoa(nome);



    }

    public Integer buscarPessoa(String nome) {

        for (int i = 0; i < contato.size(); i++) {
            if (contato.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return null;
    }

    public void imprimirAgenda() {

        for(Pessoa pessoa : contato){
            System.out.println(pessoa);
        }
    }

    public void imprimirPessoa(int index) {
        if (contato.size() > index) {
            System.out.printf("\nInformações do contato na posição %d: \n %s", index, contato.get(index));
        } else {
            System.out.printf("\nNão há contato arquivado na posição informada\n");
        }
    }


    public List<Pessoa> getContato() {
        return contato;
    }

    public void setContato(List<Pessoa> contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "contato=" + contato +
                '}';
    }
}
