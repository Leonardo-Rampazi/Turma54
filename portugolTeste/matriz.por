programa/*exemplo matriz - 1*/
{
	
	funcao inicio()
	{
		inteiro notas[4][4] = {{10,20,30,40},
						   {10,20,30,40},
						   {10,20,30,40},
						   {10,20,30,40}}

		notas[2][1] = 20
		para(inteiro c=0;c<=3;c++){
			para (inteiro l=0;l<=3;l++){
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
 * @POSICAO-CURSOR = 191; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 6, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */