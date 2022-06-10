package br.com.generation.Condicionais;

import java.util.Scanner;

public class LacosCondicional {
//laços Condicionais
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double nota1,nota2,media,soma;
		System.out.println("Digite a 1° Nota do Aluno: ");
		nota1=entrada.nextDouble();
		
		System.out.println("Digite a 2° Nota do Aluno: ");
		nota2=entrada.nextDouble();
		
		media = (nota1+nota2)/2;
	/*	if --> se
		else if -->senao se
		else--> senao */
		if(media >=9.0) {
			System.out.println("Aluno Aprovado com louvores!"+"\nMédia: "+media);
		
		}else if (media >=6.0&&media<9.0) {
			System.out.println("Aluno Aprovado!"+"\nMédia: "+media);
			//soma=nota1+nota2;
			//System.out.println("Soma da nota1+nota2: "+soma);
		}
		else if (media>=3.0 && media <6.0) {
			System.out.println("Aluno está de Recuperação:"+"\nMédia: "+media);
		}
		else {
			System.out.println("Aluno Reprovado!"+"\nMédia: "+media);
		}
	}
}
