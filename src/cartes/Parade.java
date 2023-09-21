package cartes;

public class Parade extends Bataille {

	public Parade(int nombre, Type type) {
		super(nombre, type);
	}

	
	@Override
	public String toString() {
		
		switch (super.getType()) {
		case FEU:
			return "FeuVert";
		case ESSENCE:
			return "Essence";
		case CREVAISON:
			return "Roue De Secours";
		default:
			return "Réparation";
		}
	}
}
