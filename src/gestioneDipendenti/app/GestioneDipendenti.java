package gestioneDipendenti.app;

import gestioneDipendenti.app.entities.Dipartimento;
import gestioneDipendenti.app.entities.Dipendente;
import gestioneDipendenti.app.entities.Livello;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		int totaleStipendiDipendenti=0;
		
		Dipendente operaio1 = new Dipendente("0001",Dipartimento.PRODUZIONE);
		Dipendente operaio2 = new Dipendente("0002",Dipartimento.PRODUZIONE);
		Dipendente impiegato = new Dipendente("0003",1300,15,Livello.IMPIEGATO,Dipartimento.AMMINISTRAZIONE);
		Dipendente dirigente = new Dipendente("0004",1500,20,Livello.DIRIGENTE,Dipartimento.VENDITE);
		
		operaio2.promuovi();
		impiegato.promuovi();
		
		Dipendente[] listaDipendenti = {operaio1,operaio2,impiegato,dirigente};
		
		for(Dipendente dipendente : listaDipendenti) {
			
			Dipendente.calcolaPaga(dipendente,5);
			dipendente.stamaDatiDipendente();
			
			totaleStipendiDipendenti+=dipendente.getStipendio();
		}		
		
		System.out.println("Il totale degli stipendi pagati ai dipendenti è :"+totaleStipendiDipendenti);
		
	}

}
