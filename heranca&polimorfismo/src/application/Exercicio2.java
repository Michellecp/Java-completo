package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Individual;
import entities.Juridica;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <Contribuinte> list = new ArrayList<>();
				
		System.out.print("Entre com o numero de pagantes: ");
		int num = sc.nextInt();
		
		for(int i=1; i <= num; i++){
			System.out.println("Pagante #" + i + " informações: ");
			System.out.print("Individual ou Companhia?(i/c) ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.print("Taxa Anual: ");
			double rendaAtual = sc.nextDouble();
			if(tipo == 'i'){
				System.out.print("Gastos com Saude: ");
				double gastosSaude = sc.nextDouble();
				list.add(new Individual(nome, rendaAtual, gastosSaude));
			}else if(tipo == 'c'){
				System.out.println("Numero de Funcionarios: ");
				int numeroEmpregados = sc.nextInt();
				list.add(new Juridica(nome, rendaAtual, numeroEmpregados));
			}
			
		}
		double soma = 0.0;
		System.out.println();
		System.out.println("Pagamentos taxados: ");
		for(Contribuinte ct : list){
			double tax = ct.taxa();
			System.out.println(ct.getNome() + " :$ " + String.format("%.2f", tax));
			soma+=tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXAS: $ " + String.format("%.2f", soma));
		
		
		sc.close();
		

	}

}
