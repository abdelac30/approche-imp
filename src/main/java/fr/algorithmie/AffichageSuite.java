package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
		
		int number = 1;
		for (int i = 0; i<10; i++) {
			System.out.println(number++);
		}
		
		//  Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
		for (int i = 0; i <= 10; i++) {
		    if (i % 2 == 0) {
		        System.out.println(i);
		    }
		}

		// Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
		
		for (int i = 0; i <= 10; i++) {
		    if (i % 2 == 1) {
		        System.out.println(i);
		    }
		}
		
		// Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
		
		int i = 1;
		while (i<11) {
			int o = i++;
			System.out.println(o);
		}
		
		//  Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus

		int p = 0;
		while (p <= 10) {
		    if (p % 2 == 0) {
		        System.out.println(p);
		    }
		    p++;
		}
		
		// Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus

		int b = 0;
		while (b <= 10) {
		    if (b % 2 == 1) {
		        System.out.println(b);
		    }
		    b++;
		}
		}
		
	}
