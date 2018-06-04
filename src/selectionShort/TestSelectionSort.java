package selectionShort;

import java.util.Date;

public class TestSelectionSort {

	public static void main(String[] args) {

		SelectionSort selectionSort = new SelectionSort();
		
		selectionSort.insert(99);
		selectionSort.insert(77);
		selectionSort.insert(44);
		selectionSort.insert(55);
		selectionSort.insert(22);
		selectionSort.insert(88);
		selectionSort.insert(11);
		selectionSort.insert(00);
		selectionSort.insert(66);
		selectionSort.insert(33);

		selectionSort.display();
		
		long start = new Date().getTime();
		selectionSort.sort();
		long end = new Date().getTime();
		System.out.println("Tempo: " + (end - start) +"ms");

	}

}
