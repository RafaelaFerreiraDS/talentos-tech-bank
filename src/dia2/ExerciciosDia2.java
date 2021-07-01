package dia2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        exercicio1();
    }

    public static void exercicio1() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para verificar: ");
        int num = entrada.nextInt();

        int resultado = num%2;

        System.out.println(resultado == 0 ? num + " é par." : num +" é ímpar.");
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

        int num[] = new int[10];
        int aux;
        float soma = 0;

        for (int c = 0; c < num.length; c++) {
            System.out.print("Digite os números para ordenar: ");
            num[c] = entrada.nextInt();
        }

        for (int j = 0; j < num.length; j++) {
            for (int x = 0; x < num.length; x++) {
                if (num[j] < num[x]) {
                    aux = num[j];
                    num[j] = num[x];
                    num[x] = aux;
                }
            }
        }

        for (int i = 0 ; i < num.length;i++){
            soma += num[i];
        }

        System.out.println("\n--------- Resultado ---------");
        System.out.println("O maior número digitado é " + num[num.length - 1]);
        System.out.println("O maior menor digitado é " + num[0]);
        System.out.printf("Média = %.2f", (soma/ num.length));
    }

    public static void exercicio5() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float valor1 = entrada.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float valor2 = entrada.nextFloat();

        float adicao = valor1 + valor2;
        float sub = valor1 - valor2;
        float mult = valor1 * valor2;
        float div = valor1 / valor2;

        System.out.println("\n-------- Menu Calculadora --------");
        System.out.println("Para ADIÇÃO --------------------> 1");
        System.out.println("Para SUBTRAÇÃO -----------------> 2");
        System.out.println("Para MULTIPLICAÇÃO -------------> 3");
        System.out.println("Para DIVISÃO -------------------> 4");

        System.out.print("\nDigite o número da operação desejada: ");
        int operacao = entrada.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("\n----------- Resultado -----------");
                System.out.println(valor1 + " + " + valor2 + " = " + adicao);
                break;
            case 2:
                System.out.println("\n----------- Resultado -----------");
                System.out.println(valor1 + " - " + valor2 + " = " + sub);
                break;
            case 3:
                System.out.println("\n----------- Resultado -----------");
                System.out.println(valor1 + " * " + valor2 + " = " + mult);
                break;
            case 4:
                System.out.println("\n----------- Resultado -----------");
                System.out.println(valor1 + " / " + valor2 + " = " + div);
                break;
            default:
                System.out.println("\nOpção inválida. Encerrando calculadora...");
                break;
        }
    }

    public static void exercicio6() {
        Scanner entrada = new Scanner(System.in);

        int aux = 0;

        System.out.println("----------- Jokempô -----------");
        System.out.println("Pedra ----------------------> 1");
        System.out.println("Papel ----------------------> 2");
        System.out.println("Tesoura --------------------> 3\n");

        System.out.print("Jogador 1  digite seu nome: ");
        String nome1 = entrada.next();

        System.out.print("Jogador 2  digite seu nome: ");
        String nome2 = entrada.next();

        System.out.print("\n" + nome1 + ", digite o valor correspondente à sua escolha: ");
        int j1 = entrada.nextInt();

        System.out.print(nome2 + ", digite o valor correspondente à sua escolha: ");
        int j2 = entrada.nextInt();

        if ((j1 < 1 || j1 > 3) && (j2 < 1 || j2 > 3)) {
            System.out.println("Os jogadores escolheram uma opção inválida");
            aux = 1;
        } else if ((j1 < 1 || j1 > 3)) {
            System.out.println("\n" + nome1 + " escolheu uma opção inválida. Jogo encerrado...");
            aux = 1;
        } else if (j2 < 1 || j2 > 3) {
            System.out.println("\n" + nome2 + " escolheu uma opção inválida. Jogo encessado...");
            aux = 1;
        }

        if (aux != 1) {
            if (j1 == j2) {
                System.out.println("\nEmpatou! Ninguém ganhou.");
            } else if ((j1 - j2 == -2) || (j1 - j2 == 1)) {
                System.out.println("\n" + nome1 + " ganhou!!!");
            } else {
                System.out.println("\n" + nome2 + " ganhou!!!");
            }
        }
    }
}

