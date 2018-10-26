package course;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero:");
		int num = sc.nextInt();

		while(num <= 0){
			if(num <= 0){
				System.out.println("Entre com um numero positivo!Deseja continuar?");
				num = sc.nextInt();
			}
	  }
		int maior = Integer.MIN_VALUE;
		for(int i=1; i<=num; i++){
			System.out.print("Valor #" + i + ": ");
			int x = sc.nextInt();
			if (x > maior){
				maior = x;
			}
		}
		
		System.out.println("Maior é = " + maior);
		sc.close();

	}

}