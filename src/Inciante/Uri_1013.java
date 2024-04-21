package Inciante;

/*

QUESTÃO
Faça um programa que leia três valores e apresente o maior dos três 
valores lidos seguido da mensagem "eh o maior".

ENTRADA
O arquivo de entrada contém três valores inteiros.

SAÍDA
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

*/
import java.util.Scanner;

public class Uri_1013 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println(a +" eh o maior");
		} else if (b > c) {
			System.out.println(b +" eh o maior");
		} else {
			System.out.println(c +" eh o maior");
		}
		
		
		sc.close();
	}

}
