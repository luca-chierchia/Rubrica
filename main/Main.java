package main;
import modelli.Contatto;
import rubricaException.RubricaException;
import servizi.*;

public class Main {
	public static void main(String[] args) {
		Rubrica rubrica = new Rubrica();
		Contatto c = new Contatto("Matteo","Rossi","3225367632","matteo.rossi12@libero.it");
		Contatto c2 = new Contatto("Lara","Gomez","43423 ","lara.gomezST@gmail.com");
		String path = "C:/Users/Luca/Desktop/rubrica.csv";
		GestoreFileCsv file = new GestoreFileCsv(path);
		
		rubrica.aggiungiContatto(c2);
		rubrica.aggiungiContatto(c);
		file.scriviSuFileCsv(rubrica.getContatti());
			
	
		
	}
}
