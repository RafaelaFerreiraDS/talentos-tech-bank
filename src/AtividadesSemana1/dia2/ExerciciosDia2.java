package dia2;
/**
 * Tech Bank Java
 * Rafaela Ferreira
 * 29/06/2021
 */

import java.util.Scanner;

public class ExerciciosDia2 {

    public static void main(String[] args) {
        exercicio04(); // metodo para execucao do exercicio
    }

    public static void exercicio01() { // metodo para "chamar" o exercicio01 na funcao principal
        /* Exercício 1:
         * Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z.
         * A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com
         * que o valor que está em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram
         * armazenados nas variáveis.
         */
        short y = 99, z = 11, aux;

        System.out.println("Valores antes da troca:");
        System.out.println("Y = " + y + " e Z = " + z);

        aux = y; // variavel aux armazena o valo de uma das variáveis para que possam trocar de valor
        y = z;
        z = aux;

        System.out.println("\nValores depois da troca:");
        System.out.println("Y = " + y + " e Z = " + z);
    }

    public static void exercicio02() {
        /* Exercício 2:
         * Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
         */
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o valor para mostrar seu antecessor: ");
        int valor = entrada.nextInt();

        System.out.println("Valor digitado: " + valor);

        valor--; //decremento para mostrar o valor antecessor ao numero digitado

        System.out.printf("Valor do antecessor: %d", valor);
        entrada.close();
    }

    public static void exercicio03() {
        /* Exercício 3:
         * Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
         * calcular e escrever a área do retângulo.
         */

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da base do retângulo: ");
        float base = entrada.nextFloat();

        System.out.print("\nDigite o valor da altura do retângulo: ");
        float altura = entrada.nextFloat();

        float area = base * altura;

        System.out.printf("\nA área do retângulo é: %.2f", area);
        entrada.close();
    }

    public static void exercicio04(){

        /*
         * Escreva um algoritmo para ler o número total de eleitores de um município,
         * o número de votos brancos,nulos e válidos. Calcular e escrever o percentual
         * que cada um representa em relação ao total de eleitores.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de eleitores do município: ");
        int totalEleitores = entrada.nextInt();

        System.out.println("Digite a quantidade de votos em branco: ");
        int votoBranco = entrada.nextInt();

        System.out.println("Digite a quantidade de votos nulos: ");
        int votoNulo = entrada.nextInt();

        System.out.println("Digite a quantidade de votos válidos: ");
        int voto_valido = entrada.nextInt();

        float resultadoBranco = (float) (votoBranco * 100)/totalEleitores;
        float resultadoNulo = (float) (votoNulo * 100)/totalEleitores;
        float resultadoValido = (float) (voto_valido * 100)/totalEleitores;

        System.out.println("\n---------- RESULTADO DAS ELEIÇÕES ----------");

        System.out.println("Percentual de votos em branco: " + resultadoBranco);
        System.out.println("Percentual de votos nulos: " + resultadoNulo);
        System.out.println("Percentual de votos válidos: " + resultadoValido);

        entrada.close();
    }
}
