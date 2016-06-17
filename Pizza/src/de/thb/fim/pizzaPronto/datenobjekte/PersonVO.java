package de.thb.fim.pizzaPronto.datenobjekte;

import java.io.Serializable;

public abstract class PersonVO implements Serializable {
    private static final long serialVersionUID = 1L;
    protected String nachname;
    protected String vorname;
    protected String strasse;
    protected int hausNr;

    public PersonVO() {
        this(null, null, null, 0);
    }

    public PersonVO(String nachname, String vorname) {
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public PersonVO(String nachname, String vorname, String strasse, int hausNr) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.strasse = strasse;
        this.hausNr = hausNr;
    }

    @Override
    public String toString() {
        StringBuilder ausgabe = new StringBuilder();
        ausgabe.append("\n");
        ausgabe.append(vorname);
        ausgabe.append(" ");
        ausgabe.append(nachname);
        ausgabe.append("\nStraße: ");
        ausgabe.append(strasse);
        ausgabe.append(" ");
        ausgabe.append(hausNr);
        return ausgabe.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hausNr;
        result = prime * result + ((nachname == null) ? 0 : nachname.hashCode());
        result = prime * result + ((strasse == null) ? 0 : strasse.hashCode());
        result = prime * result + ((vorname == null) ? 0 : vorname.hashCode());
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
        PersonVO other = (PersonVO) obj;
        if (hausNr != other.hausNr)
            return false;
        if (nachname == null) {
            if (other.nachname != null)
                return false;
        } else if (!nachname.equals(other.nachname))
            return false;
        if (strasse == null) {
            if (other.strasse != null)
                return false;
        } else if (!strasse.equals(other.strasse))
            return false;
        if (vorname == null) {
            if (other.vorname != null)
                return false;
        } else if (!vorname.equals(other.vorname))
            return false;
        return true;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausNr() {
        return hausNr;
    }

    public void setHausNr(int hausNr) {
        this.hausNr = hausNr;
    }


}
