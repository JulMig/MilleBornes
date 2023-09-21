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
			name = "PanneEssence";
			break;
		case CREVAISON:
			name = "Creuvaison";
			break;
		default:
			name = "ACCIDENT";
			break;
		}
		
	return name;
		
	}

}
