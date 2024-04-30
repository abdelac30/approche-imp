package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		      Scanner sc = new Scanner(System.in);
		      int[] array = new int[0];
		      int menu_value = 0;

		      System.out.println("*********** Menu ***********");
		      System.out.println("Option 1 : Ajouter un nombre");
		      System.out.println("Option 2 : Afficher les nombres existants.");
		      System.out.println("*****************************");
		      System.out.println("");

		      while (true) {
		        System.out.print("Veuillez choisir une option ");
		        menu_value = sc.nextInt();

		        switch (menu_value) {
		          case 1:
		            System.out.println("Entrer une valeur: ");
		            int[] result = addToArray(sc.nextInt(), array);
		            if (result != null) {
		              array = result;
		            }
		            break;
		          case 2:
		            showArrayContent(array);
		            break;
		          default:
		            System.out.println("Veuillez entrer une option valide");
		            break;
		        }
		      }
		    } catch (Exception e) {
		      System.out.println("");
		      System.out.println("Le programme est terminé.");
		    }
		  }

		 
		  static int[] addToArray(int value, int[] array) {
		    try {
		      array = Arrays.copyOf(array, array.length + 1);
		      array[array.length - 1] = value;

		      System.out.println("Nombre ajouté");

		      return array;
		    } catch (Exception e) {
		      System.out.println("Une erreur est survenue:");
		      System.out.println(e.getMessage());
		      return null;
		    }
		  }

		 
		  static void showArrayContent(int[] array) {
		    System.out.println(Arrays.toString(array));

	}

}
