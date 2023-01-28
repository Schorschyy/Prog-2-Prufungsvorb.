package Vererbung;

public class Geschäftskunde extends Kunde{

	
	
	String ansprechpartnerVorname;
	String ansprechpartnerNachname;
	String unternehmen;
	String abteilung;

	public Geschäftskunde(String adresse, String ort, String kundennummer, String ansprechpartnerVorname, String ansprechpartnerNachname, String unternehmen, String abteilung) {
		super (adresse, ort, kundennummer);
		this.ansprechpartnerVorname = ansprechpartnerVorname;
		this.ansprechpartnerNachname = ansprechpartnerNachname;
		this.unternehmen = unternehmen;
		this.abteilung = abteilung;
		
	}

	public String getUnternehmen() {
		return this.unternehmen;
	}

	public void setUnternehmen(String newUnternehmen) {
		this.unternehmen = newUnternehmen;
	}

	public String getOrt() {
		return  this.ort;
	}
	
	public void setOrt(String newOrt) {
		this.ort = newOrt;
	}

}
