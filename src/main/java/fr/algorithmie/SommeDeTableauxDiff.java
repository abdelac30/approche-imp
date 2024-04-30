package fr.algorithmie;

import java.util.Arrays;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
	    int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };
	    int[] array3 = {};

	    for (int i = 0; i < array1.length; i++) {
	      array3 = Arrays.copyOf(array3, array3.length + 1);
	      boolean test = array2.length <= (i);

	      if (!test) {
	        array3[i] = array1[i] + array2[i];
	      }else{
	        array3[i] = array1[i];
	      }
	    }

	    System.out.println(Arrays.toString(array3));
	  }


	}


