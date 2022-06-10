package br.com.generation.DolWhilu;

public class ExemploDoWhile {

	public static void main(String[] args) throws InterruptedException {
		int i = 0;
		int j=0;
		do {
			//email: senha: ele roda primeiro dps verifica
			System.out.println(++i);
			System.out.println(++j);
			//i++;
			Thread.sleep(500);
		}while(i<=7);
	}
}
