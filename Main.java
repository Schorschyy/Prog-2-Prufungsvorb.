import Vererbung.Gesch�ftskunde;
import Vererbung.Kunde;
import Vererbung.Privatkunde;



public class Main {
	public static void main(String[] args) {
	
		Gesch�ftskunde Kunde1 = new Gesch�ftskunde("A","B","C","D","E","F","G");
		Privatkunde Kunde2 = new Privatkunde("A","B","C","D","E","F");
		Kunde Kunde3 = new Kunde("A","B","C");
		
		System.out.println(Kunde1.getOrt());
		
	}
}