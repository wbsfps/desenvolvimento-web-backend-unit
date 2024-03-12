package aula04;
import java.util.Scanner;
public class atividade3 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		int idade = leitura.nextInt();
		
		if (idade >= 18 && idade <= 69) {
			System.out.println("Pode doar");
		} else if (idade >= 16 && idade < 18) {
			System.out.println("Só pode doar com autorização");
		} else {
			System.out.print("Não pode doar");
		}
		leitura.close();
	}
}
