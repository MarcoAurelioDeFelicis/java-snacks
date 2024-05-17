package javasnacks;



public class RegistroStudenti {
	
	//Array vuoto
	private Studente [] studentiList;
	private int io = 0; //Casella Array
	
	//Costruttore
	public RegistroStudenti () {		
		studentiList = new Studente[5];
	}
	
	//Metodo
	public void addStudente (Studente studente) {
		if (io <studentiList.length) {
			studentiList[io] = studente;
			io ++ ;
		}
		
		
		
	}
	
	//Stampa
	public void stampaStudenti () {
		for (int i = 0; i < studentiList.length; i++) {
			System.out.println(studentiList[i].studentStringified());
			
		}
	}
}

