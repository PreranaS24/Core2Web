/*
 *
 *
 * 	WAP to print a series of prime numbers from entered page. ( Take a start and end number from a user )
 * 	Perform dry run at least from 10 to 20 ..
 *
 * 	Input : 
 *		Enter starting number : 10 
 *		Enter ending number : 100
 *
 *	Output :
 *
 *		Series = 11 13 17 19 .... 89 97
 *
 *
 */

import java.io.*;

class Q10_PrimeNumber_Range{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Start and End Range");

		int st = Integer.parseInt(br.readLine());

		int end = Integer.parseInt(br.readLine());

		System.out.println("Prime number Series");

		for(int i = st ; i<=end ; i++){

			int count = 0;

			for(int j = 1 ; j*j<i ; j++){

				if(i%j == 0)
					count = count + 2;
				if(count > 2)
					break;
			}

			if(count <= 2 && i!=1 )
			       System.out.print(i+" ");
		}
	System.out.println();
	}
    }	


