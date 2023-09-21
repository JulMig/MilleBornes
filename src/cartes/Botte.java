package cartes;

public class Botte extends Probleme {

	public Botte(int nombre, Type type) {
		super(nombre, type);
	}
	
	@Override
	public String toString() {
		switch (super.getType()) {
		case FEU:
			return "VéhiculePrioritaire";
		case ESSENCE:
			return "CiterneEssence";
		case CREVAISON:
			return "Increvable";
		default:
			return "AsDuVolant";
		}
	}

}
