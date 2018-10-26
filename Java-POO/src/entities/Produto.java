package entities;

public class Produto {
	
	private String nome;
	private double preco;
	private int qtda;
	
	public Produto(){
	}
	
	public Produto(String nome, double preco, int qtda){
		this.nome = nome;
		this.preco = preco;
		this.qtda = qtda;
		
	}
	
	public Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public int getQtda(){
		return qtda;
	}
		
	public double totalValeEstoque(){
		return preco * qtda;
	}
	
	public void addProdutos(int qtda){
		this.qtda += qtda;
	}
	
	public void remProdutos(int qtda){
		this.qtda -= qtda;
	}
	
	public String toString(){
		return nome
			+  ", R$ "
			+  String.format("%.2f", preco)
			+  ", "
			+  qtda
			+  " unidades, Total R$ "
			+  String.format("%.2f",totalValeEstoque());
	}

}
