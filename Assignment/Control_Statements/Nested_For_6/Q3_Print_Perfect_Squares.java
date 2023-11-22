/* 
 *
 *
 *
 * 		WAP to take a range as input from the user and print perfect squares between that range.
 *
 * 		Input : Enter start : 1
 * 			Enter End : 100
 *
 * 		Output : Perfect Squares between 1 and 100.
 *
 */

import java.io.*;

class Q3_Perfect_Square{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start: ");

		int st = Integer.parseInt(br.readLine());

		System.out.println("Enter End: ");

		int end = Integer.parseInt(br.readLine());

		System.out.println("Perfect Squares between " + st + " and " + end + "are :" );

		for(int i = st; i<=end ; i++){

			for(int j =1 ; j<=i ; j++){

				if(j*j == i)
					System.out.println(i + " ");

			}
		}
      }
 }




