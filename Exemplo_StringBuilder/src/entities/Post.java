package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private String titulo;
	private String contexto;
	private Integer likes;
	
	private List<Comentarios> comentarios = new ArrayList<>();

	public Post() {

	}

	public Post(Date momento, String titulo, String contexto, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.contexto = contexto;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContexto() {
		return contexto;
	}

	public void setContexto(String contexto) {
		this.contexto = contexto;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}

	public void addComentario(Comentarios coments){
		comentarios.add(coments);
	}
	
	public void removeComentarios(Comentarios coments){
		comentarios.remove(coments);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(contexto + "\n");
		sb.append("Comentarios:\n");
		for (Comentarios c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
	
	
	

}
