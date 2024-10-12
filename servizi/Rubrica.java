package servizi;
import java.util.*;
import modelli.Contatto;
import rubricaException.RubricaException;

public class Rubrica  {
	private List<Contatto> rubrica;
	
	public Rubrica(){
		this.rubrica = new ArrayList<Contatto>();
	}
	
	public void aggiungiContatto(Contatto c) throws RubricaException {
		if(!rubrica.contains(c)) {
			rubrica.add(c);
			System.out.println(c.getNome()+" "+ c.getCognome() +" aggiunto\n");
		}
			
		else
			throw new RubricaException("Contatto già esistente\n");
	};
	public void rimuoviContatto(Contatto c) throws RubricaException {
		if(rubrica.contains(c)) {
			rubrica.remove(c);
			System.out.println(c.getNome()+" "+ c.getCognome() +" rimosso\n");}
		else
			throw new RubricaException("Contatto non trovato\n");
	};
	public void modificaContatto(Contatto c,String n, String cn, String t, String e) {
		if(rubrica.isEmpty()) {
			System.out.println("Rubrica vuota\n");
			return;
		}
		if(rubrica.contains(c)) {
			String vecchioNome = c.getNome();
			String vecchioCognome = c.getCognome();
			String vecchioTelefono = c.getTelefono();
			String vecchiaEmail = c.getEmail();
			
			 // Aggiorna i campi solo se i nuovi valori non sono null o vuoti
	        if (n != null && !n.trim().isEmpty()) {
	            c.setNome(n);
	        }
	        if (cn != null && !cn.trim().isEmpty()) {
	            c.setCognome(cn);
	        }
	        if (t != null && !t.trim().isEmpty()) {
	            c.setTelefono(t);
	        }
	        if (e != null && !e.trim().isEmpty()) {
	            c.setEmail(e);
	        }

	        System.out.println("Modifiche effettuate sul contatto:");
	        if (!vecchioNome.equals(c.getNome())) {
	            System.out.println("Nome cambiato da " + vecchioNome + " a " + c.getNome());
	        }
	        if (!vecchioCognome.equals(c.getCognome())) {
	            System.out.println("Cognome cambiato da " + vecchioCognome + " a " + c.getCognome());
	        }
	        if (!vecchioTelefono.equals(c.getTelefono())) {
	            System.out.println("Telefono cambiato da " + vecchioTelefono + " a " + c.getTelefono());
	        }
	        if (!vecchiaEmail.equals(c.getEmail())) {
	            System.out.println("Email cambiata da " + vecchiaEmail + " a " + c.getEmail());
	        }

	        System.out.println("Modifica completata: " + c);

	    } else {
	        System.out.println("Contatto non trovato\n");
	    }
	};
	
	public void cercaContatto(Contatto c) {
		if(rubrica.contains(c)) {
			System.out.println("Contatto trovato\n");
			c.toString();
		}
		else
			System.out.println("Contatto non trovato\n");
	};
	
	public void visualizzaContatti() {
		if(rubrica.isEmpty())
			System.out.println("Rubrica vuota\n");
		
		Iterator<Contatto> i = rubrica.iterator();
		
		while(i.hasNext()) {
			Contatto contatto = i.next();
			System.out.println(contatto.toString());
		}
	};
	
	
}
