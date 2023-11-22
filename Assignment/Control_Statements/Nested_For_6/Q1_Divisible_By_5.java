/* 
 *
 *
 * 		WAP to print the numbers divisible by 5 from 1 to 50 & the number is even 
 * 		also print the count of even numbers.
 *
 * 		Input : Enter the lower limit : 1
 * 			Enter the upper limit : 50 
 *
 * 		Output : 10,20,30,40,50\
 * 		Count : 5
 *
 */

import java.io.*;

class Q1_Divisible_By_5{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Lower Limit :");

		int ll = Integer.parseInt(br.readLine());

		System.out.println("Enter Lower Limit :");

		int ul = Integer.parseInt(br.readLine());

		System.out.println("The numbers between " + ll + " and " + ul + " and are divisible by 5 and even numbers are : ");

		int cnt = 0;

		for(int i = ll ; i<=ul ; i++){

			if(i%5==0 && i%2==0){

				cnt++;
				System.out.print(i + " ");

			}
		}

		System.out.println();

		System.out.println("The count of such numbers is :" + cnt );

		System.out.println();
	}
   }

