package Inciante;

/*

QUEST�O
Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s 
valores lidos seguido da mensagem "eh o maior".

ENTRADA
O arquivo de entrada cont�m tr�s valores inteiros.

SA�DA
Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem "eh o maior".

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
