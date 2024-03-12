package aula04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	
	public class atividade {
	    public static void main(String[] args) {
	        Scanner leitura = new Scanner(System.in);

	        System.out.println("Informe um número e informarei se ele é positivo ou negativo: ");
	        int numero = leitura.nextInt();

	        if (numero > 0) {
	            System.out.println("Positivo");
	        } else if (numero ==0) {
	            System.out.println("Igual a zero");
	        } else {
	            System.out.println("Negativo");
	        }

	        System.out.println("Informe um número para formar a tabuada dele: ");
	        int numeroTabuada = leitura.nextInt();
	        for (int i = 0; i <= 10; i++) {
	            String msg = String.format("%d x %d = %d", numeroTabuada, i, numeroTabuada*i);
	            System.out.println(msg);
	        }
	        List<Integer> listaNumeros = new ArrayList<>();
	        for (int i = 0; i <= 3; i++) {
	            listaNumeros.add(i);
	        }
	        Collections.sort(listaNumeros);
	        System.out.println(listaNumeros);
	    }
	}

}
