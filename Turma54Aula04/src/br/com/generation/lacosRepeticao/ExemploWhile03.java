package br.com.generation.lacosRepeticao;

import java.util.Scanner;

public class ExemploWhile03 {
	//Locale.setDefault(new Locale("en", "US"));

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero = -1;
		while (numero!=10) {
			System.out.println("Digite um número: ");
			numero = in.nextInt();
			if (numero%2==0) {
				numero++;
				System.out.println("Valor Adicionado: "+numero);
			}else {
				numero--;
				System.out.println("Valor Retirado"+numero);
			}
			System.out.println("Fim!");
		}
	}

}
