import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DatHoraFormatacao {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); /* Pega o fuso horario do sistema do computador*/
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d04 = " + d04.format(fmt1)); /*Formata da data conforme definido na linha 15*/
		System.out.println("d04 = " + fmt1.format(d04)); /*Pode ser impresso chamando o format e passando a data dentro dos parenteses*/
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println();
		System.out.println("d05 = " + d05.format(fmt1)); 
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));

		System.out.println();
		System.out.println("d06 = " + fmt3.format(d06)); /*Como o Instant não tem o metodo de format, tem que chamar o format ao contrario*/
		System.out.println("d06 = " + fmt5.format(d06));
		System.out.println("d06 = " + d06.toString());

	}

}
