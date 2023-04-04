package zadanie3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String a = sc.nextLine();
        int h = a.length();

        int kk = 0;
        int k = (h - 1);
        for (int i = 0; i < h; i++) {

            if (a.charAt(i) != a.charAt(k)) {
                kk = 1;
                break;
            }
            k--;
        }

        if (kk == 1)
            System.out.println("Nie jest palindromem");
        else {
            System.out.println("Jest palindromem");
        }

	}

}
