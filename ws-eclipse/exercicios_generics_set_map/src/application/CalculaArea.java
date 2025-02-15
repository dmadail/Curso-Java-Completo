package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circulo;
import model.entities.Retangulo;
import model.services.Forma;

public class CalculaArea {

	public static void main(String[] args) {

		List<Forma> minhasFormas = new ArrayList<>();
		minhasFormas.add(new Retangulo(3.0, 2.0));
		minhasFormas.add(new Circulo(2.0));

		List<Circulo> meusCirculos = new ArrayList<>();
		meusCirculos.add(new Circulo(2.0));
		meusCirculos.add(new Circulo(3.0));

		System.out.println("Total area: " + totalArea(meusCirculos));
	}

	public static double totalArea(List<? extends Forma> list) {
		double sum = 0.0;
		for (Forma s : list) {
			sum += s.area();
		}
		return sum;
	}

}
