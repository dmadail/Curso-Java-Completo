// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraDefinicao {

	public static void main(String[] args) {
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			
		LocalDate d01 = LocalDate.now(); /*Pega somente Data*/
		LocalDateTime d02 = LocalDateTime.now(); /*Pega Data/Hora Local*/
		Instant d03 = Instant.now(); /*Pega Data/Hora de Londres */
				
		LocalDate d04 = LocalDate.parse("2022-07-20"); /* Gera uma Data com o formato ISO-8601 */
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); /* Gera uma Data/Hora com o formato ISO-8601 */
		Instant d06 = Instant.parse("2022-07-20T10:30:26Z"); /* Gera uma Data/Hora com o formato ISO-8601 no fuso horario de Londres */
		Instant d07 = Instant.parse("2022-07-20T10:30:26-03:00");/* Gera uma Data/Hora com o formato ISO-8601 no fuso horario de Londres mas trazendo o horario local (-03:00)*/
				
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); /*Formata a data conforme definido no dateTimeFormatter linha 11*/
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);/*Formata a data/hora conforme definido no dateTimeFormatter linha 11*/

		LocalDate d10 = LocalDate.of(2022, 07, 20); /*Instancia a data, atraves de dados passados isoladamente*/
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);/*Instancia a data/hora, atraves de dados passados isoladamente*/
				
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d03 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());

	}

}
