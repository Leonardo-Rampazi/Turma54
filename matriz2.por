programa
/*exemplo matriz parte 2-> notas[0][0] = 20 
 * <-escreve dentro do bloco 0*/
{
	
	funcao inicio()
	{
		inteiro notas[3][3] 
		
		escreva("Digite as notas: ")
		para(inteiro l =0;l<=2;l++){
			para(inteiro c=0;c<=2;c++){
				escreva("notas: ")
				leia(notas[l][c])
			}
			escreva("\n")
		}
		para(inteiro l=0;l<=2;l++){
			para (inteiro c=0;c<=2;c++){
				escreva(notas[l][c]," | ")
			}
			escreva ("\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 67; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 8, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */