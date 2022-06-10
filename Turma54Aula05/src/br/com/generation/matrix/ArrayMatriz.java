package br.com.generation.matrix;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//declaração da matriz
		double[][] notasAlunos = new double[2][4];
		
		//adicionando valores da matriz
		System.out.println("---> Notas dos Alunos <---");
		for(int l=0;l<notasAlunos.length;l++) { //-->0,1,2
			for(int c=0;c<notasAlunos[l].length;c++) {//-->0,1,2,3
				System.out.printf("Digite as notas na posição da Matriz %d° Aluno: ",(l+1),(c+1));
				notasAlunos[l][c]= entrada.nextDouble();
			}
			System.out.println();
		}
		
		
		System.out.println("---> Visualizando Notas dos Alunos <---");
		//mostrando os valores da matriz
		for(int l=0;l<notasAlunos.length;l++) { 
			for(int c=0;c<notasAlunos[l].length;c++) {
			System.out.printf(notasAlunos[l][c]+" | ");
			}
			System.out.println();
		}
	}
}
