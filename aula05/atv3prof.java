package aula05;

import java.util.Scanner;

public class atv3prof {

	public static void main(String[] args) {
			Scanner leitura = new Scanner(System.in);
			int matriz3Por3[][] = new int[3][3];
			int contador = 0;
			
			for(int i = 0; i < matriz3Por3.length; i++) {
				for(int j = 0; j < matriz3Por3[i].length; j++) {
					System.out.println("Informe o valor: " + i + "coluna: " + j);
					matriz3Por3[i][j] = leitura.nextInt();
					if (matriz3Por3[i][j] > 10) {
						contador++;
					}
				}
			}
			System.out.println(contador + " são valores maiores que 10");
	}

}
