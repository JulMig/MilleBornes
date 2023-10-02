package jeu;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import cartes.*;

public class Sabot implements Iterable<Carte> {
	private Carte[] cartes;
	private int nbCartes = 0;
	private int nombreOperations = 0;

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
			nbCartes++;
			nombreOperations++;
		}
	}

	public void ajouterFamilleCarte(Carte carte) {
		for (int i = 0; i < carte.getNombre(); i ++) {
			ajouterCarte(carte);
		}
	}

	public void ajouterFamilleCarte(Carte... args) {
		for (Carte carte : args) {
			ajouterCarte(carte);
		}
	}

	private class Iterateur implements Iterator<Carte> {
		private int indiceIterateur = 0;
		private boolean nextEffectue = false;
		private int nombreOperationReference = nombreOperations;

		@Override
		public boolean hasNext() {
			return indiceIterateur < nbCartes;
		}

		@Override
		public Carte next() {

			verificationConcurrence();

			if (hasNext()) {
				Carte carte = cartes[indiceIterateur];
				indiceIterateur ++ ;
				nextEffectue = true;
				return carte;
			} else {
				throw new NoSuchElementException();
			}
		}

		@Override
		public void remove() {

			verificationConcurrence();

			if (nbCartes < 1 || !nextEffectue) {
				throw new IllegalStateException();
			}
			for (int i = indiceIterateur - 1; i < nbCartes - 1; i ++) {
				cartes[i] = cartes[i + 1];
			}

			nextEffectue = false;
			indiceIterateur -- ;
			nbCartes -- ;
			nombreOperations ++ ;
			nombreOperationReference ++ ;

		}

		private void verificationConcurrence() {
			if (nombreOperations != nombreOperationReference) {
				throw new ConcurrentModificationException();
			}
		}

	}

	@Override
	public Iterator<Carte> iterator() {
		return new Iterateur();
	}

	public Carte piocher() {
		Iterator<Carte> iterateur = iterator();
		Carte carte = iterateur.next();
		iterateur.remove();

		return carte;
	}

}
