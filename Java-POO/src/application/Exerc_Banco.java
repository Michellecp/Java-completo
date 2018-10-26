package application;
import java.util.Scanner;

import entities.Banco;

public class Exerc_Banco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Banco banco;
		
		System.out.print("Entre com o numero da conta: ");
		int num = sc.nextInt();
		System.out.print("Entre com o nome do titular: ");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("Deposito Inicial (S/N): ");
		char response = sc.next().charAt(0);
		
		if (response == 's'){
			System.out.println("Entre com o valor inicial do Deposito: R$ ");
			double depInicial = sc.nextDouble();
			banco = new Banco(num, nome, depInicial);
		}else{
			banco = new Banco(num, nome);
		}
		
		 
		System.out.println();
		System.out.print("Conta atualizada: ");
		System.out.print(banco);
		
		System.out.println();
		System.out.print("Entre com o valor do deposito: ");
		double depovalue = sc.nextDouble();
		banco.addDeposito(depovalue);
		System.out.print("Conta atualizada: ");
		System.out.print(banco);
		
		System.out.println();
		System.out.print("Entre com o valor valor para Saque: ");
		double tirardin = sc.nextDouble();
		banco.Saque(tirardin);
		System.out.print("Conta atualizada: ");
		System.out.print(banco);
		
		
		
		
		
		
		sc.close();
		
	}

}
