package entities;

public class Individual extends Contribuinte {

	private Double GastosSaude;

	public Individual(String nome, Double rendaAtual, Double gastosSaude) {
		super(nome, rendaAtual);
		GastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return GastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		GastosSaude = gastosSaude;
	}
	
	@Override
	public Double taxa(){
		if(getRendaAtual() < 2000){
			return getRendaAtual() * 0.05 - getGastosSaude() * 0.5;
		}else{
			return getRendaAtual() * 0.25 - getGastosSaude() * 0.5;
		}
	}
	

}
