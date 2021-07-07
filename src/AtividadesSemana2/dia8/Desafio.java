package AtividadesSemana2.dia8;

/**
 * Talentos Tech Bank Share RH
 * Rafaela Ferreira
 * Desafio extra
 * 07/07/2021
 */

public class Desafio {
    public static void main(String[] args) {
        /* Exercicio extra
         * Dado um array de números inteiros com valores negativos e positivos,
         * encontro o número mais próximo de zero. Se ouver valores como 2 e -2,
         * considere o número positivo.
         */
        int vetor[] = {-4, 6, 9, 23, -5, 1, 65, 5, -15, 89, 4, -18, -1};

        int numMaisPerto = vetor[0];

        for (int i : vetor) {
            if (Math.abs(numMaisPerto) > Math.abs(i)) {
                numMaisPerto = i;
            } else if (Math.abs(numMaisPerto) == Math.abs(i) && numMaisPerto < 0) {
                numMaisPerto = i;
            }
        }

        System.out.printf("Número mais perto de zero: %d",numMaisPerto);
    }
}
