package aula04;
import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Informe sua idade: ");
		int idade = leitura.nextInt();
		
		if (idade >= 16 && idade <= 69) {
			System.out.print("Pode doar sangue");
		} else if (idade < 16 && idade > 69) {
			System.out.println("Não pode doar sangue");
		} else {
			System.out.print("Idade inválida");
		}
		
		String verificandoIdade = (idade >= 16 && idade <= 69) ? "Pode doar sangue" : "Não pode doar";
		System.out.println(verificandoIdade);
		
		System.out.print("Em qual ano atual? ");
		
		int ano = leitura.nextInt();
		int anoDeNascimento = ano - idade;
		
		System.out.println("Você nasceu em: " + anoDeNascimento);
		leitura.close();
	}
}
