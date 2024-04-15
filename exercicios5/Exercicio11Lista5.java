package exercicios5;

import java.util.Scanner;

public class Exercicio11Lista5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número da conta do cliente:");
		int numeroConta = scanner.nextInt();

		System.out.println("Digite o saldo:");
		double saldo = scanner.nextDouble();

		System.out.println("Digite o débito:");
		double debito = scanner.nextDouble();

		System.out.println("Digite o crédito:");
		double credito = scanner.nextDouble();

		double saldoAtual = saldo - debito + credito;

		if (saldoAtual >= 0) {
			System.out.println("Saldo Positivo");
		} else {
			System.out.println("Saldo Negativo");
		}

		scanner.close();
	}
}
