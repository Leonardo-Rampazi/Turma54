package br.com.generation.Vetor;
import java.util.Scanner;
public class ArrayVetor03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Entre com o tamanho do Vetor: ");
		int tamanhoVetor = entrada.nextInt();
		
		int[] vetor = new int[tamanhoVetor];//[0] at�...[4]
		System.out.println("Tamanho do vetor: "+vetor.length);
		
		for (int i=0;i<tamanhoVetor;i++) {
			System.out.println("Digite os Conte�dos do Vetor: ");
			vetor[i]=entrada.nextInt();
		}
		for(int i=0;i<tamanhoVetor;i++) {
			System.out.println("Posi��o: "+ (i+1) +" Conte�do: "+vetor[i]);
		}
	}
}
