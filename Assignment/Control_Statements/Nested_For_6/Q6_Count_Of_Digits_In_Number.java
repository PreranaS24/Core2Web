/*
 *
 *
 * 		WAP to take 5 numbers as input from the user and print the count of digits in those numbers.
 *
 * 		Input: Enter 5 numbers :
 * 		5
 * 		Output : The digit count of 5 is 1.
 *
 * 		25
 * 		Output : The digit count of 25 is 2.
 *
 * 		225
 * 		Output : The digit count of 225 is 3.
 *
 * 		6548
 * 		Output : The digit count of 6548 is 4.
 *
 * 		852347
 * 		Output : The digit count of 852347 is 6.
 *
 *
 */

import java.io.*;

class Q6_Count_Digit{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Print the count of numbers you are going to pass");

		int tot_num = Integer.parseInt(br.readLine());

		int cnt = 0;

		do{

			System.out.println("Enter Number :");
			int n = Integer.parseInt(br.readLine());

			int tmp = n;
			int ct = 0;

			while(tmp != 0){
					
					ct++;
					tmp = tmp/10;
			}

			System.out.println("The digit count of " + n + " is " + ct);

			cnt++;

		}while(cnt != tot_num);

	}
}




