package br.com.generation.Vetor;
import java.util.Scanner;
public class ArrayVetor03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Entre com o tamanho do Vetor: ");
		int tamanhoVetor = entrada.nextInt();
		
		int[] vetor = new int[tamanhoVetor];//[0] até...[4]
		System.out.println("Tamanho do vetor: "+vetor.length);
		
		for (int i=0;i<tamanhoVetor;i++) {
			System.out.println("Digite os Conteúdos do Vetor: ");
			vetor[i]=entrada.nextInt();
		}
		for(int i=0;i<tamanhoVetor;i++) {
			System.out.println("Posição: "+ (i+1) +" Conteúdo: "+vetor[i]);
		}
	}
}
