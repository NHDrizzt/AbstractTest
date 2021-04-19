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
	
	public final double calcRenda() { 
		if(rendaAnual < 20000 && rendaAnual > 0) {
			if(gastos > 0) {
				gastos -= gastos*0.5;
				rendaAnual -= ((rendaAnual * 0.15) + gastos);
			}
			else {
				rendaAnual -= rendaAnual * 0.15;
			}

		}
		else {
			if(gastos > 0) {
				gastos -= gastos*0.5;
				rendaAnual -= ((rendaAnual * 0.25) + gastos);
			}
			rendaAnual -= rendaAnual * 0.25;
		}
		
		return rendaAnual;
	}
	
	public final double totalImposto() {
		double totalImp=0;
		if(rendaAnual < 20000) {
			totalImp =  rendaAnual * 0.15;
		}
		else {
			totalImp = rendaAnual * 0.25;
		}
		
		return totalImp;
	}
	
}
