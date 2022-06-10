package br.com.generation.sobrecargametodos;

import java.util.Scanner;

public class TestaCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero 1: ");
		double numero1 = entrada.nextDouble();
		
		System.out.println("Digite o numero 2: ");
		double numero2 = entrada.nextDouble();
		
	MinhaCalculador calc = new MinhaCalculador();
	//somando dois inteiros..
	System.out.println(calc.soma(numero1,numero2));
	//somar dois valores fracionários...
	//System.out.println(calc.soma(10.0, 101.0));
	//System.out.println(calc.soma(8.5, 9.7));
	}
}
