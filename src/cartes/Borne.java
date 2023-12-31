package cartes;

public class Borne extends Carte {

	private int km;
	
	public Borne(int nombre, int km) {
		super(nombre);
		this.km = km;
	}
	
	public int getKm() {
		return km;
	}
	
	@Override
	public String toString() {
		return Integer.toString(km);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Borne) {
			Borne b = (Borne) obj;
			return km == b.getKm();
			
		} else {
			return false;
		}
	}

}
