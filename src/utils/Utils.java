package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;


public class Utils {
	static Random random = new Random();

	public static <T> T extraire(List<T> list){
		int i = random.nextInt(0,list.size());
		T elem = list.get(i);
		list.remove(i);
		
		return elem;
	}
	
	public static <T> T extraireIterator(List<T> list){
		int r = random.nextInt(0,list.size());
		ListIterator<T> li = list.listIterator();
		T elem = li.next();
		
		for(int i = 0; i != r; i++){
			elem = li.next();
		}
		
		li.remove();
		return elem;
	}
	
	public static <T> List<T> melanger(List<T> list){
		int s = list.size();
		List<T> result = new ArrayList<>();
		
		for(int i = 0; i < s; i++) {
			result.add(extraire(list));
		}
		
		return result;
	}
	
	public static <T> boolean verifierMelange(List<T> l1, List<T> l2) {
		if (l1.size() != l2.size()) {
			return false;
		}
		boolean result = true;
		for(ListIterator<T> li = l1.listIterator(); li.hasNext();) {
			T elem = li.next();
			result &= (Collections.frequency(l1, elem) == Collections.frequency(l2, elem));
			
		}
		return result;
	}
	
	public static <T> List<T> rassembler(List<T> list){
		List<T> result = new ArrayList<>();
		
		for (T cur : list) {
			if (result.contains(cur)){
				result.add(result.indexOf(cur), cur);
			} else {
				result.add(cur);
			}
		}
		
		return result;
		
	}
	
	public static <T> boolean verifierRassemblement(List<T> list) {
		
		boolean result = true;
		boolean cons = true;
		
		for(ListIterator<T> i = list.listIterator(); i.hasNext();) {
			T curi = i.next();
			if (i.hasNext()) {
				for(ListIterator<T> j = list.listIterator(i.nextIndex()); j.hasNext();) {
						T curj = j.next();
						if (!curj.equals(curi)) {
							cons = false;
						} else if (!cons) {
							result = false;
						}
				}
				cons = true;
			}
		}
			
		
		
		return result;
		
	}
	


}
