/*WAP to find the numbers of even and odd integers in a given array of integers
 *
 * Input: 1 2 5 4 6 7 8
 *
 * Output:
 *
 * Number of even elements : 4
 * Number of Odd elements : 3
*/


import java.util.*;

class Program2_CountEvenOddArrayElements{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of an Array");

		int size = sc.nextInt();
		
		int arr[] = new int[size];

		System.out.println("Enter the elements of an Array");

		for(int j = 0 ; j<size ; j++){

			arr[j] = sc.nextInt();

		}

		int even_count = 0;
		int odd_count = 0;

		for(int i = 0; i<size ; i++){

		if(arr[i]%2==0)
			even_count++;
		else
			odd_count++;

		}

		System.out.println("Count of even elements is " + even_count);

		System.out.println("Count of Odd elements is " + odd_count);

	}
  }
