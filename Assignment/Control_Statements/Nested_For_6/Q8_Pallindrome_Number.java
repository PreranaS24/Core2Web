/*
 *
 *
 *
 * 		WAP to take range as input from the user anf print Pallindrome numbers. 
 * 		( Take a start and end number from a user)
 *
 * 		Input : Enter Start : 100
 * 			Enter End : 250
 *
 * 		Output : Palindrome numbers between 100 and 250.
 *
 * 			101 111 121 131 141 151 161 171 181 191 202 212 222
 *
 */

import java.io.*;

class Q8_Pallindrome_Number{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Start :");

		int st = Integer.parseInt(br.readLine());

		System.out.println("Enter End :");

		int end = Integer.parseInt(br.readLine());

		System.out.println("Pallindrome Numbers between " + st + " and " + end + " are : ");

		for(int i = st; i<=end ; i++){

			int n = i;
			int r = 0;

			while(n != 0){

				int digit = n%10;
				r = r*10 + digit;
				n = n/10;
			}

			if(r == i)
				System.out.println(r);

	   }
	}
   }



