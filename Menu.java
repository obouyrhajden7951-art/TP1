package com.example.java;
import java.util.Scanner;

public class Menu{
	public static int addition(int a , int b){
		return a+b;
	}
	public static int multiplication(int a , int b){
		return a*b;
	}

	public static double moyenne(int... valeurs){
		int total=0;
		for(int v:valeurs){
		total +=v;
		
		}return (double) total/valeurs.length;

	} 


	public static int maximum(int... valeurs){
		int max=valeurs[0];
		for(int v :valeurs){
			if(v>max){
				max=v;
		}
		}
		return max;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		int choix ;
		do {
			System.out.println("=== MENU PRINCIPAL ===");
        		System.out.println("1. Addition");
        		System.out.println("2. Multiplication");
			System.out.println("3. Moyenne");
			System.out.println("4. Trouver le plus grand");
        		System.out.println("0. Quitter");
			System.out.print("choisissez une option :");

			choix = sc.nextInt();
			System.out.println("tu as choisie :" + choix + ".");
			 

			switch (choix){
			case 1 -> { 
				System.out.print("Entrez deux entiers :");
				int a1=sc.nextInt();
				int b1=sc.nextInt();
				System.out.println("résultat :" + addition(a1,b1));
				}
			case 2 -> {
				System.out.print("Entrez deux entiers :");
				int a2=sc.nextInt();
				int b2=sc.nextInt();
				System.out.println("résultat :" + multiplication(a2,b2));
				}
			case 3 -> {
				System.out.print("Combien de Valeurs ? ");
        			int n = sc.nextInt();
        			int[] valeurs = new int[n];
        			for (int i = 0; i < n; i++) {
           				System.out.print("Valeur " + (i + 1) + " : ");
            				valeurs[i] = sc.nextInt();
        			}
        			System.out.println("Moyenne :" + moyenne(valeurs));
       				}
			case 4 -> {
				System.out.print("Combien de Nombres ? ");
        			int m = sc.nextInt();
       				int[] valeurs = new int[m];
        			for (int i = 0; i < m; i++) {
            				System.out.print("Valeur " + (i + 1) + " : ");
            				valeurs[i] = sc.nextInt();
        			}
        			System.out.println("Maximum : " + maximum(valeurs));
        			}	
			case 0 -> System.out.println("Fin du programme.");
			default-> System.out.println("Option invalide !");
		}
		}while (choix !=0);	
		
	}

}
