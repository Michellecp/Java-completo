package course;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String Sentence = sc.nextLine();
		String x,y,z;
		x = sc.next();
		y = sc.next();
		z = sc.next();
				
		System.out.println(Sentence);
		System.out.println(x);
		System.out.println(z);
		System.out.println(y);
		
		x = sc.next();
		y = sc.next();
		z = sc.next();
				
		System.out.println(x);
		System.out.println(z);
		System.out.println(y);
		
		sc.close();
	}

}
