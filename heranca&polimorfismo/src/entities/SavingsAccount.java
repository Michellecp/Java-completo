package entities;

public class SavingsAccount extends Account {
	
	private Double taxa;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer numero, String titular, Double saldo, Double taxa) {
		super(numero, titular, saldo);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double atualizaJuros(){
		return saldo += saldo * taxa;
	}
	
	@Override
	public Double saque(double montante){
		return saldo -= montante;
	}
	

}
