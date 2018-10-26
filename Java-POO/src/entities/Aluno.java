package entities;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double finalGrade(){
		return (nota1 + 0.30) + (nota2 + 0.35) + (nota3 + 0.35);
	}
	
	public double resultado(){
		if(finalGrade() < 60.0){
			return 60.0 - finalGrade();
		}else{
			return 0.0;
		}
	}	

}
