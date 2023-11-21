/* 
 *
 * 		WAP to print the following pattern
 *
 * 		D4	C3	B2	A1
 * 		A1	B2	C3	D4
 * 		D4	C3	B2	A1
 * 		A1	B2	C3	D4
 *
 * 	Use this loop strictly for the outer loop
 * 	int row;
 * 	Take the number of rows from user
 * 	for(int i = 1; i<=row ; i++){
 *
 * 	}
 */

import java.util.*;

class Q1_D4_A1_Pattern{

		public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row size.");

		int row = sc.nextInt();

		System.out.println("Enter column size.");

		int col = sc.nextInt();

		char ch='D';

		int x = 4;

		for(int i = 1; i<=row ; i++){

		for(int j = 1; j<=col ; j++){

			System.out.print(ch + "" + x + " ");
			
			if(i%2 != 0){
				ch--;
				x--;
				}
			else{
				ch++;
				x++;
			}

		      }
	       		System.out.println();


			if(i%2 != 0){
				ch++;
				x++;
				}
			else{
				ch--;
				x--;
			}
		    }
		   }
		}	











