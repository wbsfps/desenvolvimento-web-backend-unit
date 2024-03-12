package aula04;
import java.util.Scanner;
public class atividade1 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Informe a distância em KM: ");
		double distancia = leitura.nextDouble();
		System.out.println("Informe o tempo em horas: ");
		double tempoEmHoras = leitura.nextDouble();	
		
		double velocidadeMedia = distancia / tempoEmHoras;
		
		if (velocidadeMedia > 120) {
			System.out.println("Multa");
		} else {
			System.out.println("Sem multa");
		}
		
		leitura.close();
	}
}
