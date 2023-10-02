package cartes;

public abstract class Probleme extends Carte {

	public enum Type {FEU,ESSENCE,CREVAISON,ACCIDENT};
	private Type type;
	
	protected Probleme(int nombre, Type type) {
		super(nombre);
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Probleme) {
			Probleme p = (Probleme) obj;
			return type.equals(p.getType());
		} else {
			return false;
		}
	}

}
