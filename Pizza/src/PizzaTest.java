import java.awt.Color;
import java.time.LocalDate;

public class PizzaTest {

	public static void main(String[] args) {
		LocalDate geb = LocalDate.of(1988, 1, 16);
		
		KundeVO einKunde = new KundeVO("M�ller", "Gerd", "m�nnlich", geb);
		KundeVO nocheinKunde = new KundeVO("TT", "AS", "weiblich", geb);
		System.out.println(einKunde);
		System.out.println(nocheinKunde);
		
		KochVO einKoch = new KochVO("Dampf", "Voll", Color.BLACK);
		System.out.println(einKoch.getVorname() + einKoch.getNachname());
		
		
		String[] zutaten = {"Tomatensauce","K�se","Peperoni"};
		PizzaVO meinePizza = new PizzaVO("Peperoni", 8.5F,zutaten);
		PizzaVO test = (PizzaVO)meinePizza.clone();
		String[] a = {"Zeug", "Nuss", "Eis"};
		test.setZutaten(a);
		
		System.out.println(test);
		
		
		System.out.println(meinePizza);
		
		
		
		

	}

}
