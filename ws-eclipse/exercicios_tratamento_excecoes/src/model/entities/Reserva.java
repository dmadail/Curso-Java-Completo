package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import model.exception.DomainException;

public class Reserva {
	private Integer numeroQuarto;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reserva(Integer numeroQuarto, LocalDate checkIn, LocalDate checkOut) {
		if (!checkOut.isAfter(checkIn)) {
			throw new DomainException("A data de check-out deve ser posterior à data de check-in");
		}
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public long duration() {
		return ChronoUnit.DAYS.between(checkIn, checkOut);
	}
	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
		LocalDate now = LocalDate.now();
		if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
			throw new DomainException("As datas de reserva para atualização devem ser datas futuras");
		}
		if (!checkOut.isAfter(checkIn)) {
			throw new DomainException("A data de check-out deve ser posterior à data de check-in");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Quarto "
			+ numeroQuarto
			+ ", check-in: "
			+ checkIn.format(formatDateTime)
			+ ", check-out: "
			+ checkOut.format(formatDateTime)
			+ ", "
			+ duration()
			+ " noites";
	}
}
