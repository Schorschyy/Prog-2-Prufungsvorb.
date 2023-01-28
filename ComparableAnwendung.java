package Interface;

import java.util.ArrayList;
import java.util.List;

public class ComparableAnwendung {
	public static void main(String args[]) {
		
		List<Person> personenliste = new ArrayList<Person>();
		
		personenliste.add(new Person(1, 1.55, "Müller"));
		personenliste.add(new Person(2, 1.95, "Schulze"));
		personenliste.add(new Person(3, 1.80, "Lehmann"));
		
		// Sortierung durchfuehren
		
		// hier soll eine bereits in Java vorhandene Methode aufgerufen werden
		
		System.out.println("Personen = "+personenliste.toString());
		}
}
