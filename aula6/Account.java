package aula6;

public class Account {
	private String holder;
	private double balance;
	
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public void showDetailsAccount() {
		System.out.println("Titular: " + holder);
		System.out.println("Saldo: " + balance);
	}
	
	public void sacar(double balance) {
		if ( balance > 0 && this.balance >= balance) {			
			this.balance -= balance;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public double depositar(double balance) {
		this.balance += balance;
		return this.balance;
	}
	
}
