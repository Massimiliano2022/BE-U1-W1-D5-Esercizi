package gestioneDipendenti.app.entities;

public class Dipendente {
	
	public final static int stipendioBase = 1000;
	
	private String matricola;
	private int stipendio;
	private int importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
	
	public String getMatricola() {
		return matricola;
	}
	
	public int getStipendio(){
		return stipendio;
	}
	
	public int getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	
	public void setImportoOrarioStraordinario(int importoOrarioStraordinario) {
		this.importoOrarioStraordinario=importoOrarioStraordinario;
	}
	
	public Livello getLivello(){
		return livello;
	}
	
	public Dipartimento getDipartimento(){
		return dipartimento;
	}
	
	public void setDipartimento(Dipartimento dipartimento){
		this.dipartimento=dipartimento;
	}
	
	public Dipendente(String matricola, Dipartimento dipartimento){
		this.matricola=matricola;
		this.setDipartimento(dipartimento);
		this.stipendio=stipendioBase;
		this.importoOrarioStraordinario=30;
		this.livello=Livello.OPERAIO;
	}
	
	public Dipendente(String matricola,int stipendio,int importoOrarioStraordinario,Livello livello,Dipartimento dipartimento){
		this.matricola=matricola;
		this.setDipartimento(dipartimento);
		this.stipendio=stipendio;
		this.importoOrarioStraordinario=importoOrarioStraordinario;
		this.livello=livello;
		this.setDipartimento(dipartimento);
	}
	
	public void stamaDatiDipendente(){
		System.out.println("DATI DIPENDENTE:");
		System.out.println("MATRICOLA: "+matricola);
		System.out.println("STIPENDIO: "+stipendio);
		System.out.println("IMPORTO ORARIO STR: "+importoOrarioStraordinario);
		System.out.println("LIVELLO: "+livello);
		System.out.println("DIPARTIMENTO: "+dipartimento);
	}
	public Livello promuovi() {
		
		switch (livello) {
		case OPERAIO:
			livello=Livello.IMPIEGATO;
			stipendio=(int) (stipendioBase * 1.2);
			break;
		case IMPIEGATO:
			livello=Livello.QUADRO;
			stipendio=(int) (stipendioBase * 1.5);
			break;
		case QUADRO:
			livello=Livello.DIRIGENTE;
			stipendio=stipendioBase * 2;
			break;
		default:
			System.out.println("Il dipendente è già un Dirigente e non può essere promosso.");
			break;
		}
		return livello;
	}
	
	public static int calcolaPaga(Dipendente d){
		return d.stipendio;
	}
	
	public static int calcolaPaga(Dipendente d,int oreStraordinario){
		
		int importoTotaleOreStr=oreStraordinario * d.importoOrarioStraordinario;
		
		d.stipendio+=importoTotaleOreStr;
		
		return d.stipendio;
	}
}
