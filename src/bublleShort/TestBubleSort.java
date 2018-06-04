package bublleShort;

import java.util.Date;

public class TestBubleSort {

	public static void main(String[] args) {

		BubleSort bubleSort = new BubleSort();
		
		bubleSort.insert(77);
		bubleSort.insert(99);
		bubleSort.insert(44);
		bubleSort.insert(55);
		bubleSort.insert(22);
		bubleSort.insert(88);
		bubleSort.insert(11);
		bubleSort.insert(00);
		bubleSort.insert(66);
		bubleSort.insert(33);

		bubleSort.display();
		
		long start = new Date().getTime();
		bubleSort.sort();
		long end = new Date().getTime();
		System.out.println("Tempo: " + (end - start) +"ms");
		bubleSort.display();
	}

}
