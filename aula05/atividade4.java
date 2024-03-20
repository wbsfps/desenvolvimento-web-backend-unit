package aula05;


import java.util.Scanner;
import java.util.ArrayList;


public class atividade4 {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		ArrayList<Integer> listaNumeros = new ArrayList();
		
		for (int i = 0; i < 15; i++) {
			System.out.println("Informe um número: ");
			listaNumeros.add(leitura.nextInt());
		}
		
		for (int i = listaNumeros.size() - 1; i >= 0; i--) {
			System.out.println(listaNumeros.get(i));
			System.out.println("\n");
		}
		
		System.out.println(listaNumeros);
	}

}
