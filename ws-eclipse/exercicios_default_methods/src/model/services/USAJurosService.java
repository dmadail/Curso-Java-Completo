package model.services;

public class USAJurosService implements JurosService{
	private double taxaJuros;

	public USAJurosService(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}
}
