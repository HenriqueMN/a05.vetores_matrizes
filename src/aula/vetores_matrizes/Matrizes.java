package aula.vetores_matrizes;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		// EXEMPLO DE MATRIZES
		//!!!!! Esse é um exemplo de vetores, para um exemplo de matrizes, vá para o arquivo com nome Matrizes nessa mesma pasta		
		
		// Algoritmo que cria uma matriz, retorna todos os números múltiplos de cinco e retorna a soma dos valores da diagonal principal e da secundária
		
		// Criação das variáveis
		int matriz[][] = new int[3][3];
		int linha, coluna, somaDiagonalPrinc=0, somaDiagonalSec=0;
		Scanner input = new Scanner(System.in);
		
		// For Loop
		for(linha = 0; linha < 3; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.print("Insira o valor da posição " + linha + ", " + coluna + ": ");
				matriz[linha][coluna] = input.nextInt();
				
				if(matriz[linha][coluna]%5 == 0) {
					System.out.print("\nO número + " + matriz[linha][coluna] + " é múltiplo de 5.\n\n");
				}
				
				if(linha == coluna) {
					somaDiagonalPrinc += matriz[linha][coluna];
				}
				
				if((linha + coluna) == 2) {
					somaDiagonalSec += matriz[linha][coluna];
				}
			}
		}
		
		System.out.print("\nSomatório da diagonal principal: " + somaDiagonalPrinc);
		System.out.print("\nSomatório da diagonal principal: " + somaDiagonalSec);

	}

}
