package aula6;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	
	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void crescer(double valor) {
		this.height += valor;
	}
	public void ganharMassa(double valor) {
		this.weight += valor;
	}
	
	public void emagrecer(double valor) {
		this.weight -= valor;
	}
	public void envelhecer() {
		if (age < 21) {
			this.age++;
			crescer(0.05);
		}
		
	}
	
}
