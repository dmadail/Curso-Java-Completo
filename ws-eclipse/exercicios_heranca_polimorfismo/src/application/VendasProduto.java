/*Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, mostrar a etiqueta de preço de cada 
produto na mesma ordem em que foram digitados. 
Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação. 
Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo (próxima página). Para produtos importados, 
a taxa e alfândega deve ser acrescentada ao preço final do produto.

Entitites - ProdutoImportado, ProdutoUsado, Produto
 */

package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoImportado;
import entities.ProdutoUsado;
import entities.Produto;

public class VendasProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número de produtos: ");
		int qtdItens = sc.nextInt();
		
		List<Produto> produtos = new ArrayList<>();
		
		for (int i = 1; i <= qtdItens; i++) {
			
			System.out.println("Entre com pedido #" + i + ":");
			
			System.out.print("Comum, Usado, Importado (C/U/I): ");
			char tipoProduto = sc.next().toUpperCase().charAt(0);
			
			sc.nextLine();
			System.out.print("Nome Produto: ");
			String nomeProduto = sc.nextLine();
			
			System.out.print("Preço: ");
			double precoProduto = sc.nextDouble();
			
			
			if (tipoProduto == 'I'){
				
				System.out.print("Taxa Alfândega: ");
				double taxaAlfandega = sc.nextDouble();
				produtos.add(new ProdutoImportado(nomeProduto, precoProduto, taxaAlfandega));
				
			} else if (tipoProduto == 'U') {
				
				System.out.print("Data de Fabricação: ");
				String dataFabricacao = sc.next();
				produtos.add(new ProdutoUsado(nomeProduto, precoProduto, LocalDate.parse(dataFabricacao,formatDateTime)));
				
			}
			else {
				produtos.add(new Produto(nomeProduto, precoProduto));
			}
			
		}
		
		System.out.println();
		System.out.println("Etiquetas de Preços");
		for (Produto produto: produtos) {
			System.out.println(produto.tagPreco());
		}
		
		sc.close();
		

	}

}
