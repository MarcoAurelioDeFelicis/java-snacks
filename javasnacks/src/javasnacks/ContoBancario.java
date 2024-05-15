package javasnacks;

/**
 * CREA UNA CLASSE CONTOBANCARIO CON ATTRIBUTI PER 
 * NUMERO DI CONTO E SALDO. V
 * IMPLEMENTA UN COSTRUTTORE CHE ACCETTA
 * IL NUMERO DI CONTO E INIZIALIZA IL SALDO A ZERO. V
 * AGGIUNGI METODI PUBBLICI PER 
 * - DEPOSITARE DENARO SUL CONTO,
 * - PRELEVARE DENARO DAL CONTO 
 * - OTTENERE IL SALDO CORRENTE. V
 */

public class ContoBancario {
	
	private String iban;
	private double saldo;

	
	public ContoBancario(String iban) {
		this.iban = iban;
		this.saldo = 0;
	}
	
	//DEPOSITARE ...
	public double depositoDenaro (double denaro) {
		if (denaro != denaro) {
		System.out.println("RIPROVA!! quanto vuoi depositare?"+this.depositoDenaro(denaro));
		}
		
		if (denaro >= 0) {
		this.saldo += denaro;
		}
		return denaro; //RETURN SOLO CON IL DOUBLE//
	}
	
	//PRELIEVO ... (con void invece di double)
	public void prelievoDenaro (double denaro) {
		if (denaro != denaro) {
			System.out.println("RIPROVA!! quanto vuoi prelevare?");
		    this.depositoDenaro(denaro); //con void 		
			}
		
		if (denaro>= 0) {
			//versione espansa
			double denaroPrelevato = this.saldo - denaro;	
		    this.saldo = denaroPrelevato;
		    
		    //versione contratta
		    //this.saldo -= denaro;
		}
	}
	
	//SALDO CORRENTE
	public double getSaldo() {
		return this.saldo;
	}
	

}

