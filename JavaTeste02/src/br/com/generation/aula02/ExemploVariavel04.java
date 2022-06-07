package br.com.generation.aula02;

import java.util.Scanner;

public class ExemploVariavel04 {

	public static void main(String[] args) {
	
//escreva --> mostra para o usuario textos junto com Variaveis sysout
// leia --> recebe no console um valor digitado pelo usuario. import de uma biblioteca scanner
		Scanner leia = new Scanner (System.in);
		
		double a,b,soma,subtracao,divisao;
		
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		soma = a+b;
		subtracao = a-b;
		divisao = a/b;
		double multiplicacao = a*b;
		
		System.out.println("Resultado da Soma: "+soma);
		System.out.println("Resultado da Subtracao: "+subtracao);
		System.out.println("Resultado da Divisão: "+divisao);
		System.out.println("Resultado da Multiplicacao: "+multiplicacao);
		
	}
}
