package testsFonctionnels;
import java.util.Iterator;

import cartes.*;
import cartes.Probleme.Type;
import jeu.*;

public class SabotTest {
	
	public static void main(String[] args) {
		Sabot sabot = new Sabot(7);
		Attaque accident = new Attaque(3, Type.ACCIDENT);
		Parade rep = new Parade(3, Type.ACCIDENT);
		Botte as = new Botte(1, Type.ACCIDENT);
		

		sabot.ajouterFamilleCarte(accident);
		sabot.ajouterFamilleCarte(rep);
		sabot.ajouterFamilleCarte(as);
		
		while(!sabot.estVide()) {
			System.out.println("Je pioche " + sabot.piocher());
		}
		

		
		sabot.ajouterFamilleCarte(accident);
		sabot.ajouterFamilleCarte(rep);
		sabot.ajouterFamilleCarte(as);
		
		for (Iterator<Carte> it = sabot.iterator(); it.hasNext();) {
			Carte c = it.next();
			it.remove();
			

		}
		
		
		sabot.ajouterFamilleCarte(as);
		System.out.println(sabot.piocher());
		
		
	}

}
