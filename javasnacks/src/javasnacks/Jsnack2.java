package javasnacks;

import java.util.Scanner;

/**
 * CREA UNA CLASSE CONTOBANCARIO CON ATTRIBUTI PER 
 * NUMERO DI CONTO E SALDO.
 * IMPLEMENTA UN COSTRUTTORE CHE ACCETTA
 * IL NUMERO DI CONTO E INIZIALIZA IL SALDO A ZERO.
 * AGGIUNGI METODI PUBBLICI PER DEPOSITARE DENARO SUL CONTO,
 * PRELEVARE DENARO DAL CONTO E OTTENERE IL SALDO CORRENTE.
 */

public class Jsnack2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ContoBancario input = new ContoBancario ("IT 109820303710297310 i");
		
		
		System.out.println("Il tuo saldo è " + input.getSaldo());

		System.out.println("Hai depositato 1000 ");
		input.depositoDenaro(1000);
		System.out.println("Il tuo saldo è " + input.getSaldo());
		
		System.out.println("Hai prelevato 500 ");
		input.prelievoDenaro(500);
		System.out.println("Il tuo saldo è " + input.getSaldo());
		
		// CHECK AGGIUNTIVO
		System.out.println("Hai depositato 200 ");
		input.depositoDenaro(2000);
		System.out.println("Il tuo saldo è " + input.getSaldo());
		
		System.out.println("Hai prelevat0 100 ");
		input.prelievoDenaro(100);
		System.out.println("Il tuo saldo è " + input.getSaldo());
		
		//INSERIMENTO MANUALE DELL UTENTE
		System.out.println("quanto vuoi DEPOSITARE? : ");
		input.depositoDenaro(scan.nextDouble());
		System.out.println("Il tuo saldo ora è " + input.getSaldo());
		
		System.out.println("quanto vuoi PRELEVARE? : ");
		input.prelievoDenaro(scan.nextDouble());
		System.out.println("Il tuo saldo ora è " + input.getSaldo());
		
		System.out.println("VUOI PROSEGUIRE? : ");
		String risposta = scan.nextLine();
		RisposteUtente userRisposta = new RisposteUtente(risposta);
		userRisposta.YesorNo(scan.nextLine());

		
		
		//RisposteUtente rispostautente = new RisposteUtente (risposta);




	}

}
