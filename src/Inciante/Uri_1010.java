package Inciante;

import java.util.Scanner;

public class Uri_1010 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int peca = sc.nextInt();
		int numPeca = sc.nextInt();
		double valorPeca = sc.nextDouble();
		int peca2 = sc.nextInt();
		int numPeca2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();
		
		double total = numPeca * valorPeca + numPeca2 * valorPeca2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();
	}

}
