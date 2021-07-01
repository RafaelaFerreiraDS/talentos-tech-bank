package dia2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        exercicio4();
    }

    public static void exercicio1() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para verificar: ");
        int num = entrada.nextInt();

        //String resultado = (num % 2) == 0 ? "O número inserido é par" : "O número inserido é ímpar";

        int resultado = num % 2;

        if (resultado == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é ímpar");
        }
    }

    public static void exercicio2() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a idade do nadador: ");
        int idade = entrada.nextInt();

        if (!entrada.hasNextInt()) {
            System.out.println("Número digitado inválido. Programa encerrado");
            entrada.close();
            System.exit(1);
        }

        if (5 <= idade && idade <= 7) {
            System.out.println("Infantil A = 5 a 7 anos");
        } else if (8 <= idade && idade <= 11) {
            System.out.println("Infantil B = 8 a 11 anos");
        } else if (12 <= idade && idade <= 13) {
            System.out.println("Juvenil A = 12 a 13 anos");
        } else if (14 <= idade && idade <= 17) {
            System.out.println("Juvenil B = 12 a 13 anos");
        } else if (idade >= 18) {
            System.out.println("Adulto = Maiores de 18 anos");
        }

    }

    public static void exercicio3() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor 1: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o valor 2: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número digitado '" + num1 + "' é maior que '" + num2 + "'");
        } else {
            System.out.println("O segundo número digitado '" + num2 + "' é maior que '" + num1 + "'");
        }

    }

    public static void exercicio4() {
        Scanner entrada = new Scanner(System.in);

        int num[] = new int[10]; // declaração do vetor "num"
        int i; // índice ou posição
        int aux = 0;

// Entrada de Dados
        for (i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "° valor: ");
            num[i] = entrada.nextInt();
        }

        for (i = 0; i < 4; i++) {

            if (num[i] > num[i + 1]) {
                aux = num[i];
                num[i] = num[i + 1];
                num[i + 1] = aux;
            }
        }

        System.out.println(num[3]);


    }

    public static void exercicio5() {

    }

    public static void exercicio6() {

    }

}

