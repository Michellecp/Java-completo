package application;

import java.util.Scanner;

import entities.Aluno;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.println("Nota 1� Trimestre: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Nota 2� Trimestre: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Nota 3� Trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("GRADE FINAL: %.2f%n", aluno.finalGrade());
		
		if(aluno.finalGrade() < 60.0){
			System.out.println("FAILED");
			System.out.println("Aus�ncia de: " + aluno.resultado());
		}else{
			System.out.println("PASS");
		}	
		
		sc.close();


		
	}

}
