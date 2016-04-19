import java.awt.Color;

public class KochVO {
	private String nachname;
	private String vorname;
	private Color farbeSchuerze;
	
	public KochVO(String nachname, String vorname, Color farbeSchuerze){
		setNachname(nachname);
		setVorname(vorname);
		setFarbeSchuerze(farbeSchuerze);
	}
	
	public KochVO(){
		this("Maserati","Bruno", Color.BLACK);
	}
	
	public void setNachname(String nachname){
		if (nachname != "")
			this.nachname = nachname;
	}
	
	public String getNachname(){
		return nachname;
	}
	
	public void setVorname(String vorname){
		if (vorname != "")
			this.vorname = vorname;
	}
	
	public String getVorname(){
		return vorname;
	} 
	
	public void setFarbeSchuerze(Color farbeSchuerze){
		if (farbeSchuerze != null)
			this.farbeSchuerze = farbeSchuerze;
	}
	
	public Color getFarbeSchuerze(){
		return farbeSchuerze;
	}
	
	
}
