package servizi;
import modelli.Contatto;
import java.io.*;
import java.util.List;
import java.util.ArrayList;

//Codice da commentare
public class GestoreFileCsv {
	public String filePath; // percorso del file da leggere/scrivere
	
	public GestoreFileCsv(String p) {
		this.filePath = p;	
	}
	
	public void scriviSuFileCsv(List<Contatto> contatti) {
		 try (BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8"))){
			for(Contatto contatto : contatti) {
				wr.write(contatto.getNome()+","+ contatto.getCognome()+","+ contatto.getTelefono()+","+ contatto.getEmail());
				wr.newLine();
			}
			System.out.println("Scrittura su file CSV completata");
		}catch(IOException e) {
			System.out.println("Errore durante la scrittura del file, "+ e.getMessage());		
		}
	}
	
	public List<Contatto> leggiDaFileCsv(){
		List<Contatto> contatti = new ArrayList<>();
		try(BufferedReader rd = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
			String line;
			while((line = rd.readLine()) != null) {
				String[] valori = line.split(",");	
				if(valori.length == 4) {
					Contatto contatto = new Contatto(valori[0],valori[1],valori[2],valori[3]);
					contatti.add(contatto);
				}
			}
			System.out.println("Lettura completata con successo");
			
		}catch(IOException e) {
			System.out.println("Errore lettura da file CSV, " + e.getMessage());
		}
		return  contatti;
	}
	
	public void aggiungiContattoSulFileCsv(Contatto contatto) {
		List<Contatto> contatti = leggiDaFileCsv();
		contatti.add(contatto);
		this.scriviSuFileCsv(contatti);
		
	}
}
