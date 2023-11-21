/* 
 *
 * 		WAP to print the following pattern
 *
 * 		5	4	3	2	1
 * 		8	6	4	2	
 * 		9	6	3	
 * 		8	4
 * 		5	
 *
 * 	Use this loop strictly for the outer loop
 * 	int row;
 * 	Take the number of rows from user
 * 	for(int i = 1; i<=row ; i++){
 *
 * 	}
 */

import java.util.*;

class Q3_5To1_Pattern{

		public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row size.");

		int row = sc.nextInt();
		
		for(int i = 1; i<=row ; i++){

		int x = row - i + 1;
		
		for(int j = row; j>=i; j--){

				System.out.print(x*i + " ");
				x--;
		      }
	       		System.out.println();
		    }
		   }
		}	











