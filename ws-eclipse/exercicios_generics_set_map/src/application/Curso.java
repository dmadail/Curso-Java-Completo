/*Em um portal de cursos online, cada usuário possui um código único, representado por um número inteiro.
Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se matricular em quantos cursos quiser. Assim, o 
número total de alunos de um instrutor não é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
alunos repetidos em mais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a quantidade total e alunos dele, 
conforme exemplo.*/

package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Aluno;

public class Curso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Aluno> alunos = new HashSet<>();
		
		System.out.println("Vamos Descobrir Quantos Alunos Tem o Professor Alex");
			
		System.out.print("Quantos Alunos tem no Curso A: ");
		int qtdAluno = sc.nextInt();
		
		System.out.println("Quem são os alunos do Curso A: ");	
		for (int i = 1; i <= qtdAluno; i++) {
			int codAluno = sc.nextInt();
			alunos.add(new Aluno(codAluno, "A"));
		}
		
		System.out.print("Quantos Alunos tem no Curso B: ");
		qtdAluno = sc.nextInt();
		
		System.out.println("Quem são os alunos do Curso B: ");
		for (int i = 1; i <= qtdAluno; i++) {
			int codAluno = sc.nextInt();
			alunos.add(new Aluno(codAluno, "B"));
		}
		
		System.out.print("Quantos Alunos tem no Curso C: ");
		qtdAluno = sc.nextInt();
		
		System.out.println("Quem são os alunos do Curso C: ");
		for (int i = 1; i <= qtdAluno; i++) {
			int codAluno = sc.nextInt();
			alunos.add(new Aluno(codAluno, "C"));
		}
		
		System.out.println("Total de Alunos: " + alunos.size());
		
		sc.close();
	}

}
