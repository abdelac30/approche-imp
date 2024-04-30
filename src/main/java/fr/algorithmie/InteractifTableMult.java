package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        boolean can_exit = false;

        System.out.println("***** Table de Multiplication *****");
        System.out.println("***********************************");

        while (!can_exit) {
            System.out.print("Entrez un nombre entre 1 et 10: ");
            int number = scanner.nextInt();

            if (number >= 1 && number <= 10) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(number + " x " + i + " = " + number * i);
                }
                can_exit = true;
            } else {
                System.out.println("Erreur: le nombre n'est pas entre 1 et 10, veuillez recommencer");
            }
        }
        scanner.close();
    }

	}


