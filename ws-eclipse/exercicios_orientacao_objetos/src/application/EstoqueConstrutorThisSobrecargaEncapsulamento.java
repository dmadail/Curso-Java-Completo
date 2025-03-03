package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductConstruct;

public class EstoqueConstrutorThisSobrecargaEncapsulamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o seu produto: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();
		
		//Instancia o produto com o construtor criado
		ProductConstruct product = new ProductConstruct(name,price,quantity);
//		ProductConstruct product = new ProductConstruct(name,price);
			
		System.out.println();
		System.out.println("Produto: " + product);
		
		System.out.println();
		System.out.print("Entre com o número de produtos a ser adicionado no estoque:");
		quantity = sc.nextInt();
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
