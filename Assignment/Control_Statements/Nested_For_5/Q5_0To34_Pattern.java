/* 
 *
 * 		WAP to print the following pattern
 *		Row = 4
 *
 * 		0
 * 		1	1		
 * 		2	3	5	
 * 		8	13	21	34
 * 		
 *
 * 	Use this loop strictly for the outer loop
 * 	int row;
 * 	Take the number of rows from user
 * 	for(int i = 1; i<=row ; i++){
 *
 * 	}
 */

import java.util.*;

class Q5_0to34_Pattern{

		public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row size.");

		int row = sc.nextInt();
		
		int x = 0, y = 1;
		
		for(int i = 1; i<=row ; i++){
		
		for(int j = 1; j<=i; j++){
				
				System.out.print(x + " ");
				int a = x + y;
				x = y;
				y = a;
		      }
	       		System.out.println();
		    }
		   }
		}	











