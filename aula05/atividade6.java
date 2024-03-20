package aula05;

public class atividade6 {
	public static int soma(int a, int b) {
		return a + b;
	}
	
	public static int soma(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void parOuImpar(int num) {
		if(num % 2 == 0) {
			System.out.print("Par");
		} else {
			System.out.println("Impar");
		}
	}
	
	public static void main (String[] args) {
		System.out.println(soma(7,5));
		System.out.println(soma(7,5, 2));
		parOuImpar(89);
	}
}
