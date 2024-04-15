package exercicios5;

import java.util.Scanner;

public class Exercicio10Lista5 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário fixo do vendedor:");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o valor das vendas efetuadas pelo vendedor:");
        double valorVendas = scanner.nextDouble();

        double comissao;
        if (valorVendas <= 1500) {
            comissao = valorVendas * 0.03;
        } else {
            comissao = 1500 * 0.03 + (valorVendas - 1500) * 0.05; 
        }

        double salarioTotal = salarioFixo + comissao;

        System.out.println("O salário total do vendedor é: R$" + salarioTotal);

        scanner.close();
	}
}
