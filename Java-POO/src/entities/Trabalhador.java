package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalho;

public class Trabalhador {
	
	private String nome;
	private NivelTrabalho level;
	private Double salariobase;
	
	private departamento departament;
	private static List<ContratoHoras> contratos = new ArrayList<>();
	
	public Trabalhador(){
		
	}

	public Trabalhador(String nome, NivelTrabalho level, Double salariobase, departamento departament) {
		this.nome = nome;
		this.level = level;
		this.salariobase = salariobase;
		this.departament = departament;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalho getLevel() {
		return level;
	}

	public void setLevel(NivelTrabalho level) {
		this.level = level;
	}

	public Double getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(Double salariobase) {
		this.salariobase = salariobase;
	}

	public departamento getDepartament() {
		return departament;
	}

	public void setDepartament(departamento departament) {
		this.departament = departament;
	}

	public List<ContratoHoras> getContratos() {
		return contratos;
	}

	public static void addContratos(ContratoHoras contract){
		contratos.add(contract);
	}
	
	public void removeContrato(ContratoHoras contract){
		contratos.remove(contract);
	}
	
	public double calcSalario(int ano, int mes){
		double soma = salariobase;
		Calendar cal = Calendar.getInstance();
		for(ContratoHoras c: contratos){
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes){
				soma += c.valorTotal();
			}
		}
					
		return soma;
	}

}
