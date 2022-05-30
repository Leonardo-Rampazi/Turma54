programa{
 /*Programa: laço condicional
  *Autor: Leonardo luis Rampazi
  *Data: 30/05/2022
	*/
	funcao inicio() {
	//declaração de variaveis
real nota1,nota2, media
cadeia nomeAluno

escreva("Digite o nome do aluno: ")
	leia (nomeAluno)
	
escreva("Digite a Nota 1: ")
	leia (nota1)
escreva ("Digite a Nota 2: ")
	leia (nota2)
media = (nota1 + nota2)/2
se (media >=9.0){
	escreva ("Aluno"+nomeAluno+"aprovado com louvores!!"+"\n"+media)
}
		senao se (media >=6.0 e media <=9.0){
escreva ("Aluno  "+nomeAluno+ " Aprovado!!"+
"\nMédia: "+media)
		}
	senao se (media >= 3.0 e media <6.0){
escreva ("Aluno "+nomeAluno+ " em recuperação"+
"\nMédia: "+media)
		}
	senao {
		escreva ("Aluno "+nomeAluno+ 
		" reprovado!"+"\nMédia: "+media)
  }
 }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */