package entities;

public class EmpregadoTerceirizado extends Empregado{
	
	private Double cobrancaAdicional;

	public EmpregadoTerceirizado() {
		super();
	}
	
	public EmpregadoTerceirizado(String nome, Integer horas, Double valorPorHora, Double cobrancaAdicional) {
		super(nome, horas, valorPorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}

	public Double getAdditionalCharge() {
		return cobrancaAdicional;
	}

	public void setAdditionalCharge(Double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + cobrancaAdicional * 1.1;
	}
}
