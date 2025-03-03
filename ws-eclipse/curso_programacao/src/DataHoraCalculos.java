import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DataHoraCalculos {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekDate = d04.minusDays(7); /*Subtrai 7 dias da data*/
		LocalDate nextWeekDate = d04.plusDays(7); /*Adiciona 7 dias da data*/
		
		LocalDateTime pastWeekLocalDate = d05.minusDays(7); /*Subtrai 7 dias da data/hora*/
		LocalDateTime nextWeekLocalDate = d05.plusDays(7); /*Adiciona 7 dias da data/hora*/
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); /*Subtrai 7 dias da data/hora*/
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); /*Adiciona 7 dias da data/hora*/
		
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay()); /*atStartOfDay, inicializa da data com o horario da meia noite, para fazer o calculo*/
		Duration t2 = Duration.between(pastWeekInstant, nextWeekInstant); /* Pega o tempo docorrido da pastWeekInstant ate nextWeekInstant*/
		Duration t3 = Duration.between(pastWeekInstant, d06); /* Pega o tempo docorrido da pastWeekInstant ate d06*/
		Duration t4 = Duration.between(d06, pastWeekInstant); /*Calcula o tempo porem tras negativo quando calculado datas retroativas*/

		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());

	}

}
