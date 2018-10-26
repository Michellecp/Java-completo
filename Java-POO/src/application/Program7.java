package application;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Program7 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-01-25T21:55:00Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutos = cal.get(Calendar.MINUTE);
		int mes = 10 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutos: " + minutos);
		System.out.println("Mês: " + mes);

		
	}

}
