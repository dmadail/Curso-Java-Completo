/*Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um sumário do pedido conforme exemplo 
 * (próxima página). Nota: o instante do pedido deve ser o instante do sistema
 * Entities = Cliente, ItemPedido, Pedido
 * Entities.Enums - StatusPedido*/

package applications;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.enums.StatusPedido;

public class Loja {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Data Nascimento: (DD/MM/AAAA)");
		String dataNascimento = sc.next();
		
		Cliente cliente = new Cliente(nome, email, LocalDate.parse(dataNascimento,formatDateTime));
		
		System.out.print("Entre com o status do Pedido ");
		StatusPedido status = StatusPedido.valueOf(sc.next().toUpperCase());
		
		System.out.print("Quantos Itens tem o Pedido ");
		int qtdItens = sc.nextInt();
		
		Pedido pedido = new Pedido(LocalDateTime.now() , status, cliente);
		
		for (int i = 1; i <= qtdItens; i++) {
			
			System.out.println("Entre com pedido #" + i + ":");
			sc.nextLine();
			
			System.out.print("Nome Produto: ");
			String nomeProduto = sc.nextLine();
			
			System.out.print("Preço: ");
			double precoProduto = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			int qtdProduto = sc.nextInt();
			
			ItemPedido itemProduto = new ItemPedido(qtdProduto, precoProduto, nomeProduto);
			pedido.addItem(itemProduto);
		}
		
		System.out.println();
		System.out.println("Detalhes Pedido");
		System.out.println(pedido);
		/*System.out.println();
		System.out.println(cliente);
		double somaTotalPedido = 0;
		
		for (ItemPedido itens : pedido.getItensPedido()) {
			System.out.println(itens.toString());
			somaTotalPedido += itens.subTotal();
		}
		
		System.out.printf("Total Pedido: %.2f", somaTotalPedido);*/
		
		sc.close();
	}

}