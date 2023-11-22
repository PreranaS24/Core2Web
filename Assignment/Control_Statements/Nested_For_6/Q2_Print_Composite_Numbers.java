/*  
 *
 *
 *  		WAP to take range as input from the user and print composite numbers.
 *
 *
 *  		Input : Enter start : 1
 *  			Enter end : 20
 *
 *  		Output : Composite numbers between 1 and 20 
 *  			 4 6 8 9 10 12 14 16 18 20
 *
 */

import java.io.*;

class Q2_Composite_Number{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Start : ");

		int st = Integer.parseInt(br.readLine());

		System.out.println("Enter End : ");

		int end = Integer.parseInt(br.readLine());

		System.out.println("Composite numbers between " + st + " and " + end + " are : " );

		for(int i = st; i<=end ; i++){

			int cnt = 0;

			for(int j =1; j*j<=i ; j++){

				if(i%j == 0)
					cnt++;

			}

			if(cnt>=2)
				System.out.print(i + " ");
		}

		System.out.println();
	}
}


