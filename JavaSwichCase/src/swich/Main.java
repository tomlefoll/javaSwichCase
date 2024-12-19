package swich;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// variables des produits du ditributeur 
		int cafe = 1;
		int cookie = 2;
		int soda = 3;
		int the = 4;
		int chocolat = 5;
		int eau = 6; 
		int siropDeFraise = 7;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Choisissez votre article" );
		int userInput = input.nextInt();
		
		System.out.println("Choisissez votre article" );
		
		
		switch(userInput){
			case 1:
				System.out.println("votre café est pret");
				break;
			case 2:
				System.out.println("les coockie sont trop bon");
				break;
			case 3:
				System.out.println("Votre soda est tres froid");
				break;
			case 4:
				System.out.println("votre the est chaud");
				break;
			case 5:
				System.out.println("votre chocolat  est pret");
				break;
			case 6:
				System.out.println("votre eau est la");
				break;
			case 7:
				System.out.println("le sirop est prêt");
				break;

		}
		

	}

}
