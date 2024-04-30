package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {6};
	    boolean first = false;
	    if (array.length == 0) {
	      System.out.println(first);
	    } else {
	      first = array[0] == 6 || array[array.length - 1] == 6;
	      System.out.println(first);
	    }

	}

}
