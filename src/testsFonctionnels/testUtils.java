package testsFonctionnels;
import utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cartes.*;

public class testUtils {

	public static void main(String[] args) {
		
		JeuDeCartes jeuDeCartes = new JeuDeCartes();
		List<Carte> lc = new ArrayList<>();
		List<Carte> lc2 = new ArrayList<>();
		
		lc.addAll(jeuDeCartes.getListeCartes());
		lc2.addAll(lc);
		
		lc2 = Utils.melanger(lc2);
		System.out.println(lc2);
		System.out.println(lc);
		System.out.println(Utils.verifierMelange(lc, lc2));
		
		List<Integer> list = Utils.rassembler(new ArrayList<>(Arrays.asList(1,1,2,1,3)));
		List<Integer> list1 = Utils.rassembler(new ArrayList<>(Arrays.asList(1,4,3,2)));
		List<Integer> list2 = Utils.rassembler(new ArrayList<>(Arrays.asList(1,1,2,3,1)));
		List<Integer> list3 = Utils.rassembler(new ArrayList<>());
		
		
		
		System.out.println(list);
		System.out.println(Utils.verifierRassemblement(list));
		System.out.println(list1);
		System.out.println(Utils.verifierRassemblement(list1));
		System.out.println(list2);
		System.out.println(Utils.verifierRassemblement(list2));
		System.out.println(list3);
		System.out.println(Utils.verifierRassemblement(list3));
	
		                                                                          
		
	}

}
