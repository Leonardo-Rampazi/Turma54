package br.com.generation.lacosRepeticao;

public class ExemploWhile02 {

	public static void main(String[] args) throws InterruptedException {
		int numero=10;
		while (numero >= 0) {
			System.out.println("Contando...: "+numero);
			numero--;
			Thread.sleep(500);
		}
	}
}
