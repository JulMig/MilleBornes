package jeu;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.*;

public class Sabot implements Iterable<Carte>{
	Carte [] cartes;
	int nbCartes = 0;
	
	public Sabot(int nbCartes) {
		cartes = new Carte[nbCartes];
	}
	
	public boolean estVide() {
		return nbCartes == 0;
	}
	
	private void ajouterCarte(Carte carte) {
		if (nbCartes >= cartes.length) {
			throw new IllegalStateException();
		} else {
			cartes[nbCartes] = carte;
			nbCartes +=1;
		}
	}
	
	public void ajouterFamilleCarte(Carte carte) {
		for (int i = 0 ; i < carte.getNombre() ; i += 1) {
			ajouterCarte(carte);
		}
	}
	
	public void ajouterFamilleCarte(Carte... args) {
		for (Carte carte : args) {
			ajouterCarte(carte);
		}
	}
	
	private class Iterateur implements Iterator<Carte>{
		private int indiceIterateur = 0;
		private boolean nextEffectue = false;
		
		@Override
		public boolean hasNext() {
			return indiceIterateur < nbCartes;
		}
		
		@Override
		public Carte next() {
			if (hasNext()) {
				Carte carte = cartes[indiceIterateur];
				indiceIterateur += 1;
				nextEffectue = true;
				return carte;
			} else {
				throw new NoSuchElementException();
			}
		}
		
		@Override
		public void remove() {
			if (nbCartes < 1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			for (int i = indiceIterateur -1; i < nbCartes -1; i += 1) {
				cartes[i] = cartes[i+1];
			}
			
			nextEffectue = false;
			indiceIterateur -= 1;
			nbCartes -= 1;
			
		}
		
		
	}

	@Override
	public Iterator<Carte> iterator() {
		return new Iterateur();
	}
	
	public Carte piocher() {
		Iterator iterateur = iterator();
		Carte carte = iterateur.next();
		
		
		return null;
	}

}
