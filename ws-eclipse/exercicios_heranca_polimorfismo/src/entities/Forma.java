package entities;

import entities.enums.Cor;

public abstract class Forma {
	private Cor cor;
	
	public Forma() {
	}
	
	public Forma(Cor cor) {
		this.cor = cor;
	}

	public Cor getColor() {
		return cor;
	}

	public void setColor(Cor cor) {
		this.cor = cor;
	}
	
	public abstract double area();
}
