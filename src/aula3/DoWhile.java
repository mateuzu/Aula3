package aula3;

import java.util.Scanner;

public class DoWhile {
/*
 * DO WHILE, ele executa pelo menos uma vez o código
 * isso porque ele primeiro executa o laço a primeira vez e depois verifica a condição.
 * EXEMPLO: Mostrar um Menu em que uma das opções é sair para que o usuário escolha uma opcao
 */
    public static void main(String[] args) {

        int numero, resultado;
        Scanner sc = new Scanner(System.in);

        do { //executa o bloco pelo menos uma vez
            System.out.print("\nDigite um número inteiro: ");
            numero = sc.nextInt();
            resultado = numero * 5;
            if (resultado > 0) {
            	System.out.println("\nO resultado da multiplicação é: " + resultado);
            }
        } while (numero >= 0); //testa a condicao no final para verificar se irá repetir, repete enquanto a condicao for verdadeira
        
        System.out.println("\nVocê digitou um número negativo, aplicação foi encerrada");
        sc.close();
    }
   
}