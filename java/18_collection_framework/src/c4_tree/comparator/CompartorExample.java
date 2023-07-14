package c4_tree.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class CompartorExample {
	
	public static void main(String[] args) {
		Comparator<Fruit> compare = new DecendingComparator();
		
		TreeSet<Fruit> set = new TreeSet<>(compare);
		set.add(new Fruit("포도",3000));
		set.add(new Fruit("딸기",1500));
		set.add(new Fruit("수박",10000));
		System.out.println(set);
		
		Comparator<Fruit> compare2 = new Comparator<>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};
		
		TreeSet<Fruit> set2 = new TreeSet<>(compare2);
		set2.add(new Fruit("포도",3000));
		set2.add(new Fruit("딸기",1500));
		set2.add(new Fruit("수박",10000));
		System.out.println(set2);
			
		TreeSet<Fruit> set3 = new TreeSet<>(new Comparator<>() {
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o1.getPrice() - o2.getPrice();
			}
		});
		
	}
	
}
