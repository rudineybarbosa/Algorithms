package binarySearch;

public class BinarySearchWithoutRecursion {

//	1 3 4 7 9 10 11 14 17
	public int exec(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		int medium;
		
		int steps = 0;
		
		if(array.length == 0)
			return -1;
		
		if(array.length == 1)
			return array[0];
		
		while(low <= high) {
			medium = (int) (Math.floor((low + high)/2));

			if(array[medium] == key) {
				System.out.println("Steps: " + steps);
				return medium;
			}
			
			if(key < array[medium]) {
				high = medium - 1;
			} else {
				low = medium + 1;
			}
			
			steps++;
		}
		
		System.out.println("Steps: " + steps);
		return -1;
	}
}
