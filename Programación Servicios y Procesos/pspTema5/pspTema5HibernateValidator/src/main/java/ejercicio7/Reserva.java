package ejercicio7;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;

import java.time.LocalDate;

public class Reserva {

	@FutureOrPresent(message = "La fecha de check-in debe ser hoy o en el futuro")
	private LocalDate checkIn;

	@Future(message = "La fecha de check-out debe estar en el futuro")
	private LocalDate checkOut;

	public Reserva(LocalDate checkIn, LocalDate checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(LocalDate checkOut) {
		this.checkOut = checkOut;
	}

}
