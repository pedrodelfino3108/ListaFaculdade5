package exercicios5;

import java.util.Scanner;

public class Exercicio1Lista5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");

		int numero = sc.nextInt();

		if (numero > 10) {
			System.out.println("É MAIOR QUE 10!");
		} else {
			System.out.println("NÃO É MAIOR QUE 10!");
		}

		sc.close();
	}
}