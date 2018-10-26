package entities;

public class Employee {
	public String nome;
	public double grosssalary;
	public double tax;
	public double percentual;
	
	public double NetSalary(){
		double liquido = grosssalary - tax;
		return liquido;
	}
	
	
	public String toString(){
		return nome
			+  ", R$";
	}
	
	public double IncrementSalary(double percentual){
		double incremento = grosssalary + (grosssalary * percentual );
		return incremento;
		
	}

}
