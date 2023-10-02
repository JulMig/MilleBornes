package cartes;

public class Botte extends Probleme {

	public Botte(int nombre, Type type) {
		super(nombre, type);
	}
	
	@Override
	public String toString() {
		switch (super.getType()) {
		case FEU:
			return "Véhicule Prioritaire";
		case ESSENCE:
			return "Citerne D'Essence";
		case CREVAISON:
			return "Increvable";
		default:
			return "As Du Volant";
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Botte) {
			Botte b = (Botte) obj;
			return super.equals(b);
		} else {
			return false;
		}
	}

}
