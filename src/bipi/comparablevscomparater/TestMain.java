package bipi.comparablevscomparater;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		
		
		List<Laptop> lapList= new ArrayList<>();
		lapList.add(new Laptop("Dell", 8, 800));
		lapList.add(new Laptop("Acer", 6, 600));
		lapList.add(new Laptop("Apple", 12, 1200));
		lapList.add(new Laptop("Lenovo", 8, 1000));
		
		// We need to short list based on condition 
		
//		Comparator<Laptop> comparator = new Comparator<Laptop>() {
//			
//			@Override
//			public int compare(Laptop o1, Laptop o2) {
//				
//				if(o1.getRam() > o2.getRam()) {
//					
//					return 1;
//				}else {
//					return -1;
//				}
//			}
//		};
//		
//		Collections.sort(lapList, comparator);
		
		
		Collections.sort(lapList);
		
		for (Laptop laptop: lapList) {
			
			System.out.println(laptop.toString());
		}

	}

}
