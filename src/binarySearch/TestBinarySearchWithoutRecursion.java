package binarySearch;

public class TestBinarySearchWithoutRecursion {

	public static void main(String[] args) {
		
		int[] array = {10,20,30,40,50,60,70,80,90,100};
		
		BinarySearchWithoutRecursion binarySearch = new BinarySearchWithoutRecursion();

		int index = binarySearch.exec(array, 90);
		
		System.out.println("Found at index " + index);
	}

}
