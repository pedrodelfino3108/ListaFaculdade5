package exercicios5;

import java.util.Scanner;

public class Exercicio6Lista5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");
		double valor1 = scanner.nextDouble();

		System.out.println("Digite o segundo valor:");
		double valor2 = scanner.nextDouble();

		double maior = valor1 > valor2 ? valor1 : valor2;

		System.out.println("O maior valor é: " + maior);

		scanner.close();
	}
}
