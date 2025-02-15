/*Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída) e mostrar os dados 
da reserva, inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar novamente a 
reserva com os dados atualizados. O programa não deve aceitar dados inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada
Model.Entities - Reserva
Model.Exception - DomainException
 */
package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reserva;
import model.exception.DomainException;

public class Hotel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Número do Quarto: ");
			int numeroQuarto = sc.nextInt();
			System.out.print("Data Check-in (DD/MM/AAAA): ");
			LocalDate checkIn = LocalDate.parse(sc.next(),formatDateTime);
			System.out.print("Data Check-out (DD/MM/AAAA): ");
			LocalDate checkOut = LocalDate.parse(sc.next(),formatDateTime);
			
			Reserva reservation = new Reserva(numeroQuarto, checkIn, checkOut);
			System.out.println("Reserva: " + reservation);
			
			System.out.println();
			System.out.println("Insira os dados para atualizar a reserva:");
			System.out.print("Data Check-in (DD/MM/AAAA): ");
			checkIn = LocalDate.parse(sc.next(),formatDateTime);
			System.out.print("Data Check-out (DD/MM/AAAA): ");
			checkOut = LocalDate.parse(sc.next(),formatDateTime);
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reserva: " + reservation);
		}
		catch (DomainException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Erro Inesperado");
		}

		sc.close();

	}

}
