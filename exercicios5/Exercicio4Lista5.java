package exercicios5;

import java.util.Scanner;

public class Exercicio4Lista5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota da 1ª avaliação:");

		double nota1 = sc.nextDouble();

		System.out.println("Digite a nota da 2ª avaliação:");

		double nota2 = sc.nextDouble();

		double media = (nota1 + nota2) / 2;

		System.out.println("A média do aluno é: " + media);

		if (media >= 6) {

			System.out.println("O aluno foi aprovado!");

		} else {

			System.out.println("O aluno foi reprovado.");

		}

		sc.close();

	}

}