package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombreMystere = random.nextInt(100) + 1;

        System.out.println("Devinez le nombre mystère entre 1 et 100.");

        int nombreEssais = 0;
        boolean trouve = false;

        while (!trouve) {
            System.out.print("Entrez votre proposition : ");
            int proposition = scanner.nextInt();
            nombreEssais++;

            if (proposition == nombreMystere) {
                trouve = true;
            } else if (proposition < nombreMystere) {
                System.out.println("Le nombre mystère est plus grand.");
            } else {
                System.out.println("Le nombre mystère est plus petit.");
            }
        }

        System.out.println("Bravo, vous avez trouvé en " + nombreEssais + " coups !");
        scanner.close();

	}

}
