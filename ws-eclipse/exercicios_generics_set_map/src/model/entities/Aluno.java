package model.entities;

import java.util.Objects;

public class Aluno {
	
	private int cod;
	private String curso;
	
	public Aluno(int cod, String curso) {
		this.cod = cod;
		this.curso = curso;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [cod=" + cod + ", curso=" + curso + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return cod == other.cod;
	}

	public int alunosTotais() {
		
		return 0;
	}
	
	
	
	
	
	
}
