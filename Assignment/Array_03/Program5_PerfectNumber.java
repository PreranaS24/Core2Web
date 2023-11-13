/* WAP to find a Perfect Number from an array and returnits index.
 * Take size and elements from the user.
 * 
 * Input : 10 25 252 496 564
 *
 * Output : Perfect no 496 found at index: 3
 *
 * Note : A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
 * eg: - 6 is a perfect number.  1,2 and 3 (excluding itself i.e. 6) and 1 + 2 + 3 = 6, so 6 is a perfect number.
 *
 */

import java.io.*;

class Program5_PerfectNumber{

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
			int mod_sum = 0;


			for(int j = 1 ; j<temp ; j++){

				if(temp%j == 0)
					mod_sum = mod_sum + j;

			}

			if(mod_sum == temp)
				System.out.println("Perfect no " + temp + " found at index: "  + i);

		}				

	}

    }
