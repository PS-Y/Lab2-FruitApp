package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fl=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		fl.add(new Fruit(101, "Apple", 1000));
		fl.add(new Fruit(102, "Orange", 1500));
		fl.add(new Fruit(103, "Banana", 4000));
		fl.add(new Fruit(104, "Watermelon", 18000));
		fl.add(new Fruit(105, "Melon", 10000));
		fl.add(new Fruit(106, "Pineapple", 8000));
		fl.add(new Fruit(107, "Mandarin", 7000));
		fl.add(new Fruit(109, "Pear", 2500));
		fl.add(new Fruit(110, "Mango", 1200));
		fl.add(new Fruit(112, "Plum", 4500));
		
		Collections.sort(fl, new FruitComparator());
		for(Fruit f : fl) {
			System.out.println(f.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}

}
