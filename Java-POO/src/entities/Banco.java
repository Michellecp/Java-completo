package entities;

public class Banco {
	
	private int numConta;
	private String nome;
	private double saldo;
		
	public Banco(int numConta, String nome, double depoInicial) {
		this.numConta = numConta;
		this.nome = nome;
		addDeposito(depoInicial);
	}
	
	
	public Banco(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSaldo() {
		return saldo;
	}

	public void addDeposito(double qtdade){
		 saldo += qtdade;
	}
	
	public void Saque(double qtdade){
		 saldo -= qtdade + 5.00;
	}
	
	public String toString(){
		return "Conta: "
			+ numConta
			+  ", Titular: "
			+ nome
			+ ", Saldo: R$  "
			+ String.format("%.2f", saldo);
	}

}
