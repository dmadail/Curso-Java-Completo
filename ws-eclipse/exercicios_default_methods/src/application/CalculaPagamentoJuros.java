package application;

import java.util.Locale;
import java.util.Scanner;

import model.services.BrasilJurosService;
import model.services.JurosService;
import model.services.USAJurosService;

public class CalculaPagamentoJuros {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		System.out.print("Mês: ");
		int mes = sc.nextInt();
		
		JurosService jurosService = new BrasilJurosService(2.0);
		double pagamento = jurosService.pagamento(valor, mes);
		
		System.out.println("Pagamento após " + mes + " meses:");
		System.out.println(String.format("%.2f", pagamento));
		
		System.out.println();
		jurosService = new USAJurosService(4.0);
		double pagamentoUSA = jurosService.pagamento(valor, mes);
		
		System.out.println("Pagamento após (USA) " + mes + " meses:");
		System.out.println(String.format("%.2f", pagamentoUSA));
		
		sc.close();

	}

}
