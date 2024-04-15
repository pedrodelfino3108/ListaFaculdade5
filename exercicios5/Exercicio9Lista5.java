package exercicios5;

import java.util.Scanner;

public class Exercicio9Lista5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número de horas trabalhadas em um mês:");
		int horasTrabalhadas = scanner.nextInt();

		System.out.println("Digite o salário por hora:");
		double salarioPorHora = scanner.nextDouble();

		int horasSemanais = 40;
		int semanasNoMes = 4;
		int horasNormais = horasSemanais * semanasNoMes;
		double salarioTotal;

		if (horasTrabalhadas <= horasNormais) {
			salarioTotal = horasTrabalhadas * salarioPorHora;
		} else {
			int horasExtras = horasTrabalhadas - horasNormais;
			double salarioNormal = horasNormais * salarioPorHora;
			double salarioExtra = horasExtras * (salarioPorHora * 1.5);
			salarioTotal = salarioNormal + salarioExtra;
		}

		System.out.println("O salário total do funcionário é: R$" + salarioTotal);

		scanner.close();
	}
}