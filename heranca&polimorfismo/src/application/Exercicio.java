package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Exercicio {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.println("Entre com o numero de Produtos: ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++){
			System.out.println("Produto # " + i + " dados:");
			System.out.println("Comum, usado, importado (c/u/i)?");
			char resp = sc.next().charAt(0);
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Preço: ");
			double price = sc.nextDouble();
			
			if(resp == 'c'){
				list.add(new Product(name, price));
			}
			else if (resp == 'u'){
				System.out.print("Data de Fabricação (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				Product prod = new UsedProduct(name, price, manufactureDate);
				list.add(prod);
			}
			else{
				System.out.print("Taxa Comum: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
		System.out.println();
		System.out.println("Tags de Preços: ");
		for(Product prod : list){
			System.out.println(prod.princeTag());
		}
		
		sc.close();

	}
		
}


