package entities;

public class ImportedProduct extends Product{
	private Double customFee;
	
	public ImportedProduct(){
		
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	public double totalTag(){
		return getPrice() + customFee;
	}
	
	@Override
	public String princeTag(){
		return getName() + " $ " + String.format("%.2f", getPrice())
			+ " (Taxa Comum: $ " + String.format("%.2f", customFee) + ")";
	}
	
}
