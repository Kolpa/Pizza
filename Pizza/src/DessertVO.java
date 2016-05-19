
public class DessertVO extends GerichtVO{

    public DessertVO() {
        this(0, "", 0.0f);
    }

    public DessertVO(int nummer, String name, float preis) {
        super(nummer, name, preis);
    }

    @Override
    public int getGerichtNummer() {
        return nummer;
    }

    @Override
    public String getGerichtName() {
        return name;
    }
}