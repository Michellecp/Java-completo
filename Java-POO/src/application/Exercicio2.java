package application;

import java.util.Scanner;

import entities.Employee;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee a = new Employee();
		
		System.out.println("Digite os dados do funcionario");
		System.out.println("Nome: ");
		a.nome = sc.nextLine();
		System.out.println("Salario Bruto: ");
		a.grosssalary = sc.nextDouble();
		System.out.println("Taxa: ");
		a.tax = sc.nextDouble();
		
		System.out.println("Empregado: " + a + a.NetSalary());
		System.out.println();
		
		System.out.println("Qual será o percentual de incremento salarial?");
		a.percentual = sc.nextDouble();
		
		System.out.println();
		System.out.println("Dados atualizados: " + a + a.IncrementSalary(a.percentual));

		sc.close();
	}

}
