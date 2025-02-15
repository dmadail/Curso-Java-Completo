import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraGlobalParaLocal {

	public static void main(String[] args) {
		//Lista todos os nomes dos fusos horarios 
		// for (String s : ZoneId.getAvailableZoneIds()) 
				// System.out.println(s);

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); /*Pega data pelo fuso local da maquina*/
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); /* Pega data pelo horario local no fuso de Portugal*/
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); /*Pega data/hora pelo fuso local da maquina*/
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); /* Pega data/hora pelo horario local no fuso de Portugal*/

		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);

		System.out.println("d04 dia = " + d04.getDayOfMonth()); /*Pega o Dia */
		System.out.println("d04 mês = " + d04.getMonthValue()); /*Pega o Mês*/
		System.out.println("d04 ano = " + d04.getYear()); /*Pega o Ano*/

		System.out.println("d05 hora = " + d05.getHour()); /*Pega a Hora*/
		System.out.println("d05 minutos = " + d05.getMinute()); /*Pega o Minuto*/

	}

}
