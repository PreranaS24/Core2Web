/* 
 *
 *
 *
 * 		WAP to take a range as input from the user and print perfect cubes between that range.
 *
 * 		Input : Enter start : 1
 * 			Enter End : 100
 *
 * 		Output : Perfect Squares between 1 and 100.
 *
 */

import java.io.*;

class Q4_Perfect_Cube{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Start :");

		int st = Integer.parseInt(br.readLine());

		System.out.println("Enter End :");

		int end = Integer.parseInt(br.readLine());

		System.out.println("Perfect Cubes between " + st + " and " + end + " are : " );

		for(int i = st; i<=end ; i++){

			for(int j = 1; j*j*j<=i ; j++){

				if(j*j*j == i)
					System.out.println(i + " ");

			}
		}


	}
}



			
