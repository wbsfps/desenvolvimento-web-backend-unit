package aula05ME;

public class questao5 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int resultado = somarElementos(vetor);
        System.out.println("A soma dos elementos do vetor é: " + resultado);
    }


    public static int somarElementos(int[] vetor) {
        return somarElementosRecursivo(vetor, 0);
    }


    public static int somarElementosRecursivo(int[] vetor, int indice) {

        if (indice == vetor.length) {
            return 0;
        }

        return vetor[indice] + somarElementosRecursivo(vetor, indice + 1);
    }
}
