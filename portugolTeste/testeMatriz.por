programa{/*"guilherme","igor","Vitor","jhonathan"*/
	
	funcao inicio(){
	real soma = 0.0
	cadeia vetorNome[3] = {"leonardo","luis","Nelson"}
	real matrizNotas [3][4] = {{5.7,7.7,8.0,10.0},
					{4.5,5.8,3.9,10.0},
					{6.0,5.0,7.0,5.0}}
	real medias[3]
	para (inteiro l=0;l<=4;l++){
		
		para(inteiro c = 0; c<=4;c++){
			soma +=matrizNotas[l][c]				
		}
		medias[1] = soma/3
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matrizNotas, 6, 6, 11}-{medias, 9, 6, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */