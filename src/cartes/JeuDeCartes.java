package cartes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import cartes.Probleme.Type;
import utils.Utils;

public class JeuDeCartes {
	
	private Carte[] typesDeCartes = {
			new Botte(1,Type.ACCIDENT),
			new Botte(1,Type.CREVAISON),
			new Botte(1, Type.ESSENCE),
			new Botte(1, Type.FEU),
			new FinLimite(6),
			new DebutLimite(4),
			new Attaque(5, Type.FEU),
			new Attaque(3, Type.ACCIDENT),
			new Attaque(3, Type.CREVAISON),
			new Attaque(3, Type.ESSENCE),
			new Parade(14, Type.FEU),
			new Parade(6, Type.ESSENCE),
			new Parade(6, Type.CREVAISON),
			new Parade(6, Type.ACCIDENT),
			new Borne(10, 25),
			new Borne(10, 50),
			new Borne(10, 75),
			new Borne(12, 100),
			new Borne(4, 200)
			
	};
	private List<Carte> listeCartes = new ArrayList<>();

	public JeuDeCartes() {
		
		for (Carte carte : typesDeCartes) {
			for (int i = 0; i != carte.getNombre(); i++) {
				listeCartes.add(carte);
			}
		}
		
		List<Carte> listeCartesTemp = new ArrayList<>();
		listeCartesTemp.addAll(listeCartes);
		listeCartes = Utils.melanger(listeCartes);
		
		assert(Utils.verifierMelange(listeCartes, listeCartesTemp));
	}
	
	public List<Carte> getListeCartes() {
		return listeCartes;
	}
	
	public boolean checkCount() {
		for (Carte carte : typesDeCartes) {
			int count = 0;
			
			for(ListIterator<Carte> li = listeCartes.listIterator(); li.hasNext();) {
				Object c = li.next();
				if (carte.equals(c)) {
					count ++;
				}
			}
			
			if (count != carte.getNombre()) {
				return false;
			}
		}
		
		return true;
	}

}
