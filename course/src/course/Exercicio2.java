package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o seu nome completo:");
		String nome = sc.nextLine(); //Alex Green
		
		System.out.println("Quantos quartos tem na sua casa:");
		int n1 = sc.nextInt(); //3
		
		System.out.println("Entre com o pre�o do produto:");
		double n2 = sc.nextDouble(); //500.50
		
		//Green 21 1.73
		System.out.println("Entre com seu nome, idade e altura (na mesma linha):");
		String nome2 = sc.next();
		int n3 = sc.nextInt();
		double n4 = sc.nextDouble();
		
		
		System.out.println(nome);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(nome2);
		System.out.println(n3);
		System.out.println(n4);
		
		sc.close();
		

	}

}
