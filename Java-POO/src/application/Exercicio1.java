package application;

import java.util.Scanner;

import entities.Retangulo;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Entre com a altura e a base  do retangulo:");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble(); //base
		
		System.out.println("Area: " + retangulo.calcArea());
		System.out.println("Perimetro: " + retangulo.calcPerimetro());
		System.out.println("Diagonal:  " + retangulo.calcDiagonal());
		
		sc.close();
		
	}

}
