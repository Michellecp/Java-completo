package course;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros (na mesma linha):");
		int num  = sc.nextInt();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num>num1 && num>num2){
			System.out.printf("Maior � %d", num);
		} else if(num1>num && num1>num2){
			System.out.printf("Maior � %d", num1);
		}else{
			System.out.printf("Maior � %d", num2);

		}
		
		
		sc.close();
		

	}

}
