package aula04;

import java.util.Scanner;

public class atividade4 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int primeiroNumero = leitura.nextInt();
		System.out.println("Informe o segundo número: ");
		int segundoNumero = leitura.nextInt();
		System.out.println("Informe a operação que será feita: ");
		char operacao = leitura.next().charAt(0);
		
		int soma = primeiroNumero + segundoNumero;
		int subtracao = primeiroNumero - segundoNumero;
		int multiplicacao = primeiroNumero * segundoNumero;
		double divisao = primeiroNumero / segundoNumero;
		int restoDaDivisao = primeiroNumero % segundoNumero;
		
		switch (operacao) {
		case '+':
			System.out.println("Soma: " + soma);
			break;
		case '-':
			System.out.println("Subtração: " + subtracao);
			break;
		case '*':
			System.out.println("Multiplicação: " + multiplicacao);
			break;
		case '/': 
			System.out.println("Divisão: " + divisao);
			break;
		case '%':
			System.out.println("Resto da divisão: " + restoDaDivisao);
			break;
		default:
			System.out.println("Operação inválida!");
		}
		
		leitura.close();
	}
}
