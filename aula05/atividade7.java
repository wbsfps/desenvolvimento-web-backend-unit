package aula05;

public class atividade7 {
	
	public static long fatorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		} else {
			return num * fatorial (num-1);
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println(fatorial(5));
	}

}
