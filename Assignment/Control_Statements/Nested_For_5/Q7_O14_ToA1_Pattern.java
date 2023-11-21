/* 
 *
 * 		WAP to print the following pattern
 *		
 *		Row = 5;
 *
 * 		O
 * 		14	13	
 * 		L	K	J	
 * 		9	8	7	6
 * 		E	D	C	B	A
 *
 * 		Row = 4
 *
 *		10
 *		I	H
 *		7 	6	5
 *		D	C	B	A
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

class Q7_O14_ToA1_Pattern{

		public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row size.");

		int row = sc.nextInt();

		int a = (row*(row+1))/2;
		
		for(int i = 1; i<=row ; i++){

		for(int j = 1; j<=i; j++){

				if((i%2 == 1 && row%2 == 1) || (i%2 == 0 && row%2 == 0))
					System.out.print((char)(64+a) + " ");
				else
	       		System.out.print(a+" ");
				a--;
		    }
			System.out.println();
		   }
		}	
	   }










