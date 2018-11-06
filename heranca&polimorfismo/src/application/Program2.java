package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList();
		
		System.out.println("Entre com o numero de empregados:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			System.out.println("Empregado #" + i + " dados");
			System.out.print("Funcionário Terceirizado?(s/n)");
			char resp =  sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Horas: ");
			int hours = sc.nextInt();
			System.out.println("Valor por Horas: ");
			double valuePerHours = sc.nextDouble();
			
			if(resp == 's'){
				System.out.println("Despesas adicionais: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
				list.add(emp);
			}else{
				Employee emp = new Employee(name, hours, valuePerHours);
				list.add(emp);
			}
			
		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		for(Employee emp:list){
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
		

	}

}
