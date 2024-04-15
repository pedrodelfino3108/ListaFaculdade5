package exercicios5;

import java.util.Scanner;

public class Exercicio8Lista5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a hora de início do jogo (apenas a hora inteira):");
		int horaInicio = scanner.nextInt();

		System.out.println("Digite a hora de fim do jogo (apenas a hora inteira):");
		int horaFim = scanner.nextInt();

		int duracao;
		if (horaFim > horaInicio) {
			duracao = horaFim - horaInicio;
		} else {
			duracao = (24 - horaInicio) + horaFim;
		}

		System.out.println("A duração do jogo foi de " + duracao + " horas.");

		scanner.close();
	}
}
