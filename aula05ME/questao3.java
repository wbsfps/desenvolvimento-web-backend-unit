package aula05ME;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int matriz3Por3[][] = new int[3][3];

        for (int i = 0; i < matriz3Por3.length; i++) {
            for (int j = 0; j < matriz3Por3[i].length; j++) {
                System.out.println("Informe o valor para a linha: " + i + " coluna: " + j);
                matriz3Por3[i][j] = leitura.nextInt();
                int mulutiplicandoOsElementos = matriz3Por3[i][j] * 5;
                System.out.println(mulutiplicandoOsElementos);
            }
        }
    }
}
