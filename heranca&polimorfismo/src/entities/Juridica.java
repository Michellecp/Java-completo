package entities;

public class Juridica extends Contribuinte {
	
	private Integer numeroEmpregados;

	public Juridica() {
		
	}

	public Juridica(String nome, Double rendaAtual, Integer numeroEmpregados) {
		super(nome, rendaAtual);
		this.numeroEmpregados = numeroEmpregados;
	}

	public Integer getNumeroEmpregados() {
		return numeroEmpregados;
	}

	public void setNumeroEmpregados(Integer numeroEmpregados) {
		this.numeroEmpregados = numeroEmpregados;
	}
	
	@Override
	public Double taxa(){
		if(getNumeroEmpregados() > 10){
			return getRendaAtual() * 0.14;
		}else{
			return getRendaAtual() * 0.16;
		}
	}
	
	
	

}
