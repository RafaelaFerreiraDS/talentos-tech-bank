package dia6;

import java.util.Scanner;

public class ExerciciosDia6 {

    public static void exercicio01() {
        /* Exercicio 1:
         * Dado um array com 20 números, imprima seus valores de trás para frente
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = entrada.nextInt();

        int num[] = new int[tamanho];

        System.out.println("\nOrdem inicial:");

        int j = 0;
        while (j < num.length) {
            num[j] = j + 1;

            System.out.printf("%d ", num[j]);
            j++;
        }

        System.out.println("\n\nOrdem decrescente");

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.printf("%d ", num[i]);
        }
        entrada.close();
    }

    public static void exercicio02() {
        /* Exercicio 01:
         * Ordenacao crescente de vetor
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite quantos números deseja ordenar: ");
        int tamanho = entrada.nextInt();

        int vetor[] = new int[tamanho];
        int aux;

        int a =0;
        while (a < vetor.length) {
            System.out.print("Digite o " + (a + 1) + "º número: ");
            vetor[a] = entrada.nextInt();
            a++;
        }

        for (int i = 1; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        System.out.println("\n Números ordenados: ");
        for (int k = 0; k < vetor.length; k++) {
            System.out.printf("%d ", vetor[k]);
        }
        entrada.close();
    }

    public static void main(String[] args) {

        exercicio02();

    }
}
