package zadanie1_20230509;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	static void liczZnakiSlowa() {
		String str;
		int whitespace=0;
		
		Scanner scan=new Scanner(System.in); 
		    
		System.out.println("Enter the String  ");
		str=scan.nextLine();

		//char counter
		int stringSize= str.length();
		//System.out.println("Total chars : "+stringSize);
			 
		
		int i=0; 
		while(i<str.length()){
		char ch=str.charAt(i);
			if(ch==' ' || ch=='\n' || ch=='\r' || ch=='\t'){
		        whitespace++;
		    }
		     i++;
		}
		//System.out.println("Total white spaces : "+whitespace);
		
		
		int countWords = str.split("\\s").length;
		//System.out.println("Total words: "+countWords);
		
		int [] result= {stringSize, whitespace, countWords};
		System.out.println(Arrays.toString(result));
	}
	
	public static void main(String[] args) {
		liczZnakiSlowa();				
		}	
	}