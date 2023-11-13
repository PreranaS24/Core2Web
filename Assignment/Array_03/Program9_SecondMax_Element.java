/*	WAP  to print the second max element from an array.
 *	
 *	Input : Enter Array Element : 2 255 2 1554 15 65
 *
 *	Output : 255
 *
 */


import java.io.*;

class Program9_SecondMax_Element{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");

		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array elements");	

		for(int i = 0; i<size ; i++)
			arr[i] = Integer.parseInt(br.readLine());

		int secondMax = arr[0];
		int max = arr[0];

		for(int i = 0; i<size ; i++){
			
			if(arr[i] < max)
				secondMax = arr[i];
			else 
				max = arr[i];

		}		 
		
		for(int i = 0; i<size ; i++){
			
		   if((secondMax < arr[i]) && (arr[i] < max))
			   System.out.println("Second Max Element is  " + arr[i]);
 		}	
	  }
	}	
