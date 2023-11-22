/*
 *
 * 		WAP to print a series of strong numbers from entered range.
 * 		(Take a start and end numberfrom a user)
 *
 * 		Input : Enter Starting Number : 1
 * 			Enter Ending Number : 100
 *
 * 		Output : Strong numbers between and 150 
 * 			 1 2 145
 */

import java.io.*;

class Q9_Strong_Number{
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Start Number:");
		int st = Integer.parseInt(br.readLine());

		System.out.println("Enter End Number:");
		int end = Integer.parseInt(br.readLine());

		System.out.println("Strong Numbers " + "between " + st + " and " + end + " are : ");

		for(int i = st ; i<=end ; i++){
			
			int n = i;
			int sum = 0;

			while(n != 0){

				int digit = n%10;
				int fact = 1;
				
				for(int j =1; j<=digit ; j++)
					fact = fact * j;
					
				sum = sum + fact;
				n = n/10;
				
			}
			//	System.out.println("Sum is " + sum);
				if(sum == i)
					System.out.println(i);
			
		}
	    }
	}
				

