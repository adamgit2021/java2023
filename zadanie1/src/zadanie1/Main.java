package zadanie1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("podaj wyraz");

Scanner scanner = new Scanner(System.in);

String word = scanner.nextLine();

char lastSign= word.charAt(word.length()-1);

int counter = 0;

for (int i = 0; i < word.length(); i++) {

  if(word.charAt(i)==lastSign)
  {
	  counter++;
  }
}

//test zmienne
//System.out.println("word: " + word + ", lastSign: " + lastSign + ", counter: " + counter);

System.out.println("ostatnia litera znajduje sie " + counter + "-razy");
	}

}