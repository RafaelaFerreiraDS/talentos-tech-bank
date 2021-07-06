package AtividadesSemana2.dia7;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("ARRAY");

        int vetor[] = {1, 2, 3, 4, 5};

        Arrays.sort(vetor);

        System.out.println(vetor);

        System.out.println("\nLISTA");

        List<Integer> lista1 = new ArrayList<>(Arrays.asList(32, 54, 67, 76));
        System.out.println(lista1);
        lista1.add(4); // incluir valor ao final da lista
        lista1.remove(1); // remove valor no indice indicado

        System.out.println(lista1);


        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(43);
        lista.add(36);
        System.out.println(lista);
        lista.remove(2);

        System.out.println(lista);


        List<Integer> lista2 = new ArrayList<>();

        for (int v : vetor) { // adicionando valores do vetor na lista
            lista2.add(v);
        }

        System.out.println("Lista convertida");
        System.out.println(lista2);

        /*
        System.out.println("lista com for");

        for (int j = 0 ; j < lista2.size(); j++){
            System.out.println(lista.get(j));
        }
         */

        /*
        int a = 1;
        Integer b = a;
        Integer c = 1;
        int d = c;
         */



    }
}
