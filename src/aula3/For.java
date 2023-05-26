package aula3;

import java.util.Scanner;

public class For {
//Quando determinamos quantas vezezs o código ira repetir
//for = para
	public static void main(String[] args) {
		
		String nome;
		Scanner sc = new Scanner(System.in);
		
		for (int contador = 1; contador <= 3; contador++) { //executa enquanto contador for maior ou igual a 3
			System.out.print("Digite o " + contador + "° nome: ");
			nome = sc.nextLine();
			System.out.println("O " + contador + "° nome é: " + nome + "\n");
		}
		/*
		System.out.print("Digite o 1° nome: ");
		nome1 = sc.nextLine();
		System.out.println("O 1° nome é: " + nome1);
		
		System.out.print("Digite o 2° nome: ");
		nome2 = sc.nextLine();
		System.out.println("O 2° nome é: " + nome2);
		
		System.out.print("Digite o 3° nome: ");
		nome3 = sc.nextLine();
		System.out.println("O 3° nome é: " + nome3);
		*/
		sc.close();
	}

}
