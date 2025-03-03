/*Calcula Nota de um aluno*/
package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class CalculaNotaAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com os Dados do Aluno para verificar se ele passou de Ano.");
		System.out.println("Obs.: A média é 60.00");
		
		System.out.print("Nome: ");
		aluno.name = sc.nextLine();
		
		System.out.print("Nota 1º Trimestre: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.print("Nota 2º Trimestre: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.print("Nota 3º Trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(aluno);
		
		
		sc.close();
	}

}
