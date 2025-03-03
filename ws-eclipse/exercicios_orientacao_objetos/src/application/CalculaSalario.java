/* Calcula Salario de funcionario, retirando Imposto de Renda e Aumento de salario em percentual*/
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class CalculaSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Employee funcionario = new Employee();
		
		System.out.println("Entre com os Dados do Funcionário para calcular o salário ");
		
		System.out.print("Nome: ");
		funcionario.name = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.print("Imposto de Renda R$: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + funcionario);
		
		System.out.println();
		System.out.print("Qual o % que você que incrementar o Salário Bruto: ");
		funcionario.increaseSalary(sc.nextDouble());
		
		System.out.println("Empregado Atualizado: " + funcionario);
		
		sc.close();
	}

}
