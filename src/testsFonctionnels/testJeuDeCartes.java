package testsFonctionnels;

import cartes.JeuDeCartes;

import java.util.List;
import java.util.ListIterator;

import cartes.Carte;

public class testJeuDeCartes {

	
	public static void main(String[] args) {
		
		JeuDeCartes jdc = new JeuDeCartes();
		List<Carte> l = jdc.getListeCartes();
	
		for(ListIterator li = l.listIterator(); li.hasNext();) {
			System.out.println(li.next());
		}
		
		System.out.println(jdc.checkCount());
	
	}
	

}
