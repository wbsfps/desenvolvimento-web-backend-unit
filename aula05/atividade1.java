package aula05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class atividade1 {
		    public static void main(String[] args) {
	        Scanner leitura = new Scanner(System.in);
	        Integer vetor[] = new Integer [15];

	        for (int i = 0; i < vetor.length; i++) {
	            System.out.println("Informe um numero: ");
	            int adicionarNumero = leitura.nextInt();
	            vetor[i] = adicionarNumero;
	        }
	        Arrays.sort(vetor, Collections.reverseOrder());
	        System.out.println("\n");
	        System.out.println("Elementos do vetor: ");
	        for (int numero : vetor) {
	            System.out.println(numero);
	        }

	    }
}

