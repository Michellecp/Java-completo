package application;

import java.util.Scanner;

import entities.Estudante_Hotel;

public class Exerc_Hotel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos deseja: ");
		int n = sc.nextInt();
		
		Estudante_Hotel[] vect = new Estudante_Hotel[10];
		for(int i=0; i<n;i++){
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Estudante_Hotel(nome, email);
		}
		
		System.out.println("Quartos Ocupados:");
		for(int i=0; i<10;i++){
			if (vect[i] != null){
				System.out.println(i + ": " + vect[i] );
			}
		}
		
		
		
		sc.close();
		
		
		
	}

}
