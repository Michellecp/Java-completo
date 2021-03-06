package entities;

public class OrderItem {
	
	private Integer qtda;
	private Double preco;
	private Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer qtda, Double preco, Product product) {
		this.qtda = qtda;
		this.preco = preco;
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQtda() {
		return qtda;
	}

	public void setQtda(Integer qtda) {
		this.qtda = qtda;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Double subTotal(){
		return preco * qtda;
	}
	
	@Override
	public String toString() {
		return product.getNome()
				+ ", $" 
				+ String.format("%.2f", preco) 
				+ ", Quantity: " 
				+ qtda + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}

}
