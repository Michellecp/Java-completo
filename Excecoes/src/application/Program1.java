package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com os dados da Conta:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome: ");
		String titular = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de Saque: ");
		double saqueLim = sc.nextDouble();
		
		Account conta = new Account(numero, titular, saldo, saqueLim);
		
		System.out.println();
		System.out.println("Entre com o valor para saque: ");
		double amount = sc.nextDouble();
		
		try{
			conta.saque(amount);
			System.out.println("Novo saldo: " + String.format("%.2f", conta.getSaldo()));
				
		}catch(DomainException e){
			System.out.println("Saque erro: " + e.getMessage());
			
		}	
		sc.close();
				
	}

}
