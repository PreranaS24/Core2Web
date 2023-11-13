/*	WAP  to print the second min element from an array.
 *	
 *	Input : Enter Array Element : 255 2 1554 15 65 95 89
 *
 *	Output : 15
 *
 */


import java.io.*;

class Program10_SecondMin_Element{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");

		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array elements");	

		for(int i = 0; i<size ; i++)
			arr[i] = Integer.parseInt(br.readLine());

		int secondMin = arr[0];
		int min = arr[0];

		for(int i = 0; i<size ; i++){
			
			if(arr[i] < min)
				min = arr[i];
			else 
				secondMin = arr[i];	

		}		

			
		System.out.println("Enter Min Array element " + min);	
		
		for(int i = 0; i<size ; i++){
			
		   //if(arr[i] < secondMin && arr[i] != min){

		   if(secondMin > arr[i] && arr[i] > min){
			   secondMin = arr[i];
			   System.out.println("Second Min Element is  " + arr[i]);
		   }
 		}	
	  }
	}	
