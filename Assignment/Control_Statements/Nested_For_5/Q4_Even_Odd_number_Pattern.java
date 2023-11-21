/* 
 *
 * 		WAP to print all even numbers in reverse order and odd numbers in the standard way.
 * 		Both separately. Within a range.Take the start and end from the user.
 *
 * 		Input : Enter start number - 2
 *			Enter End Number - 9
 *
 *		Output :
 *			8 6 4 2
 *			3 5 7 9
 *
 */

import java.util.*;

class Q4_Odd_Even_Pattern{

		public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Start Number");

		int start = sc.nextInt();
		
		System.out.println("Enter End Number");

		int end = sc.nextInt();
		
		for(int i = end; i>=start ; i--){

		if(i%2 == 0)
		System.out.print(i + " ");

		}
		
	       	System.out.println();

		for(int j = start; j<=end ; j++){
				
				if(j%2 != 0)
				System.out.print(j + " ");
		      }
		    
	       	System.out.println();

		   }
		}	











