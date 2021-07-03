package AtividadesSemana1.dia5;
/**
 * Tech Bank Share RH;
 * Rafaela Ferreira;
 * 02/07/2021
 */

import java.util.Scanner;

public class ExerciciosDia5 {

    public static void exercicio1() {
        /*
         * Dois números são inseridos pelo teclado. Escreva um programa para encontrar o
         * valor de um número elevado à potência de outro. (Não use o método Math.pow integrado Java)
         */
        Scanner entrada = new Scanner(System.in);

        double x = 1;

        System.out.println("Digite o número que será elevado: ");
        double num = entrada.nextDouble();

        System.out.println("Digite a potência: ");
        double pot = entrada.nextDouble();

        for (int i = 1; i <= pot; i++) {
            x = x * num;
        }

        System.out.println("O valor da potência é: ");
        entrada.close();
    }

    public static void exercicio2() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("**********");
        }

        System.out.println(" ");
    }

    public static void exercicio2II() {
        int linha = 5;

        for (int i = 1; i <= linha; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.printf("\n");
        }
    }

    public static void exercicio2III() {
        int linha = 5;

        for (int i = 1; i <= linha; i++) {
            int k = linha - i;

            while (k > 0) {
                System.out.print("  ");
                k--;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.printf("\n");
        }
    }

    public static void exercicio2IV() {
        int linha = 5;

        for (int i = 1; i <= linha; i++) {
            int k = linha - i;

            while (k > 0) {
                System.out.print("  ");
                k--;
            }

            for (int j = 0; j != 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.printf("\n");
        }
    }

    public static void exercicio2V() {
        int linha = 5;

        for (int i = 1; i <= linha; i++) {

            int k = linha - i;

            while (k > 0) {
                System.out.print("  ");
                k--;
            }

            int j = 0;
            while (j != 2 * i - 1) {
                System.out.printf("%d ", i);
                j++;
            }

            System.out.print("\n");
        }
    }

    public static void exercicio2VI(){
        int linha = 5;

        for (int i = 1; i <= linha; i++) {

            int k = linha - i;

            while (k > 0) {
                System.out.print("  ");
                k--;
            }

            int j = 0;
            int l = i;
            boolean estaDecrementando = true;
            while (j != 2 * i - 1) {

                System.out.printf("%d ", l);
                j++;
                if (l > 1 && estaDecrementando) {
                    l--;
                } else {
                    estaDecrementando = false;
                    l++;
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        exercicio2VI();
    }

}
