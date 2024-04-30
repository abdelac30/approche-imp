package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
		
		int[] arrayCopy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
		    arrayCopy[i] = array[array.length - 1 - i];
		    
		}
		
		// Afficher l’ensemble des éléments des 2 tableaux
		System.out.println("Elements de array:");
		for (int element : array) {
		    System.out.println(element);
		}

		System.out.println("Elements de arrayCopy:");
		for (int element : arrayCopy) {
		    System.out.println(element);
	}

}
}
