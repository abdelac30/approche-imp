package fr.algorithmie;

import java.util.Arrays;
import java.util.OptionalInt;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = { 0, 1, 2, 3 };
	    int temp = 0;

	    for (int i = 0; i < array.length - 1; i++) {
	      if (OptionalInt.of(array[i + 1]).isPresent()) {
	        temp = array[i + 1];
	        array[i + 1] = array[0];
	        array[0] = temp;
	      }
	    }
	    
	    System.out.println(Arrays.toString(array));

	}

}
