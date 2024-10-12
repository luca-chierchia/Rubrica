package modelli;

public class Contatto {
	public String nome;
	public String cognome;
	public String telefono;
	public String email;
	
	public Contatto(String n,String c,String t,String e) {
		this.nome = n;
		this.cognome = c;
		this.email = e;
		this.telefono = t;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Contatto: " + this.nome + " " + this.cognome + " " + "\n\t" 
				+ "Telefono: " + this.telefono + "\n\t"
				+ "Email: " + this.email + "\n";
	}
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * 17 + this.nome.hashCode();
		result = 31 * 17 + this.cognome.hashCode();
		return result = 31 * 17 + this.email.hashCode();
		
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(this == null || this.getClass() != obj.getClass())
			return false;
		Contatto contatto = (Contatto) obj;
		return this.getNome().equals(contatto.getNome()) && this.getCognome().equals(contatto.getCognome()) && this.getTelefono().equals(contatto.getTelefono());
	}

	
	
}
