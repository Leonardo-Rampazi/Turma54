package br.com.generation.classes2;

public class Carro {
//atributos
	String cor;
	String modelo;
	int ano;
	boolean legalizado;
	int velocidade;
//Métodos 
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}
}
