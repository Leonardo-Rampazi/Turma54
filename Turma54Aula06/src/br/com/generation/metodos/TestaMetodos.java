package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMetodos {
	static int numero3,numero4,multiplicacao; //variaveis globais
	public static void main(String[] args) {
		System.out.println("Ol� sou o m�todo principal, sou o start da sua aplica��o!"); 
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor da variavel numero3: ");
		numero3= entrada.nextInt();
		
		System.out.println("Digite o valor da variavel numero4: ");
		numero4=entrada.nextInt();
		
		metodo01();
		metodo03();
		metodo04();
		TestaMetodoFora.metodo05();
		metodo06(numero3,numero4);
	}
 public static void metodo01() {
	 System.out.println("Ol� sou o m�todo01!");
	 metodo02();
 }
 public static void metodo02() {
//dentro do metodo as variaveis declaradas funcionam apenas dentro dele 
 double numero1=10,numero2=20,soma;//-->Variaveis locais.
 soma = numero1+numero2;
 System.out.println("soma realizada no m�todo02: "+soma);
 }
 public static void metodo03() {
	 multiplicacao = numero3*numero4;
 }
 public static void metodo04() {
	 System.out.println("Metodo04 est� mostrando o calculo que foi feito no metodo03: "+multiplicacao);
 }
 public static void metodo06(int num5,int num6) {
	 int subtracao = num5 - num6;
	 System.out.println("A subtra��o no m�todo 06 �: "+subtracao);
 }
}
