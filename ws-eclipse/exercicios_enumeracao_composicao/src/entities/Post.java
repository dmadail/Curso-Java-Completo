package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDateTime momento;
	private String titulo;
	private String conteudo;
	private Integer curtidas;
	
	private List<Comentario> comentarios = new ArrayList<>();
	
	public Post() {
	}

	public Post(LocalDateTime momento, String titulo, String conteudo, Integer curtidas) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.curtidas = curtidas;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public String gettitulo() {
		return titulo;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getconteudo() {
		return conteudo;
	}

	public void setconteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getcurtidas() {
		return curtidas;
	}

	public void setcurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public List<Comentario> getComentario() {
		return comentarios;
	}

	public void addComentario(Comentario Comentario) {
		comentarios.add(Comentario);
	}

	public void removeComentario(Comentario Comentario) {
		comentarios.remove(Comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(curtidas);
		sb.append(" curtidas - ");
		sb.append(fmt1.format(momento) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentários:\n");
		for (Comentario c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
}
