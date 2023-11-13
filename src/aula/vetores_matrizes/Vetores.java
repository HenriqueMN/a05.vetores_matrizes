package aula.vetores_matrizes;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		/* ----- ARRAYS
		 * 
		 * Arrays são estruturas de dados populares, simples e amplamente utilizadas no dia a dia. É uma estrutura de tamanho fixo que armazenam itens de um mesmo tipo. É um estrutura indexada, isso é, cada elemento é referenciado por um índice (o primeiro elemento tem índice 0). Existem três tipos de array, mas apenas os dois primeiros serão abordados:
		 * 
		 * * Arrays Unidimensionais: //Vetores
		 * * * Um array composto por uma única dimensão. O array é apenas uma linha composta por N colunas do mesmo tipo, em que N é o número máximo de dados que o vetor armazenará. Exemplos de declaração:
		 * 
		 * * * * Declaração com inicialização:
		 * * * * * tipo nome_do_vetor[] = {v1, v2, v3,..., vn};
		 * 
		 * * * * Declaração sem inicialização:
		 * * * * * tipo nome_do_vetor[] = new tipo[tamanho];
		 * 
		 * * Arrays Bidimensionais: //Matrizes
		 * * * Um array composto por duas dimensões: linhas (i) e colunas (j). Em que i é o número  máximo de linhas e j é o número máximo de colunas. Exemplos de declaração:
		 * 
		 * * * * Declaração com inicialização:
		 * * * * * tipo nome_da_Matriz[][] = {{v1, v2, ..., vn}, {v1, v2, ..., vn}, ..., {vn, vn, .., vn}};
		 * 
		 * * * * Declaração sem inicialização:
		 * * * * tipo nome_da_Matriz[][] = new tipo[numero de linhas][numero de colunas];
		 * 
		 * * Arrays Multidimensionais:
		 * * * São arrays que tem três ou mais dimensões, por exemplo, uma matriz composta por outras N matrizes.
		 * 
		 * Arrays também tem métodos próprios:
		 * 
		 * * .sort(array): ordena o vetor em ordem crescente.
		 * 
		 * * .sort(array, Collections.reverseOrder()): ordena o vetor em ordem decrescente.
		 * 
		 * * .length(): retorna o tamanho do vetor.
		 * 
		 * * .equals(array1, array2): compara dois vetores.
		 * 
		 * * .binarySearch(array, chave de pesquisa): retorna a posição de um elemento em um valor ordenado e sem itens repetidos.
		 * 
		 * * .fill(array, valor): preenche o vetor com o valro especificado.
		 * 
		 */
		
		// EXEMPLO DE VETORES
		//!!!!! Esse é um exemplo de vetores, para um exemplo de matrizes, vá para o arquivo com nome Matrizes nessa mesma pasta
		
		// Algoritmo que lê 3 notas de 3 alunes e para cada um calcula a respectiva média. Ao fim, exibe a maior das médias, a média geral e todas as médias
		
		// Criação das variáveis e do Scanner
		float media[] = new float[3]; //Vetor de médias
		float n1, n2, n3; //Notas
		float somaMedia=0, mediaGeral, maiorMedia=0; //Médias
		int i;
		Scanner input = new Scanner(System.in);
		
		// For loop
		for(i = 0; i < 3; i++) {
			
			// Leitura dos inputs
			System.out.print("\nEntre com a primeira nota: ");
			n1 = input.nextFloat();
			System.out.print("Entre com a segunda nota: ");
			n2 = input.nextFloat();
			System.out.print("Entre com a terceira nota: ");
			n3 = input.nextFloat();
			
			// Cálculo das médias
			media[i] = (n1+n2+n3)/3;
			
			// Acréscimo da média à soma das médias
			somaMedia += media[i];
			
			// Checagem do valor de maiorMedia, caso seja menor que a média atual, o valor é substituído
			if(maiorMedia < media[i]) {
				maiorMedia = media[i];
			}
		}
		
		// Cálculo da média geral
		mediaGeral = somaMedia/3;
		
		// Outputs
		System.out.printf("\nMédia geral: %.2f", mediaGeral);
		System.out.printf("\nMaior média: %.2f", maiorMedia);
		
		for(i = 0; i < 3; i++) {
			System.out.printf("\nMédia do alune " + (i+1) + ": %.2f" , media[i]);
		}

	}

}
