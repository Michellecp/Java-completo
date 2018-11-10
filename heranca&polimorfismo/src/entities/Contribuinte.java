package entities;

public abstract class Contribuinte {

	private String nome;
	private Double RendaAtual;
	
	public Contribuinte() {

	}
	
	public Contribuinte(String nome, Double rendaAtual) {
		this.nome = nome;
		RendaAtual = rendaAtual;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAtual() {
		return RendaAtual;
	}

	public void setRendaAtual(Double rendaAtual) {
		RendaAtual = rendaAtual;
	}
	
	public abstract Double taxa();	
	
}
