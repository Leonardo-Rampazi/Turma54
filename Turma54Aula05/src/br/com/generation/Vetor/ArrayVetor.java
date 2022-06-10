package br.com.generation.Vetor;

public class ArrayVetor {

	public static void main(String[] args) {
//array -->arranjo , vetor --> um array de uma unica dimensão
//matriz --> um array com n dimensões diversas dimensões varios lados
		int[] arrayVetor = new int[10];
		arrayVetor[5]=365;
		for(int i=0;i<10;i++) {
			System.out.println("Indice do Vetor: " + i + " --> "+arrayVetor[i]);
		}
	}
}
