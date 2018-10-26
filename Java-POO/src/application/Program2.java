package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		
		System.out.println("Entre com os dados do Produto");
		System.out.print("Nome:");
		String nome = sc.nextLine();
		System.out.print("Preço:");
		double preco = sc.nextDouble();
		
		Produto produto = new Produto(nome, preco);
		
		System.out.println();
		System.out.println("Dados do Produto: "+produto);
		
		System.out.println();
		System.out.print("Entre com o nº de produtos que serão adicionado no estoque:");
		int qtda = sc.nextInt();
		produto.addProdutos(qtda);
		
		System.out.println();
		System.out.println("Produtos atualizados: " + produto);
		
		System.out.println();
		System.out.print("Entre com o nº de produtos que serão reduzidos no estoque:");
		qtda = sc.nextInt();
		produto.remProdutos(qtda);
		
		System.out.println();
		System.out.println("Produtos atualizados: " + produto);
		
		
		sc.close();
	}

}
