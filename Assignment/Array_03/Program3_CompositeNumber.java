/* WAP to find a composite number from an array and return its index.
 * Take size and elements from the user.
 *
 * Input 1 2 3 5 6 7
 *
 * Output: Composite 6 found at index: 4.
 */

import java.io.*;

class Program3_CompositeNumber{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");

		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter Array elements");

		int arr[] = new int[size];

		for(int i = 0; i<size ; i++)
			arr[i] = Integer.parseInt(br.readLine());
			
		for(int i = 0; i<size ; i++){
			
			int temp = arr[i];

			int count = 0;

			for(int j = 1; j<=temp ; j++){

				if(temp%j == 0)
					count++;
			}

			if(count > 2)
				System.out.println("Composite number " + temp + " is found at index: " + i);

		}

     }
  }
