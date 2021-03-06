package entities;

public class Account {
	private Integer numero;
	private String titular;
	protected Double saldo;
	
	public Account() {
		
	}

	public Account(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getsaldo() {
		return saldo;
	}

	public Double saque(double montante){
		return saldo -= montante;
	}
	
	public Double deposito(double montante){
		return saldo += montante;
	}
	
	
	

}
