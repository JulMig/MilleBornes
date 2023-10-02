package testsFonctionnels;
import cartes.*;
import cartes.Probleme.Type;
import jeu.*;

public class testsEquals {

	public static void main(String[] args) {
		Attaque atq = new Attaque(2, Type.ACCIDENT);
		Attaque atq2 = new Attaque(3, Type.CREVAISON);
		Attaque atq3 = new Attaque(3, Type.ACCIDENT);
		Borne b = new Borne(3,3);
		DebutLimite dl = new DebutLimite(2);
		FinLimite fl = new FinLimite(2);
		Parade p = new Parade(3,Type.ACCIDENT);
		
		System.out.println(atq.equals(atq2)); //false
		System.out.println(atq.equals(atq3)); //true
		System.out.println(atq.equals(b)); //false
		System.out.println(p.equals(atq)); //false
		System.out.println(dl.equals(fl)); //false
	}

}
