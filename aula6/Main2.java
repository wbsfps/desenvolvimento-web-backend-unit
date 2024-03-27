package aula6;

public class Main2 {

	public static void main(String[] args) {
		Account account = new Account();
		account.setHolder("Fulano");
		
		account.depositar(1000);
		account.sacar(600);
		
		account.showDetailsAccount();
		

	}

}
