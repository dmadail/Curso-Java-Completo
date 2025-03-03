package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	private LocalDateTime dataHoraPedido;
	private StatusPedido status;
	
	private Cliente cliente;
	List<ItemPedido> itensPedido = new ArrayList<ItemPedido>();
	
	private DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	public Pedido(LocalDateTime dataHoraPedido, StatusPedido status, Cliente cliente) {
		this.dataHoraPedido = dataHoraPedido;
		this.status = status;
		this.cliente = cliente;
	}

	public LocalDateTime getDataHoraPedido() {
		return dataHoraPedido;
	}

	public void setDataHoraPedido(LocalDateTime dataHoraPedido) {
		this.dataHoraPedido = dataHoraPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}
	
	public void addItem(ItemPedido item) {
		itensPedido.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		itensPedido.remove(item);
	}
	
	public double totalPedido() {
		double valorTotal = 0;
		for (ItemPedido itemPedido : itensPedido) {
			valorTotal += itemPedido.subTotal();
		}
		
		return valorTotal;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data/Hora: ");
		sb.append(formatDateTime.format(dataHoraPedido) + "\n");
		sb.append("Status Pedido: ");
		sb.append(status + "\n\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n\n");
		sb.append("Itens do Pedido:\n");
		
		for (ItemPedido item : itensPedido) {
			sb.append(item + "\n");
		}
		
		sb.append("Preço Total: R$");
		sb.append(String.format("%.2f", totalPedido()));
		return sb.toString();
		
		/*return "Data/Hora: "
				+ dataHoraPedido.format(formatDateTime)
				+ "\n"
				+ "Status Pedido: "
				+ status.toString();*/
	}
	
	
}
