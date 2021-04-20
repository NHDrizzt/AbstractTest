package entities;

public class PessoaFisica extends Pessoa{

	private Double gastos;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastos) {
		super(nome, rendaAnual);
		this.gastos = gastos;
	}

	public Double getGastos() {
		return gastos;
	}

	public void setGastos(Double gastos) {
		this.gastos = gastos;
	}
	
	@Override
	public final double tax() { 
		double imp=0;
		if(rendaAnual < 20000 && rendaAnual > 0) {
			if(gastos > 0) {
				imp = rendaAnual * 0.15 - gastos * 0.5;
			}
			else {
				imp = rendaAnual * 0.15;
			}

		}
		else {
			if(gastos > 0) {
				imp = rendaAnual * 0.25 - gastos * 0.5;
			}
			else {
				imp = rendaAnual * 0.25;
			}

		}
		
		return imp;
	}

	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome +": $");
		sb.append(tax()+ "\n");
		return sb.toString();
	}
	
}
