package Inciante;

import java.util.Scanner;

/*

QUESTÃO
Leia um valor inteiro. A seguir, calcule o menor número de notas 
possíveis (cédulas) no qual o valor pode ser decomposto. As notas 
consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o 
valor lido e a relação de notas necessárias.

ENTRADA
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

SAÍDA
Imprima o valor lido e, em seguida, a quantidade mínima de notas de 
cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de 
imprimir o fim de linha após cada linha, caso contrário seu programa 
apresentará a mensagem: "Presentation Error".

*/

public class Uri_1018 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor = sc.nextInt();
		System.out.println(valor);

		int cedula100 = valor / 100;
		valor %= 100;
		int cedula50 = valor / 50;
		valor %= 50;
		int cedula20 = valor / 20;
		valor %= 20;
		int cedula10 = valor / 10;
		valor %= 10;
		int cedula5 = valor / 5;
		valor %= 5;
		int cedula2 = valor / 2;
		valor %= 2;
		int cedula1 = valor / 1;
		valor %= 1;

		System.out.println(cedula100 + " nota(s) de R$ 100,00");
		System.out.println(cedula50 + " nota(s) de R$ 50,00");
		System.out.println(cedula20 + " nota(s) de R$ 20,00");
		System.out.println(cedula10 + " nota(s) de R$ 10,00");
		System.out.println(cedula5 + " nota(s) de R$ 5,00");
		System.out.println(cedula2 + " nota(s) de R$ 2,00");
		System.out.println(cedula1 + " nota(s) de R$ 1,00");

	}
}
