package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Empregados_list;

public class Exerc_Lista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Empregados_list> list = new ArrayList<>();
		
		System.out.print("Quantos empregados deseja cadastrar?  ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			System.out.println();
			System.out.println("Empregado "+ i +" :");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double sal = sc.nextDouble();
			list.add(new Empregados_list(id, nome, sal));
		}
		
		System.out.println();
		System.out.print("Entre com o c�digo do funcionario que ter� aumento: ");
		int id = sc.nextInt();
		Empregados_list result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(result == null){
			System.out.println("O Id n�o existe no Sistema");
		}
		else{
			System.out.print("Entre com o percentual: ");
			double perc = sc.nextDouble();
			result.incSalario(perc);
		}
		
		System.out.println();
		System.out.println("Lista de funcionarios");
		for(Empregados_list obj : list){
			System.out.println(obj);
		}
		
		
		sc.close();
	}

}
