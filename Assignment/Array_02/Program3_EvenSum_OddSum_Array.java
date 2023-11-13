/*WAP to find the sum of even and odd numbers in an array.
 * Display the sum value.
 *
 * Input : 11 12 13 1 4 15
 *
 * Output :
 *
 * Odd numbers sum : 39
 * Even numbers sum : 26
*/


import java.util.*;

class Program3_EvenSum_OddSum_Array{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of an Array");

		int size = sc.nextInt();
		
		int arr[] = new int[size];

		System.out.println("Enter the elements of an Array");

		for(int j = 0 ; j<size ; j++){

			arr[j] = sc.nextInt();

		}

		int even_sum = 0;
		int odd_sum = 0;

		for(int i = 0; i<size ; i++){

		if(arr[i]%2==0)
			even_sum = even_sum + arr[i];
		else
			odd_sum = odd_sum + arr[i];

		}

		System.out.println("Sum of even elements is " + even_sum);

		System.out.println("Sum of Odd elements is " + odd_sum);

	}
  }
