package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservas;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try{
			System.out.print("N�mero do Quarto:");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkin = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(sc.next());
			
			Reservas reservas = new Reservas(number, checkin, checkout);
			System.out.println("Reserva: " + reservas);
			
			System.out.println();
			System.out.println("Entre com a atualiza��o da Reserva: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());
			
			reservas.updateDates(checkin, checkout);
			System.out.println("Reserva: " + reservas);
			
		}catch(ParseException e){
			System.out.println("Formato de Data Invalido!!");
		}catch(DomainException e){
			System.out.println("Erro na reserva: " + e.getMessage());
		}catch(RuntimeException e){
			System.out.println("Erro Inesperado");
		}
		
		sc.close();
	}

}