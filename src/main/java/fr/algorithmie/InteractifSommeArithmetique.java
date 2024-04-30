package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
		    int total = 0;
		    System.out.println("Entrez un nombre: ");
		    
		    int num = scanner.nextInt();
		    scanner.close();
		    
		    for (int i = 1; i <= num; i++) {
		      total += i;
		    }
		    
		    System.out.println(total);

	}

}
