package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Produto;

public class ComparaProdutos {

	public static void main(String[] args) {
		List<Produto> list = new ArrayList<>();

		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 450.00));

		//Versão Final da Expressao Lambda
		list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		
		//Classe Anonima - Ao final do codigo
		//Lambda 1 - Ao final do codigo
		//Lambda 2 - Ao final do codigo
		
		for (Produto p : list) {
			System.out.println(p);
		}

	}

}

/*
Classe Anonima
	Comparator<Product> comp = new Comparator<Product>() {
		@Override
		public int compare(Product p1, Product p2) {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		}
	};
	
	list.sort(comp);
*/

/* Lambda 1
	Comparator<Product> comp = (p1, p2) -> {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	};
	
	list.sort(comp);
		
*/


/* Lambda 2
	Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
*/
