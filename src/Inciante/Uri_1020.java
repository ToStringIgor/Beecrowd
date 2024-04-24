package Inciante;

/*
 Leia um valor inteiro correspondente � idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o c�lculo, considere todo ano com 365 dias e todo m�s com 30 dias.
Nos casos de teste nunca haver� uma situa��o que permite 12 meses e alguns dias, como 360, 363 ou 364.
Este � apenas um exerc�cio com objetivo de testar racioc�nio matem�tico simples.

Entrada
O arquivo de entrada cont�m um valor inteiro.

Sa�da
Imprima a sa�da conforme exemplo fornecido.
 */

import java.util.Scanner;

public class Uri_1020 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idadeDias = sc.nextInt();

		int anos = idadeDias / 365;
		idadeDias %= 365;

		int mes = idadeDias / 30;
		idadeDias %= 30;

		int dias = idadeDias;

		System.out.printf("%d ano(s)%n", anos);
		System.out.printf("%d mes(es)%n", mes);
		System.out.printf("%d dia(s)%n", dias);

		sc.close();
	}

}
