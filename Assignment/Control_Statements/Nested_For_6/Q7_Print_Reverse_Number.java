/*
 *
 *
 *
 * 		WAP to take range as input from the user anf print the reverse of all numbers.(Take a start 
 * 		and end number from a user)
 *
 * 		Input : Enter Start : 100
 * 			Enter End : 200
 *
 * 		Output : Reversed Numbers are :
 *
 */

import java.io.*;

class Q7_Reverse_Number{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Start: ");

		int st = Integer.parseInt(br.readLine());

		System.out.println("Enter End: ");

		int end = Integer.parseInt(br.readLine());

		System.out.println("Reveresed Numbers are :");

		for(int i = st; i<=end ; i++){

			int n = i;
			int r = 0;

			while(n !=0 ){

				int digit = n%10;
				r = r*10 + digit;
				n = n/10;

			}

			System.out.println(r);
		}
	}
  }


