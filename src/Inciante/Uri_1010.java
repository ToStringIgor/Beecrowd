package Inciante;

/*

QUEST�O
Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de 
pe�as 2 e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o 
valor a ser pago.

ENTRADA
O arquivo de entrada cont�m duas linhas de dados. Em cada linha haver� 3 
valores, respectivamente dois inteiros e um valor com 2 casas decimais.

SA�DA
A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, 
lembrando de deixar um espa�o ap�s os dois pontos e um espa�o ap�s 
o "R$". O valor dever� ser apresentado com 2 casas ap�s o ponto.

*/

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
