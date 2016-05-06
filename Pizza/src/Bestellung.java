import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Bestellung {
	private LocalDateTime zeitstempelBestellung;
	private LocalDateTime zeitstempelAuslieferung;
	private int index;
	private PizzaVO[] warenkorb;
	private KundeVO kunde;
	
	private static final int  MAX_GERICHTE = 10;
	
	public Bestellung(LocalDateTime bestellung, LocalDateTime auslieferung, KundeVO kunde) {
		this.zeitstempelBestellung = bestellung;
		this.zeitstempelAuslieferung = auslieferung;
		this.kunde = kunde;
		index = 0;
		warenkorb = new PizzaVO[MAX_GERICHTE];		
	}
	
	public Bestellung() {
		this(null,null,null);
	}
	
	public void hinzufuegenGericht(PizzaVO gericht){
		warenkorb[index++] = gericht;
	}
	
	public void loescheLetztesGericht(){
		warenkorb[--index] = null;
	}
	
	public PizzaVO getGericht(int index){
		return warenkorb[index];
	}
	
	public int getAnzGerichte(){
		return index;
	}
		
	public String toString() {
		String wk = "";
		for (PizzaVO position : warenkorb) {
			if (position != null)
				wk += position + "\n";
		}

		return "Bestellung vom " + zeitstempelBestellung.format(DateTimeFormatter.ofPattern("dd.MMM.yyyy hh:ss"))
				+ " mit Lieferung am "
				+ zeitstempelAuslieferung.format(DateTimeFormatter.ofPattern("dd.MMM.yyyy.hh.ss")) + "\n"
				+ this.kunde.getVorname() + " " + this.kunde.getNachname() + " Kundennummer: " + this.kunde.getId()
				+ "\n" + wk;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + index;
		result = prime * result + Arrays.hashCode(warenkorb);
		result = prime * result + ((zeitstempelAuslieferung == null) ? 0 : zeitstempelAuslieferung.hashCode());
		result = prime * result + ((zeitstempelBestellung == null) ? 0 : zeitstempelBestellung.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bestellung other = (Bestellung) obj;
		if (index != other.index)
			return false;
		if (!Arrays.equals(warenkorb, other.warenkorb))
			return false;
		if (zeitstempelAuslieferung == null) {
			if (other.zeitstempelAuslieferung != null)
				return false;
		} else if (!zeitstempelAuslieferung.equals(other.zeitstempelAuslieferung))
			return false;
		if (zeitstempelBestellung == null) {
			if (other.zeitstempelBestellung != null)
				return false;
		} else if (!zeitstempelBestellung.equals(other.zeitstempelBestellung))
			return false;
		return true;
	}

	public LocalDateTime getZeitstempelBestellung() {
		return zeitstempelBestellung;
	}
	
	public void setZeitstempelBestellung(LocalDateTime zeitstempelBestellung) {
		this.zeitstempelBestellung = zeitstempelBestellung;
	}
	
	public LocalDateTime getZeitstempelAuslieferung() {
		return zeitstempelAuslieferung;
	}
	
	public void setZeitstempelAuslieferung(LocalDateTime zeitstempelAuslieferung) {
		this.zeitstempelAuslieferung = zeitstempelAuslieferung;
	}
	
	public PizzaVO[] getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(PizzaVO[] warenkorb) {
		this.warenkorb = warenkorb;
	}

	public int getIndex() {
		return index;
	}

	public static int getMaxGerichte() {
		return MAX_GERICHTE;
	}

	public KundeVO getKunde() {
		return kunde;
	}

	public void setKunde(KundeVO kunde) {
		this.kunde = kunde;
	}	
}