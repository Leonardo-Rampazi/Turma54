package br.com.generation.Condicionais;

import java.util.Scanner;

public class LacosCondicional {
//la�os Condicionais
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double nota1,nota2,media,soma;
		System.out.println("Digite a 1� Nota do Aluno: ");
		nota1=entrada.nextDouble();
		
		System.out.println("Digite a 2� Nota do Aluno: ");
		nota2=entrada.nextDouble();
		
		media = (nota1+nota2)/2;
	/*	if --> se
		else if -->senao se
		else--> senao */
		if(media >=9.0) {
			System.out.println("Aluno Aprovado com louvores!"+"\nM�dia: "+media);
		
		}else if (media >=6.0&&media<9.0) {
			System.out.println("Aluno Aprovado!"+"\nM�dia: "+media);
			//soma=nota1+nota2;
			//System.out.println("Soma da nota1+nota2: "+soma);
		}
		else if (media>=3.0 && media <6.0) {
			System.out.println("Aluno est� de Recupera��o:"+"\nM�dia: "+media);
		}
		else {
			System.out.println("Aluno Reprovado!"+"\nM�dia: "+media);
		}
	}
}
