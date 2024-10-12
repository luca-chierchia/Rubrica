package main;
import modelli.Contatto;
import rubricaException.RubricaException;
import servizi.*;

public class Main {
	public static void main(String[] args) {
		Rubrica rubrica = new Rubrica();
		Contatto c = new Contatto("Matteo","Rossi","3225367632","matteo.rossi12@libero.it");
		Contatto c2 = new Contatto("Lara","Gomez","43423 ","lara.gomezST@gmail.com");
		
		System.out.println(c.toString());
		System.out.println(c2.toString());
		
		int a = c.hashCode();
		int b = c2.hashCode();
		System.out.println("Hashcode di c: " + a + "\n" + "Hashcode di c2: " + b);
		rubrica.cercaContatto(c2);
		rubrica.aggiungiContatto(c);
		try {
			
			rubrica.aggiungiContatto(c);
			
		}catch(RubricaException e) {
			
			System.out.println(e.getMessage());
		}
		rubrica.modificaContatto(c, "Susino", null, null, "susino.rossi12@hotmail.com");
		rubrica.visualizzaContatti();
		rubrica.rimuoviContatto(c);
		rubrica.visualizzaContatti();
		
	}
}
