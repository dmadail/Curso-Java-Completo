package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class CalculaSalarioArrayList {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List<Employee> funcionario = new ArrayList<>();
		
		System.out.println("Entre com os Dados do Funcionário para calcular o salário ");
		
		System.out.print("Quantos funcionários vocês quer registrar: ");
		int qtd = sc.nextInt();
		
		for (int i = 1; i <= qtd; i++) {
			System.out.printf("Funcionário #%d \n", i );
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(funcionario, id)) {
				System.out.print("Id já utilizado. Tente novamente: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salário");
			double salario = sc.nextDouble();
						
			funcionario.add(new Employee(id, nome, salario));
		}
		
		
		System.out.println();
		System.out.print("Entre com o ID do funcionário que você quer dar aumento:");
		int idAumento = sc.nextInt();
		Employee funcionarioAumento = funcionario.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		
		if (funcionarioAumento == null) {
			System.out.println("Funcionário inexistente!");
		}
		else {
			System.out.print("Qual o % que você que incrementar o Salário Bruto: ");
			funcionarioAumento.increaseSalary(sc.nextDouble());
		}
		
		System.out.println();
		for(Employee x : funcionario) {
			System.out.println(x.imprimeArray());
		}
		
		sc.close();

	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
