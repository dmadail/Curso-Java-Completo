package entities;

public class PessoaFisica extends Contribuinte{
	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}	
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calculaImposto() {
		Double valorImposto = 0.0;
		
		if (getRendaAnual() < 20000.0) {
			valorImposto = getRendaAnual() * 0.15 + gastosSaude * 0.50;
		}
			
		else {
			valorImposto = 20000 * 0.15;
			valorImposto += (getRendaAnual() - 20000.0) * 0.25 + gastosSaude * 0.50;
		}
		
		return valorImposto;
		
	}

}
