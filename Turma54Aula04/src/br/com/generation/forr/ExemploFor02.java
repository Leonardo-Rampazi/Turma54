package br.com.generation.forr;

public class ExemploFor02 {

	public static void main(String[] args) {
		int n = 10;
		int i,soma;
		for(i=0,soma=0;i<=n;i++) {
			System.out.printf("Soma: " + soma + " + " + i);
			//soma=soma+i;
			soma+=i;
			System.out.println(" = "+ soma);
		}
	}

}
