package br.com.generation.aula02;
import java.util.Scanner;

public class ExemploVariavel03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		//byte n =-128;
		//byte n2 = 127;
		double galoes,litros;
		
		System.out.println("Digite quantos galoes você deseja: ");
		galoes = leia.nextDouble();
		litros = galoes *3.7854;
		System.out.println(galoes+" Galões são: "+litros+" Litros");
	}
}
