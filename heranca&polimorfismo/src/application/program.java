package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 5.000);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//DOWNCAST
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.emprestimo(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.atualizaJuros();
			System.out.println("Update!");
		}
		
		
		
		
	}

}
