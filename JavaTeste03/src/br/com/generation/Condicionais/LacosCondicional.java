package br.com.generation.Condicionais;

import java.util.Scanner;

public class LacosCondicional {
//laços Condicionais
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double nota1,nota2,media;
		System.out.println("Digite a 1° Nota do Aluno: ");
		nota1=entrada.nextDouble();
		
		System.out.println("Digite a 2° Nota do Aluno: ");
		nota2=entrada.nextDouble();
		
		media = (nota1+nota2)/2;
	/*	if --> se
		else if -->senao se
		else--> senao */
		if(media >=6.0) {
			System.out.println("Aluno Aprovado"+"\nMédia: "+media);
		}
	}
}
