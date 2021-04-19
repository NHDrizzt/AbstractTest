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

	public double calcImposto() {
		if(numFunc < 10) {
			rendaAnual -= rendaAnual * 0.16;
		}
		else {
			rendaAnual -= rendaAnual * 0.14;
		}
	
		return rendaAnual;
	}
}
