/*	WAP  to find a ArmStrong number from an array and return its index.
 *	Take size and elements from the user.
 *
 *	Input : 10 25 252 36 153 55 89
 *
 *	Output : ArmStrong no 153 found at index: 4
 *
 *	Note: An ArmStrong Number is the number which forms the total of the same number, when each of its digits is raised to the power of the number of digits in the 	      number.
 *		eg:- 153 is a strong number. Since , 1 + 125 + 27 = 153
 *
 */


import java.io.*;

class Program8_ArmStrongNumber{

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
			int M = N;
			int sum = 0;
			int count = 0;

			while(N != 0){
				
				count++;
			 	int digit = N%10;
				N = N/10;

			}
			while(M != 0){
				
				int digit = M%10;
				int power = 1;
						
			 for(int j = 1 ; j<=count; j++){
				
				 power = power * digit;
				 
			 }
			  M = M/10;
			  sum = sum + power;
		   }		 

		   if(sum == arr[i])
			   System.out.println("ArmStrong no " + sum + " found at index: " + i);
		}
	  }
	}	
