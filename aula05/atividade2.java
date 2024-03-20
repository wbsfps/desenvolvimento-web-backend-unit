package aula05;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class atividade2 {
		public static void main(String[] args) {
			Scanner leitura = new Scanner(System.in);
			double notasDosAlunos[] = new double[10];
			int soma = 0;
			List<Double> notasAcimaDaMedia = new ArrayList();
			
			for (int i = 0; i < notasDosAlunos.length; i++) {
				
				System.out.println("Informe a nota: ");
				double adicionarNotas = leitura.nextDouble();
				notasDosAlunos[i] = adicionarNotas;
				soma += notasDosAlunos[i];
			}
			
			System.out.println("Notas: ");
			int contador = 0;
			for (double nota : notasDosAlunos) {
				if (nota >= 6) {
					notasAcimaDaMedia.add(nota);
					contador++;
				}
			}
			
			double media = soma / notasDosAlunos.length;
			System.out.println("\n");
			System.out.println("Soma: " + soma);
			System.out.println("Media: " + media);
			System.out.println("Notas acima da media: " + notasAcimaDaMedia);
			System.out.print("Quantidade de notas acima da media: " + contador);

	}
}
