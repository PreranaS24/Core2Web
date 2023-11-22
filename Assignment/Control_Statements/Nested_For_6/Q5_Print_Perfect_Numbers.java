/* 
 *
 *
 *
 * 		WAP to take a range as input from the user and print perfect numbers between that range.
 *
 * 		{
 * 		Note: Perfect number is the one whose perfect divisor's addition is equal to taht number.
 * 		eg: - 6 is a perfect number = 1 + 2 + 3 = 6 }
 *
 * 		Input : Enter start : 1
 * 			Enter End : 30
 *
 * 		Output : Perfect Numbers between 1 and 30.
 * 			 6	28
 *
 *
 */

import java.io.*;

class Q5_Perfect_Number{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Start :");

		int st = Integer.parseInt(br.readLine());

		System.out.println("Enter End : ");

		int end = Integer.parseInt(br.readLine());

		System.out.println("Perfect numbers between " + st + " and " + end + " are : ");

	       for(int i = st; i<=end ; i++){

			int sum = 0;

			for(int j = 1; j<i ; j++){

		       if(i%j == 0)
			       sum = sum + j;

			}
	       

	       if(sum == i)
		       System.out.println(i + " ");
	       }
	}

  }
