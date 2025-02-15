package model.entities;

import model.services.Forma;

public class Circulo implements Forma{

	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRao() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

}
