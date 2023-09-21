package cartes;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
	}
	
	@Override
	public String toString() {
		String name;
	
		switch (super.getType()) {
		case FEU:
			name = "FeuRouge";
			break;
		case ESSENCE:
			name = "Panne D'Essence";
			break;
		case CREVAISON:
			name = "Creuvaison";
			break;
		default:
			name = "Accident";
			break;
		}
		
	return name;
		
	}

}
