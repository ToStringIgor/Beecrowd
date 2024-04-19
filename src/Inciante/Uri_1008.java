package Inciante;

import java.util.Scanner;

public class Uri_1008 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numFunci = sc.nextInt();
		int horas = sc.nextInt();
		double salario = sc.nextDouble();
		
		double receber = horas * salario;
		
		System.out.println("NUMBER = "+ numFunci);
		System.out.printf("SALARY = U$ %.2f%n" , receber);
		
		sc.close();
	}
}
