package entities;

public class Aluno {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaNotaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double notaFaltante() {
		return 60.00 - somaNotaFinal();
	}
	
	public String toString() {
		
		System.out.println();
		
		if (somaNotaFinal() >= 60.00) {
			return "Nota Final do Curso: " + String.format("%.2f", somaNotaFinal()) + System.lineSeparator() + "PASSOU";
		}
		else {
			return "RODOU" + System.lineSeparator() +
			"Precisa de " + String.format("%.2f", notaFaltante()) + " pontos para passar de ano.";
		}
	}
	
}
