/*Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os
na tela do terminal, conforme exemplo.
Entities = Comentario, Post
*/

package applications;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comentario;
import entities.Post;

public class Publicacoes {

	public static void main(String[] args) throws ParseException {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Fazer boa viagem!");
		Comentario c2 = new Comentario("Uau, isso é incrível!");
		Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44",fmt1), "Viajar para a Nova Zelândia","Vou visitar este país maravilhoso!",12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Boa Noite");
		Comentario c4 = new Comentario("Que a Força esteja com você");
		Post p2 = new Post(LocalDateTime.parse("28/07/2018 23:14:19",fmt1), "Boa noite pessoal", "Vejo vocês amanhã", 5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
