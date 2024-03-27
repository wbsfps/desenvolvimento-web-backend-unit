package aula6;

public class Main {
	public static void main(String[] args) {
	    Tamagoshi t1 = new Tamagoshi();
	    t1.changeName("Naruto");
	    t1.setHunger(true);
	    System.out.println(t1.getHunger());
	    t1.showAge(6);
	    System.out.println();
	    Tamagoshi t2 = new Tamagoshi();
	    t2.changeName("Yasuo");
	    t2.setHunger(false);
	    System.out.println(t2.getHunger());
	    t2.showAge(10);
	    }
}
