/* WAP to find a palindrome number from an array and return its index.
 * Take size and elements from user.
 *
 * Input : 10 25 252 36 564
 *
 * Output : Palindrome no 252 found at index: 2
 *
 * Note : A Palindrome number is a number that remains the same when its digits are reversed.
 * 		eg : - 1234321
 *
 */

import java.io.*;


class Program6_PalindromeNumber{

   public static void main(String[] args) throws IOException{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   System.out.println("Enter Array Size");

	   int size = Integer.parseInt(br.readLine());

	   int arr[] = new int[size];

	   System.out.println("Enter Array Elements ");

	   for(int i = 0 ; i<size ; i++)
		   arr[i] = Integer.parseInt(br.readLine());


	   for(int i = 0 ; i<size ; i++){

		int temp = arr[i];
		int rev = 0;

		while(temp != 0){
		
			int num = temp%10;
			rev = rev * 10 + num;
			temp = temp/10;
		
	     }

	     if ( rev == arr[i])
		     System.out.println("Palindrome no " + rev + " found at index: " + i);
   	  }
       }
   }
