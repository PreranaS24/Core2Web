/*	WAP to create an array of 'n' integer elements.
 *	Where 'n' value should be taken from the user.
 *	Insert the values from the users and find the sum of all elementsin the array.
 *
 *	Input:
 *	n = 6
 *	
 *	Enter elements in the array: 2 3 6 9 5 1
 *
 *	Output:
 *	26
 */

import java.util.*;

class Program1_SumOfArrayElements{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size");
		
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		int sum = 0;
		
		System.out.println("Enter Array Elements");

		for(int i = 0 ; i<size ; i++){

			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of array elements is " + sum);

	}
   }

