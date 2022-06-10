package br.com.generation.forr;

public class ExemploLoop{

	public static void main(String[] args) throws InterruptedException {

		int numero = 0;
		
		while (numero < 10) {
			for( int sobe = 1, desce = 10 ; sobe <= 10 && desce >= 1 ; sobe++, desce--) {
				System.out.println(sobe + " || " + desce);
				Thread.sleep(500);
			}
		}
	}

}
