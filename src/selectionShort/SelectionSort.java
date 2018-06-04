package selectionShort;

import java.util.ArrayList;
import java.util.List;

import sort.Sort;

public class SelectionSort implements Sort{
	
	private List<Integer> list;

	
	public SelectionSort() {
		
		this.list = new ArrayList<Integer>();
	}
	
	public void insert(Integer i) {
		
		this.list.add(i);
	}
	
	public void display () {
		
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}

	public void sort() {
		
		int left;
		int index;
		int minimoPosition;
		Integer minimo = 0;
		
		for (left = 0; left < this.list.size() - 1; left++) {
			
			minimo = this.list.get(left);
			
			minimoPosition = left;
			
			for(index = left; index < this.list.size(); index++) {
				
				if (index + 1 > this.list.size()) {//condição parada no fim da lista
					continue;
				}
				
				if (list.get(index) < minimo) {
					minimo = list.get(index);
					minimoPosition = index;
				}
			}
			
			swap(minimo, minimoPosition, list.get(left), left);
			
			display();
		}
	}

	private void swap(Integer integer1, int position1, Integer integer2, int position2) {
		
		this.list.remove(position1);
		this.list.add(position1, integer2);
		this.list.remove(position2);
		this.list.add(position2, integer1);
	}
	
}
