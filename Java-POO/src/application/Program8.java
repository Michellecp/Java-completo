package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.ContratoHoras;
import entities.Trabalhador;
import entities.departamento;
import entities.enums.NivelTrabalho;

public class Program8 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome do Departamento:");
		String nomedepartamento = sc.nextLine();
		
		System.out.println("Entra com os dados: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nivel: ");
		String nivel = sc.nextLine();
		System.out.print("Salario Base: ");
		double salBase = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalho.valueOf(nivel), salBase, new departamento(nomedepartamento));
		
		
		System.out.print("Quantos contratos: ");
		Integer num = sc.nextInt();
		
		for(int i=0; i<num; i++){
			System.out.println("Entre com o contrato # "+ i+1 + " data: "  );
			System.out.println("Data (DD/MM/YYYY): ");
			Date contratoData = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.println("Dura��o(horas): ");
			int horas = sc.nextInt();
			ContratoHoras contrato = new ContratoHoras(contratoData, valorHora, horas);
			Trabalhador.addContratos(contrato);
		}
		
		System.out.println();
		System.out.println("Entre com o m�s e o ano para calcular o salario: ");
		String meseano = sc.next();
		int mes = Integer.parseInt(meseano.substring(0,2));
		int ano = Integer.parseInt(meseano.substring(3));
		System.out.println();
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartament().getNome());
		System.out.println("Valor recebido em  " + meseano + ":" + String.format("%.2f", trabalhador.calcSalario(ano, mes)));
		
		sc.close();
	}

}
