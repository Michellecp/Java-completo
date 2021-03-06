package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentarios;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentarios c1 = new Comentarios("Tenha uma Boa Viagem!");
		Comentarios c2 = new Comentarios("Woww, que legal!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				"Viajanado para Nova Zelandia",
				"Eu irei visitar esse pais maravilhoso",
				12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentarios c3 = new Comentarios("Boa Noite Pessoal!");
		Comentarios c4 = new Comentarios("Woww, vejo voc�s amanh�!");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Boa Noite",
				"Que a for�a esteja com voc�",
				12);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
