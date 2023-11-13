/*	WAP  to print the second max element from an array.
 *	
 *	Input : Enter Array Element : 2 255 2 1554 15 65
 *
 *	Output : 255
 *
 */


import java.io.*;

class Program9_SecondMax_Element_AnotherApproach{

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

		if(size>2){

		for(int i = 0; i<size ; i++){
		
		for(int j = i+1; j<size ; j++){

			if(arr[i] > arr[j]){
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
		           }
		        }		 
		
	              }
	            }

		else{

			   System.out.println("You have entered the size of  " + size);
		     }
			
			   System.out.println("Second Max Element is  " + arr[arr.length-2]);
	  }
	}	
