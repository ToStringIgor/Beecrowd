package Inciante;

/*
 Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
  e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos,
 conforme exemplo fornecido.
 */

import java.util.Scanner;

public class Uri_1019 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdSegundos = sc.nextInt();

		int qtdHoras = qtdSegundos / 3600;
		qtdSegundos %= 3600;

		int qtdMinutos = qtdSegundos / 60;
		qtdSegundos %= 60;

		int milesimos = qtdSegundos;

		System.out.println(qtdHoras + ":" + qtdMinutos + ":" + milesimos);

		sc.close();
	}
}
