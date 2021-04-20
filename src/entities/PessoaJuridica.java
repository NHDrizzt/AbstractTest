package entities;

public class PessoaJuridica extends Pessoa{

	private int numFunc;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numFunc) {
		super(nome, rendaAnual);
		this.numFunc = numFunc;
	}

	public int getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(int numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public double tax() {
		double imp =0;
		if(numFunc < 10) {
			imp = rendaAnual * 0.16;
		}
		else {
			imp = rendaAnual * 0.14;
		}
	
		return imp;
	}
	

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome +": $");
		sb.append(String.format("%.2f", tax())+ "\n");
		return sb.toString();
	}
}
