package AtividadesSemana1.dia4;
/**
 * Tech Bank Share RH
 * Rafaela Ferreira
 * 01/07/2021
 */

import java.util.Arrays;
import java.util.Scanner;

public class ExerciciosDia4 {

    public static void main(String[] args) {
        exercicioRepeticao2();
    }

    public static void exercicioRepeticao1() {
        /*
         * Construa um algoritmo que leia 10 valores inteiros e positivos e:
         * Encontre o maior valor
         * Encontre o menor valor
         * Calcule a média dos números lidos.
         */
        Scanner entrada = new Scanner(System.in);
        int num[] = new int[4];
        float soma = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o número: ");
            num[i] = entrada.nextInt();
            soma += num[i];
        }

        Arrays.sort(num);

        System.out.println("----------- RESULTADO -----------");
        System.out.printf("Maior número digitado: %d \n", num[num.length - 1]);
        System.out.printf("Menor número digitado: %d \n", num[0]);
        System.out.printf("Média = %.2f", soma / num.length);

        entrada.close();
    }

    public static void exercicioRepeticao2() {
        /* Exercicio 2
         * Construa um algoritmo usando uma estrutura de repetição que calcule o fatorial de um número.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int num = entrada.nextInt();
        double aux = num;

        while (num > 1) {
            aux = aux * (num - 1);
            num--;
        }

        System.out.print("Resultado do fatorial: " + aux);

        entrada.close();
    }
}
