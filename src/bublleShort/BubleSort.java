package bublleShort;

import java.util.ArrayList;
import java.util.List;

import sort.Sort;

public class BubleSort implements Sort{
	
	private List<Integer> list;

	
	public BubleSort() {
		
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
		int right;
		
		for (right = this.list.size(); right > 1; right--) {
			
			for(left = 0; left < this.list.size(); left++) {
				
				if (left + 1 >= this.list.size()) {//condição parada no fim da lista
					continue;
				}
				
				if (list.get(left) > list.get(left + 1)) {
					swap (list.get(left), left, list.get(left + 1), left+1);
					display();
				}
			}
		}
	}

	private void swap(Integer integer1, int position1, Integer integer2, int position2) {
		
		this.list.remove(position1);
		this.list.add(position1, integer2);
		this.list.remove(position2);
		this.list.add(position2, integer1);
		
		
	}
	
}
