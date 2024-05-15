package javasnacks;

import java.util.Scanner;

public class RisposteUtente {
	Scanner scan = new Scanner(System.in);
	ContoBancario input = new ContoBancario ("IT 109820303710297310 i");
	
		private String risposta;
		public String [] yes = {"Si","si","SI","YES","yes","Yes"};
		public boolean affermativo = false;
		
		public RisposteUtente (String risposta) {
			this.risposta = risposta;
		}
		
		public String YesorNo (String risposta) {
		  for (int i = 0; i < yes.length; i++ ) {
			  if (yes[i].equals(risposta)) {
				  affermativo = true;
				  break;
			  }
				
		  }
			  if (affermativo = true) {
				
				System.out.println("quanto vuoi DEPOSITARE? : ");
				input.depositoDenaro(scan.nextDouble());
				System.out.println("Il tuo saldo ora è " + input.getSaldo());
				
				System.out.println("quanto vuoi PRELEVARE? : ");
				input.prelievoDenaro(scan.nextDouble());
				System.out.println("Il tuo saldo ora è " + input.getSaldo());
				
				System.out.println("VUOI PROSEGUIRE? : ");
				RisposteUtente userRisposta = new RisposteUtente(risposta);
				userRisposta.YesorNo(scan.nextLine());
				
				
				//RisposteUtente rispostautente = new RisposteUtente (risposta);
				//rispostautente.YesorNo();
				
			} else {
				
				System.out.println("ARRIVEDERCI!");

			}
			return this.risposta;
		}
}
