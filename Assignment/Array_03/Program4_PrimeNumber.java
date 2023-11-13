/* WAP to find the prime number from an array and return its index.
 * Take size and elements from the user.
 *
 * Input: 10 25 36 566 34 53 50 100
 *
 * Output: Prime no 53 found at index: 5
 *
 */


import java.io.*;

class Program4_PrimeNumber{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");
		
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];

		System.out.println("Enter Array Elements");

		for(int i = 0 ; i<size ; i++)
			arr[i] = Integer.parseInt(br.readLine());

		for(int i = 0 ; i<size ; i++){

			int temp = arr[i];
			int count = 0;

			for(int j = 1; j<=temp ; j++){

			if(temp%j == 0)
				count++;
			}


			if(count == 2)
				System.out.println("Prime no " + arr[i] + " found at index: " + i);
		}

	}

  }
