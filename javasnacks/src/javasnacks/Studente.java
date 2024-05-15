package javasnacks;

/**
 * scrivi una classe studente con i seguenti attributi:
 * nome, cognome, età.
 * implementa un costruttore che accetta tre parametri per 
 * inizializzare questi attributi.
 * aggiungi un metodo che restituisce una stringa concatenate dei valori
 * (es. *Anselmo Bitta, 24 anni*).
 */

public class Studente {

	private String  name;
	
	private String surname; 
	
	private int age;
	
	//COSTRUTTORE
	public Studente(String name, String surname, int age ) {
		//INIZIALIZZAZIONE
		
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	//CREAZIONE METODO
	public String StudentStringified () {
		return name + " " + surname + ", " + age + " anni";
	}
}
