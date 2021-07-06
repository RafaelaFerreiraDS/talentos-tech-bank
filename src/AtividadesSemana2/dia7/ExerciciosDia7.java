package AtividadesSemana2.dia7;

/**
 * Tech Bank Share RH;
 * Rafaela Ferreira;
 * 05/07/2021
 */

import java.util.*;

public class ExerciciosDia7 {
    public static void main(String[] args) {
        exercicio5();

    }

    public static void exercicio1() {
        /* Exercicio 01:
         * Escreva um algoritmo que leia números insira em um array e após mostre os
         * números informados na tela.
         */
        Scanner entrada = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        // preenchimento da lista
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número para incluir na lista: ");
            int num = entrada.nextInt();
            lista.add(num);
        }

        System.out.println("\nNúmeros digitados: ");
        System.out.println(lista);

        entrada.close();
    }

    public static void exercicio2() {
        /*Exercicio 3

         */
        int contador = 0;
        Scanner entrada = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        // preenchimento da lista
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número para incluir na lista: ");
            int num = entrada.nextInt();
            lista.add(num);
            if (num < 0) {
                contador++;
            }
        }

        System.out.println("\nNúmeros digitados: ");
        System.out.println(lista);

        System.out.println("Números negativos digitados: " + contador);

        entrada.close();
    }

    public static void exercicio2Array() {

        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[5];

        int contadorArray = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número para incluir na lista: ");
            vetor[i] = entrada.nextInt();
            if (vetor[i] < 0) {
                contadorArray++;
            }
        }

        System.out.println("Quantidade de números negativos digitados: " + contadorArray);

        entrada.close();
    }

    public static void exercicio3List() {
        /*Exercicio 3

         */
        int contador = 0;
        Scanner entrada = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        // preenchimento da lista
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número para incluir na lista: ");
            int num = entrada.nextInt();
            lista.add(num);
            if (num % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Números pares digitados: " + contador);

        entrada.close();
    }

    public static void exercicio3Array() {
        /*Exercicio 3

         */
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[5];

        int contadorArray = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número para incluir na lista: ");
            vetor[i] = entrada.nextInt();
            if (vetor[i] % 2 == 0) {
                contadorArray++;
            }
        }

        System.out.println("Quantidade de números negativos digitados: " + contadorArray);

        entrada.close();
    }

    public static void exercicio4List() {
        /*Exercicio 4

         */
        Scanner entrada = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        // preenchimento da lista
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número para incluir na lista: ");
            int num = entrada.nextInt();
            lista.add(num);
        }

        System.out.println("Maior valor digitado " + Collections.max(lista));

        entrada.close();

    }

    public static void exercicio4Array() {
        /*Exercicio 4

         */
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número para incluir na lista: ");
            vetor[i] = entrada.nextInt();
        }

        Arrays.sort(vetor);
        System.out.println("Maior número digitado: " + vetor[vetor.length-1]);

        entrada.close();

    }

    public static void exercicio5() {
        /*Exercicio 5

         */
        Scanner entrada = new Scanner(System.in);

        char vetor[] = "banana".toCharArray();

        String letra = entrada.next();

        for (int i = 0; i< vetor.length; i++){
            if( vetor[i].e)
        }





    }
}
