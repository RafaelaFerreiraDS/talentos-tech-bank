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
        /* Exercicio 2
         * Escreva um algoritmo que leia números, insira em um array e após mostre a
         * quantidade de números negativos.
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
        /* Exercicio 2
         * Escreva um algoritmo que leia números, insira em um array e após mostre a
         * quantidade de números negativos.
         */
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
        /* Exercicio 3
         * Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.
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
        /* Exercicio 3
         * Escreva um algoritmo que leia números, insira em um array e após mostre a quantidade de números pares.
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
        /* Exercicio 4
         * Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.
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
        /* Exercicio 4
         * Escreva um algoritmo que leia números, insira em um array e após mostre o maior valor.
         */
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número para incluir na lista: ");
            vetor[i] = entrada.nextInt();
        }

        Arrays.sort(vetor);
        System.out.println("Maior número digitado: " + vetor[vetor.length - 1]);

        entrada.close();

    }

    public static void exercicio5() {
        /* Exercicio 5
         * Escreva um algoritmo que simula um jogo da forca simples. o usuario precisara adivinhar
         * uma palavra chutando cada letra em no máximo 10 chutes, caso o usuario acerte a letra o
         * jogo dirá que ele acertou, caso tenha errado, o numero de tentativas vai diminuindo.
         * Caso o numero de tentativas chegue a 0 o usuário perde.
         */

        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        System.out.println("jogador 1, escolha a palavra que deverá ser adivinhada: ");
        String palavraParaAdivinharInput = entrada.next();

        System.out.println("Jogador 2, de uma dica sobre a palavra a ser adivinhada: ");
        String dicaDaPalavra = entrada.next();

        int tamanhoDaPalavra = palavraParaAdivinharInput.trim().length();
        int maxChute = 10;

        char[] palavraParaAdivinhar = palavraParaAdivinharInput.toCharArray();

        Boolean[] letrasCertas = new Boolean[palavraParaAdivinhar.length];
        List<Boolean> listaLetrasCertas = new ArrayList<>();

        for (char x : palavraParaAdivinhar) {
            listaLetrasCertas.add(false);
        }

        System.out.println("Vez do jogador 2:");

        while (maxChute > 0 && Arrays.asList(letrasCertas).contains(false)) {
            System.out.println("jogador 2, chute uma letra");
            char chute = entrada.next().charAt(0);

            boolean errouChute = true;

            for (int i = 0; i < palavraParaAdivinhar.length; i++) {
                if (chute == palavraParaAdivinhar[i]) {
                    letrasCertas[i] = true;
                    errouChute = false;
                }
            }

            if (errouChute) {
                maxChute--;
                System.out.printf("Agora voce só tem %s chutes\n", maxChute);
            }

            for (int i = 0; i < palavraParaAdivinhar.length; i++) {
                if (listaLetrasCertas.get(i)) {
                    System.out.printf(" %s ", palavraParaAdivinhar[i]);
                } else {
                    System.out.println(" - ");
                }

            }
        }

        if (!listaLetrasCertas.contains(false)) {
            System.out.println("Jogador 2 ganhou o jogo");
        } else {
            System.out.println("jogador 1 ganhou");
        }
        entrada.close();
    }
}
