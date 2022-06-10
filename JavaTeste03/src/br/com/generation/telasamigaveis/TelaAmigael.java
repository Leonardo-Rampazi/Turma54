package br.com.generation.telasamigaveis;

import javax.swing.JOptionPane;

public class TelaAmigael {

    public static void main(String[] args) {

        int numero;
        //JOptionPane.showMessageDialog(null, "O maior valor foi: "+ maior);
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));

    if(numero % 4 == 0  && numero % 5 == 0) {
        JOptionPane.showMessageDialog(null, "O numero " + numero + " e divisivel por 4 e 5");
    }
    else {
        JOptionPane.showMessageDialog(null, "O numero " + numero + " nao e divisivel por 4 e 5");

        }
    }
}