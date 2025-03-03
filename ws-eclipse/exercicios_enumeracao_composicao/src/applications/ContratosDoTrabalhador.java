/*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo
(próxima página).*
Entities = Departamento, HorasContrato, Trabalhador
Entities.Enums = NivelTrabalho
*/

package applications;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HorasContrato;
import entities.Trabalhador;
import entities.enums.NivelTrabalho;

public class ContratosDoTrabalhador {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Entre com o Nome do Departamento: ");
		String nomeDepartamento = sc.nextLine();
		
		System.out.println("Entre com os Dados do Trabalhador:");
		System.out.print("Nome: ");
		String nomeTrabalhador = sc.nextLine();
		
		System.out.print("Nível: ");
		String nivelTrabalhador = sc.nextLine();
		
		System.out.print("Salário Base: ");
		double salarioBase = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalho.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos para esse trabalhador? ");
		int qtdContratos = sc.nextInt();
		
		for (int i = 1; i <= qtdContratos; i++) {
			
			System.out.println("Entre com contrato #" + i + ":");
			System.out.print("Data (DD/MM/YYYY): ");
			String data = sc.next();
			LocalDate dataContrato = LocalDate.parse(data,fmt1);
			
			System.out.print("Valor Por Hora: ");
			double valorPorHora = sc.nextDouble();
			
			System.out.print("Duração (horas): ");
			int horas = sc.nextInt();
			
			HorasContrato contrato = new HorasContrato(dataContrato, valorPorHora, horas);
			trabalhador.addContrato(contrato);
		}
		
		System.out.println();
		System.out.print("Entre com o mês para calcular a renda (MM/YYYY): ");
		String mesAno = sc.next();
		
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Name: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda para " + mesAno + ": " + String.format("%.2f", trabalhador.renda(mes, ano)));
		
		
		sc.close();
		
	}

}
