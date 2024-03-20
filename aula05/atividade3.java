package aula05;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int matriz3Por3[][] = new int[3][3];
		int contador = 0;
		
		for (int i = 0; i < matriz3Por3.length; i++) {
			System.out.println("Informe um número: ");
			int adicionarNumero = leitura.nextInt();
			matriz3Por3[i][i] = adicionarNumero;
			
			if (matriz3Por3[0][0] > 0 && matriz3Por3[0][1] != 10) {
				contador++;
			}
			
			if (matriz3Por3[1][0] > 0 && matriz3Por3[1][1] != 10) {
				contador++;
			}
			
			if (matriz3Por3[2][0] > 0 && matriz3Por3[2][1] != 10) {
				contador++;
			}
			
			System.out.print(contador);
		}
	}

}
