package Interface;

public class Person {
	public int id;
	public double groesse;
	public String name;
	
	public Person(int id, double groesse, String name) {
		this.id=id;
		this.groesse=groesse;
		this.name=name;
	
	}
	
	@Override
	public String toString() {
		return "[ " + id + ", " + groesse + ", " + name + "]";
	}
}
