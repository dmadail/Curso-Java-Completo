package model.services;

import java.security.InvalidParameterException;

public interface JurosService {
	
	double getTaxaJuros();

	default double pagamento(double valor, int mes) {
		if (mes < 1) {
			throw new InvalidParameterException("Os meses devem ser maiores que zero");
		}
		return valor * Math.pow(1.0 + getTaxaJuros() / 100.0, mes);
	}
}
