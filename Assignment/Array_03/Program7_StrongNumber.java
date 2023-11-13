/*	WAP  to find a Strong number from an array and return its index.
 *	Take size and elements from the user.
 *
 *	Input : 10 25 252 36 564 145
 *
 *	Output : Strong no 145 found at index: 5
 *
 *	Note: A Strong Number is a special number whose sum of the factorial of digits is equal to the original number.
 *		eg:- 145 is a strong number. Since 1! + 4! + 5! = 145.
 *
 */


import java.io.*;

class Program7_StrongNumber{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");

		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array elements");	

		for(int i = 0; i<size ; i++)
			arr[i] = Integer.parseInt(br.readLine());

		for(int i = 0; i<size ; i++){
			
			int N = arr[i];
			int sum = 0;

			while(N != 0){
			
			 int fact = 1;

			 int digit = N%10 ;
			 for(int j = 1 ; j<=digit ; j++){
				
				 fact = fact * j;

			 }
			  N = N/10;
			  sum = sum + fact;
		   }		 

		   if(sum == arr[i])
			   System.out.println("Strong no " + sum + " found at index: " + i);
		}
	  }
	}	
