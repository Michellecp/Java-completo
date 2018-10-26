package application;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Program5 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for(String x : list){
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------------------------");
		//list.remove("Anna");
		//list.remove(1);
		list.removeIf(x->x.charAt(0) == 'M');
		
		for(String x : list){
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Indice do Bob: " + list.indexOf("Bob"));
		System.out.println("Indice do Marco: " + list.indexOf("Marco"));
		
		System.out.println("------------------------------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result){
			System.out.println(x);
		}
		
		System.out.println("------------------------------------------------------------");
		String nome = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(nome);

	}

}