package aula04;

public class atividade5 {

	public static void main(String[] args) {
	
		int numero = 7;
		
		for (int i = 0; i <= 50; i++) {
			
			String msg = String.format("%d x %d = %d", numero, i, numero*i);
			System.out.println(i +"º " + msg);
			
		}
	}

}
