package aula3;

import java.util.Scanner;

public class While {
//WHILE é um Laço de Repetição, geralmente utilizado quando não conhecemos o valor final da condição dessa repetição.

    public static void main(String[] args) {
        String continua = "s";
        int numero1, numero2, resultado;
        Scanner sc = new Scanner(System.in);

        while (continua.equals("s")) { //executa enquanto a condição for verdadeira
            System.out.print("Digite primeiro valor: ");
            numero1 = sc.nextInt();
            System.out.print("Digite segundo valor: ");
            numero2 = sc.nextInt();

            resultado = numero1 + numero2;

            System.out.println("O resultado da soma é: " + resultado);
            System.out.println("\nMenu\n");
            System.out.print("Deseja continuar? (s/n) ? ");
            continua = sc.next();
            System.out.println("\n---------\n");
        }
        System.out.println("\nFim do programa");
        sc.close();
        /*
        System.out.print("Digite primeiro valor: ");
        numero1 = sc.nextInt();
        System.out.print("Digite segundo valor: ");
        numero2 = sc.nextInt();

        resultado = numero1 + numero2;
        */
    }
}