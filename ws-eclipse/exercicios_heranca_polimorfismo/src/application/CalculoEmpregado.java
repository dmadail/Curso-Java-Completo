package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;
import entities.EmpregadoTerceirizado;

public class CalculoEmpregado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> listaEmpregado = new ArrayList<>();
		
		System.out.print("Entre com o número de Empregados: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Empregado #" + i + ":");
			System.out.print("Terceirizado (S/N)? ");
			char terceirizado = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			
			System.out.print("Valor Por Hora: ");
			double valorPorHora = sc.nextDouble();
			
			if (terceirizado == 's' || terceirizado == 'S') {
				System.out.print("Cobrança Adicional: ");
				double cobrancaAdicional = sc.nextDouble();
				listaEmpregado.add(new EmpregadoTerceirizado(nome, horas, valorPorHora, cobrancaAdicional));
			}
			else {
				listaEmpregado.add(new Empregado(nome, horas, valorPorHora));
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos:");
		for (Empregado emp : listaEmpregado) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
		}
		
		sc.close();

	}

}
