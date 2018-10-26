package entities;

public class Retangulo {
	public double altura;
	public double largura;
	
	public double calcArea(){
		return largura * altura;
		
	}
	
	public double calcPerimetro(){
		return 2*(largura + altura);
	}
	
	public double calcDiagonal(){
		return  Math.sqrt(Math.exp(largura) + Math.exp(altura));
	}
	
	
}
