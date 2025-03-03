package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Estoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Entre com o seu produto: ");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Produto: " + product);
		
		System.out.println();
		System.out.print("Entre com o número de produtos a ser adicionado no estoque:");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Produto Atualizado: " + product);
		
		System.out.println();
		System.out.print("Entre com o número de produtos a ser removido no estoque:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Produto Atualizado: " + product);
		
		
		
		
		sc.close();

	}

}
