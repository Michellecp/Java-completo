package application;

import java.util.Scanner;

public class Exerc_Matriz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero de linhas: ");
		int n = sc.nextInt();
		System.out.print("Numero de colunas: ");
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat[i].length; j++){
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Qual numero deseja encontrar: ");
		int num = sc.nextInt();
		
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat[i].length; j++){
				if( mat[i][j] == num){
						System.out.println("Posi��o " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
		}
		
		
		
		
		sc.close();
	}

 }
}