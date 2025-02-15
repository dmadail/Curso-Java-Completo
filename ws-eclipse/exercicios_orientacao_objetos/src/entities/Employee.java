package entities;

public class Employee {
	private int id;
	public String name;
	public double grossSalary;
	public double tax;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double grossSalary) {
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double netSalary() {
		return  grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;	
	}
	
	public String toString() {
		return name 
			 + ", $ "
			 + String.format("%.2f", netSalary());
				
	}
	
	public String imprimeArray() {
		return id
			+ ", "
			+ name
			+ ", " 
			+ String.format("%.2f", netSalary());
	}
}
