package br.com.generation.telasamigaveis;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
	
		//Escolha - caso
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva uma letra: ");
		char letra = entrada.next().charAt(0);
		
		switch(letra) {
		case 'a':
			System.out.println("Annie");
			break;
		case 'f':
			System.out.println("Felipe");
			break;
			default:
				System.out.println("Opção Invalida!");
				break;
		}
	}

}
