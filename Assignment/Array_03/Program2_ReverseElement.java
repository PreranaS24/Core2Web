/* WAP to reverse each element in an array.
 * Take size and elements from the user
 *
 * Input: 10,25,252,36,564
 *
 * Output: 01,52,252,63,465
 *
 */

import java.io.*;

class Program2_ReverseElement{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of an array");

		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array elements");

		for(int i = 0 ; i<size ; i++)
			arr[i] = Integer.parseInt(br.readLine());

		for(int i = 0 ; i <size ; i++){
			
			int temp = arr[i];
			int rev = 0;

			while(temp != 0){

			int digit = temp%10;
			rev = rev*10 + digit;
			temp = temp/10;

		     }

		     System.out.println("Reverse Array Element is " + rev);
		}


	}
   }	
