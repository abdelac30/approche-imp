package fr.declaration.variable;

import java.util.Arrays;

public class DeclarationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 6;
		short x = -455;
		int i = 047;
		long l = 20000L;
		float f = 2.5f;
		double d = 3.3D;
		char c = 'c';
		boolean m = true;
		String g = "bonjour";
		
		System.out.println(b); 
		System.out.println(x);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(m);
		System.out.println(g);
		
		int[] tableau = {8,-7,12, 1, -2, 14,17, 9};
		System.out.println(tableau[0]);
		System.out.println(tableau.length);
		System.out.println(tableau[5]);
		// l'affichage de l'entier 10 echoue car le tableau commence par l'index 0


		String[] ville = {"nimes", "marseille", "lyon", "lens", "nice"};
		System.out.println(Arrays.toString(ville));
	}

}
