package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 2};
	    boolean first = false;

	    if (array.length == 0) {
	      System.out.println(first);
	    }
	    if (array.length > 1) {
	      first = array[0] == array[array.length - 1];
	      System.out.println(first);
	    }else {
	      System.out.println(first);
	    }

	}

}
