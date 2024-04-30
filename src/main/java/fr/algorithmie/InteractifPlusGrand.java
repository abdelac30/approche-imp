package fr.algorithmie;

import java.util.Scanner;


public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir 10 nombres :");
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");
            int nombre = scanner.nextInt();

            if (nombre > max) {
                max = nombre;
            }
        }

        System.out.println("Le plus grand nombre saisi est : " + max);

        scanner.close();

	}

}
