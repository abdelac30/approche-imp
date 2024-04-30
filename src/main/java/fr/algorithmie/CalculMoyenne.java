package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		// Quelle est la moyenne des éléments du tableau ?
		
		int somme = 0;
		for(int nombre : array) {
			somme += nombre;
		}
		
		double moyenne = (double) somme / array.length;
		System.out.println("La moyenne des éléments du tableau est : " + moyenne);




	}

}
