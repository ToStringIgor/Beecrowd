package Inciante;

/*

QUEST�O
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a 
diferen�a do produto de A e B pelo produto de C e D segundo a f�rmula: 
DIFERENCA = (A * B - C * D).

ENTRADA
O arquivo de entrada cont�m 4 valores inteiros.

SA�DA
Imprima a mensagem DIFERENCA com todas as letras mai�sculas, conforme 
exemplo abaixo, com um espa�o em branco antes e depois da igualdade.

*/

import java.util.Scanner;

public class Uri_1007 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int diferenca = a*b - c*d;
		
		System.out.println("DIFERENCA = "+ diferenca);
		sc.close();
	}
}
