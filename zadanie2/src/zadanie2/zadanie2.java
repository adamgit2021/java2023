package zadanie2;

import java.util.Scanner;

public class zadanie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("podaj wyraz");

		Scanner scanner = new Scanner(System.in);

		String word = scanner.nextLine();
		

		
		for (int i = word.length()-1; i >= 0 ; i--) {

			  System.out.println(word.charAt(i));
		}
	}

}