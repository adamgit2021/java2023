package zadanie_godzina;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Zegar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int[] inputArray = new int[4];
		System.out.println("Podaj 4 cyfry");
		for (int i = 0; i < inputArray.length; i++) {
			
			inputArray[i] = sc.nextInt();
		}
		
		
		System.out.println("podane cyfry: ");
		System.out.println(Arrays.toString(inputArray));
		
		Arrays.sort(inputArray); 
		
		System.out.println("\nposortowane cyfry: ");
		System.out.println(Arrays.toString(inputArray));
		
				
		int [] resultArray = new int [4];
				
		
		ArrayList<Integer> inputArraylist= new ArrayList<Integer>(); 
		inputArraylist.add(inputArray[0]);
		inputArraylist.add(inputArray[1]);
		inputArraylist.add(inputArray[2]);
		inputArraylist.add(inputArray[3]);
		
		System.out.println(inputArraylist);
		
		//pierwsza cyfra
		//szukanie 2
		if(inputArraylist.get(0)==2) {
			resultArray[0]=2;
			inputArraylist.remove(0);
		}else if(inputArraylist.get(1)==2) {
			resultArray[0]=2;
			inputArraylist.remove(1);
		}else if(inputArraylist.get(2)==2) {
			resultArray[0]=2;
			inputArraylist.remove(2);
		}else if(inputArraylist.get(3)==2) {
			resultArray[0]=2;
			inputArraylist.remove(3);
		}
		//szukanie 1
		else if(inputArraylist.get(0)==1) {
			resultArray[0]=1;
			inputArraylist.remove(0);
		}else if(inputArraylist.get(1)==1) {
			resultArray[0]=1;
			inputArraylist.remove(1);
		}else if(inputArraylist.get(2)==1) {
			resultArray[0]=1;
			inputArraylist.remove(2);
		}else if(inputArraylist.get(3)==1) {
			resultArray[0]=1;
			inputArraylist.remove(3);
		}
		//szukanie 0
		else if(inputArraylist.get(0)==0) {
			resultArray[0]=0;
			inputArraylist.remove(0);
		}else if(inputArraylist.get(1)==0) {
			resultArray[0]=0;
			inputArraylist.remove(1);
		}else if(inputArraylist.get(2)==0) {
			resultArray[0]=0;
			inputArraylist.remove(2);
		}else if(inputArraylist.get(3)==0) {
			resultArray[0]=0;
			inputArraylist.remove(3);
		}
		
		//druga cyfra
		//szukanie 3		
		if(inputArraylist.get(0)==3) {
			resultArray[1]=3;
			inputArraylist.remove(0);
		}else if(inputArraylist.get(1)==3) {
			resultArray[1]=3;
			inputArraylist.remove(1);
		}else if(inputArraylist.get(2)==3) {
			resultArray[1]=3;
			inputArraylist.remove(2);
		}else if(inputArraylist.get(3)==3) {
			resultArray[1]=3;
			inputArraylist.remove(3);
		}
		//szukanie 2
		if(inputArraylist.get(0)==2) {
			resultArray[1]=2;
			inputArraylist.remove(0);
		}else if(inputArraylist.get(1)==2) {
			resultArray[1]=2;
			inputArraylist.remove(1);
		}else if(inputArraylist.get(2)==2) {
			resultArray[1]=2;
			inputArraylist.remove(2);
		}else if(inputArraylist.get(3)==2) {
			resultArray[1]=2;
			inputArraylist.remove(3);
		}
		//szukanie 1
		else if(inputArraylist.get(0)==1) {
			resultArray[1]=1;
			inputArraylist.remove(0);
		}else if(inputArraylist.get(1)==1) {
			resultArray[1]=1;
			inputArraylist.remove(1);
		}else if(inputArraylist.get(2)==1) {
			resultArray[1]=1;
			inputArraylist.remove(2);
		}else if(inputArraylist.get(3)==1) {
			resultArray[1]=1;
			inputArraylist.remove(3);
		}
		//szukanie 0
		else if(inputArraylist.get(0)==0) {
			resultArray[1]=0;
			inputArraylist.remove(0);
		}else if(inputArraylist.get(1)==0) {
			resultArray[1]=0;
			inputArraylist.remove(1);
		}else if(inputArraylist.get(2)==0) {
			resultArray[1]=0;
			inputArraylist.remove(2);
		}else if(inputArraylist.get(3)==0) {
			resultArray[1]=0;
			inputArraylist.remove(3);
		}
		System.out.print(resultArray[0]);
		System.out.print(resultArray[1]);
		System.out.print(':');
		System.out.print(resultArray[2]);
		System.out.print(resultArray[3]);
			}
		}		