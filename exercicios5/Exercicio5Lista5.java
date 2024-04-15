package exercicios5;

import java.util.Scanner;

public class Exercicio5Lista5 {

	public static void main(System[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ano atual:");

		int anoAtual = sc.nextInt();

		System.out.println("Digite o ano de nascimento:");

		int anoNascimento = sc.nextInt();

		int idade = anoAtual - anoNascimento;

		if (idade >= 16) {

			System.out.println("Você poderá votar este ano.");

		} else {

			System.out.println("Você não poderá votar este ano.");

		}

		sc.close();

	}

}