/* 
 *
 *
 * 	WAP to take a number as input and print the Addition of Factorials of each
 * 	digit from the number.
 *
 * 	Input : 1234
 *
 * 	Output : Addition of factorials of each digit from 1234 = 33
 *
 */

import java.io.*;

class Q9_Digit_Factorial{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number");

		int x = Integer.parseInt(br.readLine());

		System.out.println("The number given is " + x);
		
		int sum = 0;

		int num = x;

		while(x!=0){

			int r = x%10;
			int fact = 1;

			while(r!=0){

				fact = fact * r;
				r--;

			}
			x = x/10;
			sum = sum + fact;
		}

		System.out.println(" The sum of factorial of all digits in a number " + num + " is : " + sum);
	}
   }


	
