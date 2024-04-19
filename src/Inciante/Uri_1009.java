package Inciante;

import java.util.Scanner;

public class Uri_1009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome = sc.next();
		double vendas = sc.nextDouble();
		double salario = sc.nextDouble();

		double total = vendas + salario * 0.15;
		System.out.printf("TOTAL = R$ %.2f%n", total);

		sc.close();
	}

}
