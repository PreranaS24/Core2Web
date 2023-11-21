/* 
 *
 * 		WAP to print the following pattern
 *
 * 		#	=	=	=	=
 * 		=	#	=	=	=
 * 		=	=	#	=	=
 * 		=	=	=	#	=
 * 		=	=	=	=	#
 *
 * 	Use this loop strictly for the outer loop
 * 	int row;
 * 	Take the number of rows from user
 * 	for(int i = 1; i<=row ; i++){
 *
 * 	}
 */

import java.util.*;

class Q2_Hash_EqualTo_Pattern{

		public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row size.");

		int row = sc.nextInt();

		System.out.println("Enter column size.");

		int col = sc.nextInt();

		for(int i = 1; i<=row ; i++){

		for(int j = 1; j<=col ; j++){

			if(i == j)
				System.out.print("#" + " ");
			else
				System.out.print("=" + " ");		
		      }
	       		System.out.println();
		    }
		   }
		}	











