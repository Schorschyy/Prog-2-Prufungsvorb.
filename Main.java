import Vererbung.Geschäftskunde;
import Vererbung.Kunde;
import Vererbung.Privatkunde;



public class Main {
	public static void main(String[] args) {
	
		Geschäftskunde Kunde1 = new Geschäftskunde("A","B","C","D","E","F","G");
		Privatkunde Kunde2 = new Privatkunde("A","B","C","D","E","F");
		Kunde Kunde3 = new Kunde("A","B","C");
		
		System.out.println(Kunde1.getOrt());
		
	}
}