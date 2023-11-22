/*
 *
 * 		WAP  to take a range as input from the user and print Armstrong numbers
 * 		(Take a start and end number from a user)
 *
 * 		Input : Enter start: 1
 * 			Enter End : 1650
 *
 * 		Output : Armstrong numbers between 1 and 1650
 * 			 1 2 3 4 5 6 7 8 9 153 370 371 407 1634
 *
 */

import java.io.*;

class Q10_Armstrong_Number{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Start :");

		int st = Integer.parseInt(br.readLine());

		System.out.println("Enter End :");

		int end = Integer.parseInt(br.readLine());

		System.out.println("Armstrong Numbers are : ");

		for(int i = st ; i<=end ; i++){

			int N = i;
			int M = i;
			
			int sum = 0;
			int count = 0;

			//System.out.println("Number is " + i);

			while(N != 0){

				count++;
				int digit = N%10;
				N = N/10;

			}
			
			//System.out.println("Count is " + count);

			while(M != 0){

				int digit = M%10;
				int power = 1;

				for(int j = 1; j<=count ; j++){

					power = power * digit;
				}
				M = M/10;
				sum = sum + power;

			//System.out.println("Sum is " + sum);

			}

			if(sum == i)
				System.out.print(i + " ");
			}
		System.out.println();
		}
  	}
