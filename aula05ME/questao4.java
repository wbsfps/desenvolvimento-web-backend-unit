package aula05ME;

public class questao4 {
    public static int retornaMenorNumero(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if(y < x && y < z) {
            return y;
        }
        return z;
    }
    public static void main(String[] args) {
        System.out.println(retornaMenorNumero(120,100,40));
    }
}
