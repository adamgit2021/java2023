import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String s = sc.nextLine();
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)))
                sum=sum+Character.getNumericValue(s.charAt(i));
        }
        System.out.println("Wynik: "+sum);
    }
}