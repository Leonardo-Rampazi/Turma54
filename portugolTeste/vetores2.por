programa{/*Exmplo Vetor -2 em vez de /4 na 
média coloca (i+1) que vai dividir por 4 tbm*/
	
	funcao inicio(){
		real notas[4]
		real soma = 0.0,media=0.0
		escreva ("==== Sistema de Notas do Ensino. Médio ====")
		escreva ("\nDigite as notas do Aluno: \n")
		para (inteiro i=0;i<=3;i++){
			escreva ((i+1)+"° Nota: ")
			leia (notas[i])
			soma = soma+notas[i]
			media = soma /(i+1)		
		}
		se(media >=5.75){
			escreva ("\nAluno Aprovado!")		
			}senao {
				escreva ("\nAluno Reprovado!")
			}
		escreva ("\nSoma das notas: "+soma)
		escreva ("\nA Média das notas: "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 585; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 5, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */