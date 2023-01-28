package Vererbung;

public class Privatkunde extends Kunde {

	String privatkundeNachname;
	String privatkundeVoname;
	String privatkundeEmail;
	
	public Privatkunde(String adresse, String ort, String kundennummer, String privatkundeNachname, String privatkundeVoname, String privatkundeEmail) {
		super (adresse, ort, kundennummer);
		this.privatkundeNachname = privatkundeNachname;
		this.privatkundeVoname = privatkundeVoname;
		this.privatkundeEmail =privatkundeEmail;
		
	}
	
}
